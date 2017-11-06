import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { Order } from '../../../entities/order/order.model';
import { OrderPopupService } from '../../../services/entities/order-popup.service';
import { OrderService } from '../../../services/entities/order.service';

@Component({
    selector: 'jhi-admin-order-delete-dialog',
    templateUrl: './admin-order-delete-dialog.component.html'
})
export class AdminOrderDeleteDialogComponent {

    order: Order;

    constructor(
        private orderService: OrderService,
        public activeModal: NgbActiveModal,
        private eventManager: JhiEventManager
    ) {
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.orderService.delete(id).subscribe((response) => {
            this.eventManager.broadcast({
                name: 'orderListModification',
                content: 'Deleted an order'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-admin-order-delete-popup',
    template: ''
})
export class AdminOrderDeletePopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private orderPopupService: OrderPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            this.modalRef = this.orderPopupService
                .open(AdminOrderDeleteDialogComponent, params['id']);
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
