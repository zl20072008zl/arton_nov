import {Component, Input, OnInit, Output, EventEmitter, DoCheck} from '@angular/core';
import {CountryListService} from '../../services/country-list.service';
import {Address} from '../../entities/address/address.model';
import {AddressService} from '../../services/entities/address.service';
import {Observable} from 'rxjs/Observable';
import {LocalStorageService} from 'ng2-webstorage';
import {Router} from '@angular/router';

@Component({
    selector: 'shipment-address-component',
    templateUrl: './address.component.html',
    styles: []
})
export class ShipmentAddressComponent implements OnInit, DoCheck {

    @Input() request: any;
    @Input() countries: any;
    @Input() senderStates: any;

    @Output() requestChange: EventEmitter<any> = new EventEmitter();

    public recipientStates: any = [];
    public addresses: Address[] = [];
    public senderAddresses: Address[] = [];

    constructor(
        private countryService: CountryListService,
        private addressService: AddressService,
        private router: Router,
        private localSt: LocalStorageService
    ) { }

    ngOnInit() {
        if (!this.request.sender) {
            this.request.sender = new Address();
        }

        if (!this.request.recipient) {
            this.request.recipient = new Address();
        }

        if (!this.request.sender.country) {
            this.request.sender.country = 'Canada';
        }

        if (!this.request.sender.countryCode) {
            this.request.sender.countryCode = 'CA';
        }

        if (!this.request.recipient.country) {
            this.request.recipient.country = 'Canada';
        }

        if (!this.request.recipient.countryCode) {
            this.request.recipient.countryCode = 'CA';
        }

        Observable.forkJoin([
            this.countryService.getStates(this.request.recipient.countryCode),
            this.addressService.query(),
            this.addressService.findByUser(this.request.user.login)
        ]).subscribe(
            (data) => {
                if (this.request.user.authorities.indexOf('ROLE_ADMIN') >= 0) {
                    this.addresses = data[1].json;
                } else {
                    this.addresses = data[2].json;
                }
                this.senderAddresses = this.addresses.filter((address) =>
                    address.country == this.request.sender.country && address.countryCode == this.request.sender.countryCode
                );
                this.recipientStates = data[0];
            },
            (err) => console.error(err)
        );
    }

    public refresh_states(): void {
        this.request.recipient.countryCode = this.countries.filter((v) => v.name == this.request.recipient.country)[0].value;
        this.countryService.getStates(this.request.recipient.countryCode)
            .subscribe((states) => {
                this.recipientStates = states;
                this.request.recipient.province = '';
            });
    }

    selectState(state: any, type: string) {
        this.request[type].province = state.name;
        this.request[type].provinceCode = state.value;
    }

    select_address(type: string, address: any): void {
        switch (type) {
            case 'sender':
                if (address && address.id) {
                    this.request.sender = address;
                }
                break;
            case 'recipient':
                if (address && address.id) {
                    this.request.recipient = address;
                    this.refresh_states();
                }
                break;
        }
    }

    ngDoCheck() {
        this.requestChange.emit(this.request);
    }

    next() {
        if (this.check()) {
            this.localSt.store('shipment.request.data.' + this.request.user.login, this.request);
            this.router.navigate(['/shipment', 'item']);
        }
    }

    check() {
        return (!!(this.request.sender.name && this.request.sender.phone &&
            this.request.sender.address1 && this.request.sender.city &&
            this.request.sender.country && this.request.sender.countryCode &&
            this.request.sender.province && this.request.sender.postalCode)) &&
            (!!(this.request.recipient.name && this.request.recipient.phone &&
            this.request.recipient.address1 && this.request.recipient.city &&
            this.request.recipient.country && this.request.recipient.countryCode &&
            this.request.recipient.province && this.request.recipient.postalCode));
    }
}
