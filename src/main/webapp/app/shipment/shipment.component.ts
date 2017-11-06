import {Component, OnInit} from '@angular/core';
import {Principal} from '../shared/auth/principal.service';
import {ShipmentRequest} from './shipment.model';
import {Observable} from 'rxjs/Observable';
import {CountryListService} from '../services/country-list.service';
import {ActivatedRoute} from '@angular/router';
import {LocalStorageService} from 'ng2-webstorage';
import {Account} from '../shared/user/account.model';
import {Address} from '../entities/address/address.model';
import {Item} from '../entities/item/item.model';
import {Service} from '../entities/service/service.model';
import {Order} from '../entities/order/order.model';
import {Promotion} from '../entities/promotion/promotion.model';
import {Receipt} from '../entities/receipt/receipt.model';
import {Label} from '../entities/label/label.model';

@Component({
    selector: 'jhi-shipment',
    templateUrl: './shipment.component.html',
    styleUrls: [
        'shipment.style.css'
    ]
})
export class ShipmentComponent implements OnInit {

    private account: Account;

    public steps: string[] = ['address', 'item', 'service', 'details', 'payment', 'label'];
    public currentStep = 0;
    public request: ShipmentRequest;
    public countries: any = [];
    public sender_states: any = [];

    constructor(
        private principal: Principal,
        private countryService: CountryListService,
        private activatedRoute: ActivatedRoute,
        private localSt: LocalStorageService
    ) {

    }

    ngOnInit(): void {
        this.principal.identity()
            .then((account) => {
                this.account = account;

                this.activatedRoute.params.subscribe((params) => {
                    if (params && params.step ) {
                        if (this.steps.indexOf(params.step) >= 0){
                            this.currentStep = this.steps.indexOf(params.step);
                        }
                    } else {
                        this.currentStep = 0;
                    }
                });
            });

        this.init();
    }

    private init(): void {
        Observable.forkJoin(
            this.countryService.getCounties(),
            this.countryService.getStates('CA')
        ).subscribe(
            (data) => {
                this.countries = data[0];
                this.sender_states = data[1];

                this.request = this.localSt.retrieve('shipment.request.data.' + this.account.login) || new ShipmentRequest();

                if (!this.request.user) {
                    this.request.user = this.account;
                }

                if (!this.request.sender) {
                    this.request.sender = new Address();
                }
                if (!this.request.recipient) {
                    this.request.recipient = new Address();
                }
                if (!this.request.parcel) {
                    this.request.parcel = new Item();
                }
                if (!this.request.service) {
                    this.request.service = new Service();
                }
                if (!this.request.order) {
                    this.request.order = new Order();
                }
                if (!this.request.promotion) {
                    this.request.promotion = new Promotion();
                }
                if (!this.request.receipt) {
                    this.request.receipt = new Receipt();
                }
                if (!this.request.label) {
                    this.request.label = new Label();
                }
            },
            (err) => console.error(err)
        );
    }
}
