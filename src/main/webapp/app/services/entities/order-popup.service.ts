import { Injectable, Component } from '@angular/core';
import { Router } from '@angular/router';
import { NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { Order } from '../../entities/order/order.model';
import { OrderService } from './order.service';

@Injectable()
export class OrderPopupService {
    private isOpen = false;
    constructor(
        private modalService: NgbModal,
        private router: Router,
        private orderService: OrderService

    ) {}

    open(component: Component, id?: number | any): NgbModalRef {
        if (this.isOpen) {
            return;
        }
        this.isOpen = true;

        if (id) {
            this.orderService.find(id).subscribe((order) => {
                if (order.createdDate) {
                    order.createdDate = {
                        year: order.createdDate.getFullYear(),
                        month: order.createdDate.getMonth() + 1,
                        day: order.createdDate.getDate()
                    };
                }
                if (order.updatedDate) {
                    order.updatedDate = {
                        year: order.updatedDate.getFullYear(),
                        month: order.updatedDate.getMonth() + 1,
                        day: order.updatedDate.getDate()
                    };
                }
                this.orderModalRef(component, order);
            });
        } else {
            return this.orderModalRef(component, new Order());
        }
    }

    orderModalRef(component: Component, order: Order): NgbModalRef {
        const modalRef = this.modalService.open(component, { size: 'lg', backdrop: 'static'});
        modalRef.componentInstance.order = order;
        modalRef.result.then((result) => {
            this.router.navigate([{ outlets: { popup: null }}], { replaceUrl: true });
            this.isOpen = false;
        }, (reason) => {
            this.router.navigate([{ outlets: { popup: null }}], { replaceUrl: true });
            this.isOpen = false;
        });
        return modalRef;
    }
}
