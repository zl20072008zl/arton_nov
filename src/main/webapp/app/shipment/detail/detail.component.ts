import {Component, Input, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {LocalStorageService} from 'ng2-webstorage';
import {Observable} from 'rxjs/Observable';
import {ServiceService} from '../../services/entities/service.service';
import {ItemService} from '../../services/entities/item.service';
import {AddressService} from '../../services/entities/address.service';
import {OrderService} from '../../services/entities/order.service';
import {Order} from '../../entities/order/order.model';

@Component({
    selector: 'shipment-detail-component',
    templateUrl: './detail.component.html',
    styles: []
})
export class ShipmentDetailComponent implements OnInit {

    @Input() request: any;

    constructor(
        private router: Router,
        private localSt: LocalStorageService,
        private addressService: AddressService,
        private itemService: ItemService,
        private serviceService: ServiceService,
        private orderService: OrderService
    ) { }

    ngOnInit() {

    }

    edit(type: string): void {
        this.router.navigate(['/shipment', type]);
    }

    next() {
        const observables: any = [];
        if (this.request.sender.id) {
            observables.push(this.addressService.update(this.request.sender));
        } else {
            observables.push(this.addressService.create(this.request.sender));
        }

        if (this.request.recipient.id) {
            observables.push(this.addressService.update(this.request.recipient));
        } else {
            observables.push(this.addressService.create(this.request.recipient));
        }

        if (this.request.parcel.id) {
            observables.push(this.itemService.update(this.request.parcel));
        } else {
            observables.push(this.itemService.create(this.request.parcel));
        }

        if (this.request.service.id) {
            observables.push(this.serviceService.update(this.request.service));
        } else {
            observables.push(this.serviceService.create(this.request.service));
        }

        Observable.forkJoin(observables)
            .subscribe(
                (data) => {
                    console.log(this.request);
                    this.request.sender = data[0];
                    this.request.recipient = data[1];
                    this.request.parcel = data[2];
                    this.request.service = data[3];

                    this.request.order.totalCharges = this.request.service.price.toFixed(2);
                    this.request.order.serviceId = this.request.service.id;
                    this.request.order.shipperId = this.request.sender.id;
                    this.request.order.recipientId = this.request.recipient.id;
                    this.request.order.itemId = this.request.recipient.id;
                    this.request.order.user = this.request.user.login;
                    this.request.order.orderId = 'AE-' + new Date().getTime();

                    if (!this.request.order.id) {
                        this.orderService.create(this.request.order)
                            .subscribe((order) => {
                                this.request.order = order;
                                this.localSt.store('shipment.request.data.' + this.request.user.login, this.request);
                                this.router.navigate(['/shipment', 'payment']);
                            });
                    } else {
                        this.orderService.update(this.request.order)
                            .subscribe(() => {
                                this.localSt.store('shipment.request.data.' + this.request.user.login, this.request);
                                this.router.navigate(['/shipment', 'payment']);
                            });
                    }

                },
                (err) => console.log(err)
            );
    }
}
