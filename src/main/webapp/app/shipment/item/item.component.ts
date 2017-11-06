import {Component, DoCheck, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Item} from '../../entities/item/item.model';
import {LocalStorageService} from 'ng2-webstorage';
import {Router} from '@angular/router';

@Component({
    selector: 'shipment-item-component',
    templateUrl: './item.component.html',
    styles: []
})
export class ShipmentItemComponent implements OnInit, DoCheck {

    @Input() request: any;

    @Output() requestChange: EventEmitter<any> = new EventEmitter();

    public packaging_types: string[] = ['Customer Package', 'Envelope'];
    public units: string[] = ['KGS', 'LGS'];

    constructor(
        private router: Router,
        private localSt: LocalStorageService,
    ) { }

    ngOnInit() {
        if (!this.request.parcel) {
            this.request.parcel = new Item();
        }

        if (!this.request.parcel.type) {
            this.request.parcel.type = this.packaging_types[0];
        }

        if (!this.request.parcel.unit) {
            this.request.parcel.unit = this.units[0];
        }
    }

    ngDoCheck() {
        this.requestChange.emit(this.request);
    }

    next() {
        if (this.check()) {
            this.localSt.store('shipment.request.data.' + this.request.user.login, this.request);
            this.router.navigate(['/shipment', 'service']);
        }
    }

    back() {
        this.router.navigate(['/shipment', 'address']);
    }

    check() {
        return !!(this.request.parcel.type && this.request.parcel.weight && this.request.parcel.unit);
    }
}
