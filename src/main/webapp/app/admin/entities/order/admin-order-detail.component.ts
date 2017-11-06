import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager  } from 'ng-jhipster';

import { Order } from '../../../entities/order/order.model';
import { OrderService } from '../../../services/entities/order.service';
import {Observable} from "rxjs/Observable";
import {AddressService} from "../../../services/entities/address.service";
import {ItemService} from "../../../services/entities/item.service";
import {ServiceService} from "../../../services/entities/service.service";
import {ReceiptService} from "../../../services/entities/receipt.service";
import {LabelService} from "../../../services/entities/label.service";
import {Address} from "../../../entities/address/address.model";
import {Item} from "../../../entities/item/item.model";
import {Service} from "../../../entities/service/service.model";
import {Receipt} from "../../../entities/receipt/receipt.model";
import {Label} from "../../../entities/label/label.model";
import {CpService} from "../../../services/cp/cp.service";
import {DomSanitizer} from "@angular/platform-browser";
import {ModalDismissReasons, NgbModal} from "@ng-bootstrap/ng-bootstrap";
import {UpsService} from "../../../services/ups/ups.service";
import {FedexService} from "../../../services/fedex/fedex.service";

@Component({
    selector: 'jhi-admin-order-detail',
    templateUrl: './admin-order-detail.component.html'
})
export class AdminOrderDetailComponent implements OnInit, OnDestroy {

    order: Order;
    sender: Address;
    recipient: Address;
    item: Item;
    service: Service;
    receipt: Receipt;
    label: Label;
    stream: any;
    closeResult: string;

    private subscription: Subscription;
    private eventSubscriber: Subscription;

    constructor(
        private eventManager: JhiEventManager,
        private orderService: OrderService,
        private route: ActivatedRoute,
        private addressService: AddressService,
        private itemService: ItemService,
        private serviceService: ServiceService,
        private receiptService: ReceiptService,
        private labelService: LabelService,
        private cpService: CpService,
        private sanitizer: DomSanitizer,
        private modalService: NgbModal,
        private upsService: UpsService,
        private fedexService: FedexService
    ) {
    }

    ngOnInit() {
        this.subscription = this.route.params.subscribe((params) => {
            this.load(params['id']);
        });
        this.registerChangeInOrders();
    }

    load(id) {
        this.orderService.find(id).subscribe((order) => {
            this.order = order;

            Observable.forkJoin([
                this.addressService.find(this.order.shipperId),
                this.addressService.find(this.order.recipientId),
                this.itemService.find(this.order.itemId),
                this.serviceService.find(this.order.serviceId),
                this.receiptService.find(this.order.receiptId),
                this.labelService.find(this.order.labelId)
            ])
                .subscribe(data => {
                    this.sender = data[0];
                    this.recipient = data[1];
                    this.item = data[2];
                    this.service = data[3];
                    this.receipt = data[4];
                    this.label = data[5];
                });
        });
    }

    ngOnDestroy() {
        this.subscription.unsubscribe();
        this.eventManager.destroy(this.eventSubscriber);
    }

    registerChangeInOrders() {
        this.eventSubscriber = this.eventManager.subscribe(
            'orderListModification',
            (response) => this.load(this.order.id)
        );
    }

    getLabel(content) {
        switch (this.service.company) {
            case 'Canada Post':
                this.cpService.getLabel(this.label.link)
                    .subscribe((res) => {
                        this.stream = this.sanitizer.bypassSecurityTrustResourceUrl('data:application/pdf;base64,' + res);
                        this.modalService.open(content, {size: 'lg'}).result.then((result) => {
                            this.closeResult = `Closed with: ${result}`;

                        }, (reason) => {
                            this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
                        });
                    });
                break;
            case 'UPS':
                //'1Z12345E8791315509'
                this.upsService.getLabel(this.label.trackingNumber)
                    .subscribe((res) => {
                        this.stream = this.sanitizer.bypassSecurityTrustResourceUrl('data:application/pdf;base64,' + res);
                        this.modalService.open(content, {size: 'lg'}).result.then((result) => {
                            this.closeResult = `Closed with: ${result}`;

                        }, (reason) => {
                            this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
                        });
                    });
                break;
            case 'Fedex':
                this.stream = this.sanitizer.bypassSecurityTrustResourceUrl('data:application/pdf;base64,' + this.label.shippingLabel);
                this.modalService.open(content, {size: 'lg'}).result.then((result) => {
                    this.closeResult = `Closed with: ${result}`;

                }, (reason) => {
                    this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
                });
                break;
        }
    }

    private getDismissReason(reason: any): string {
        if (reason === ModalDismissReasons.ESC) {
            return 'by pressing ESC';
        } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
            return 'by clicking on a backdrop';
        } else {
            return  `with: ${reason}`;
        }
    }
}
