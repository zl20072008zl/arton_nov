import { Component, OnInit }    from '@angular/core';
import { NgbModalRef }          from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager }      from 'ng-jhipster';
import { Router }               from '@angular/router';
import { Observable }           from 'rxjs/Observable';
import { map }                  from 'rxjs/operator/map';
import { debounceTime }         from 'rxjs/operator/debounceTime';
import { distinctUntilChanged } from 'rxjs/operator/distinctUntilChanged';

import { Account, LoginModalService, Principal } from '../shared';
import {CountryListService} from '../services/country-list.service';
import {CpService} from '../services/cp/cp.service';
import {LocalStorageService} from 'ng2-webstorage';
import {UpsService} from '../services/ups/ups.service';
import {FedexService} from '../services/fedex/fedex.service';
import {ShipmentRequest} from '../shipment/shipment.model';
import {Address} from "../entities/address/address.model";
import {Item} from "../entities/item/item.model";
import {Service} from "../entities/service/service.model";

@Component({
    selector: 'jhi-home',
    templateUrl: './home.component.html',
    styleUrls: [
        'home.css'
    ]

})

export class HomeComponent implements OnInit {
    account: Account;
    modalRef: NgbModalRef;
    trackingNumber: string;
    rates: ShipmentRequest;
    countries: any = [];
    states:any = [];
    senderStates:any = [];

    constructor(
        private principal: Principal,
        private loginModalService: LoginModalService,
        private eventManager: JhiEventManager,
        private router: Router,
        private countryService: CountryListService,
        private cpService: CpService,
        private localStorageService: LocalStorageService,
        private upsService: UpsService,
        private fedexService: FedexService,
    ) {
    }

    ngOnInit() {
        this.principal.identity().then((account) => {
            this.account = account;
            if (this.account) {
                this.localStorageService.clear('shipment.request.data.' + this.account.login);
                this.localStorageService.clear('shipment.rates.data.' + this.account.login);
            }
        });
        this.reset();
        this.registerAuthenticationSuccess();
        this.getCountries();
        this.getSenderStates();
    }

    registerAuthenticationSuccess() {
        this.eventManager.subscribe('authenticationSuccess', (message) => {
            this.principal.identity().then((account) => {
                this.account = account;
                if (this.account) {
                    this.localStorageService.clear('shipment.request.data.' + this.account.login);
                    this.localStorageService.clear('shipment.rates.data.' + this.account.login);
                }
            });
        });
    }

    isAuthenticated() {
        return this.principal.isAuthenticated();
    }

    login() {
        this.modalRef = this.loginModalService.open();
    }

    track() {
        this.router.navigate(['/tracking', this.trackingNumber]);
    }

    getCountries() {
        this.countryService.getCounties()
            .subscribe((countries) => this.countries = countries);
    }

    getSenderStates() {
        this.countryService.getStates("CA")
            .subscribe((states) => {
                this.senderStates = states;
            });
    }

    getRates() {
        // if (this.isAuthenticated()) {
            Observable.forkJoin(
                this.cpService.getCpRates(this.rates),
                //this.upsService.getTnt(this.rates),
                this.fedexService.getRate(this.rates)
            ).subscribe(
                (data) => {
                    let localServices: any = [];
                    localServices = localServices.concat(data[0]);
                    //localServices = localServices.concat(data[1]);
                    localServices = localServices.concat(data[1]);

                    localServices = localServices.sort(function(a, b) {
                        return a.price - b.price;
                    });
                    console.log(localServices);
                    // this.localStorageService.store('shipment.rates.data.' + this.account.login, localServices);
                    // this.localStorageService.store('shipment.request.data.' + this.account.login, this.rates);
                    this.localStorageService.store('shipment.rates.data.', localServices);
                    this.localStorageService.store('shipment.request.data.', this.rates);
                    this.router.navigate(['/rates']);
                },
                (err) => console.error(err)
            );
        // } else {
        //     this.registerAuthenticationSuccess();
        // }
    }

    setCountryCode() {
        this.rates.recipient.countryCode = this.countries.filter((v) => v.name == this.rates.recipient.country)[0].value;
        this.countryService.getStates(this.rates.recipient.countryCode)
            .subscribe((states) => {
                this.states = states;
                this.rates.recipient.province = '';
                this.rates.recipient.provinceCode = '';
            });
    }

    setProvinceCode(type: string) {
        if (type == 'sender') {
            this.rates[type].provinceCode = this.senderStates.filter((v) => v.name == this.rates.sender.province)[0].value;
        } else {
            this.rates[type].provinceCode = this.states.filter((v) => v.name == this.rates.recipient.province)[0].value;
        }
    }

    reset() {
        this.rates = new ShipmentRequest();
        this.rates.sender = new Address();
        this.rates.recipient = new Address();
        this.rates.parcel = new Item();
        this.rates.service = new Service();
        this.rates.sender.country = 'Canada';
        this.rates.sender.countryCode = 'CA';
        this.rates.parcel.type = 'Customer Package';
        this.rates.parcel.unit = 'KGS';
    }
}
