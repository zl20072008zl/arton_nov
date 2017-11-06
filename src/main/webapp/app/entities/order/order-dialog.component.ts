import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Response } from '@angular/http';

import { Observable } from 'rxjs/Rx';
import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { Order } from './order.model';
import { OrderPopupService } from '../../services/entities/order-popup.service';
import { OrderService } from '../../services/entities/order.service';

@Component({
    selector: 'jhi-order-dialog',
    templateUrl: './order-dialog.component.html'
})
export class OrderDialogComponent implements OnInit {

    order: Order;
    authorities: any[];
    isSaving: boolean;
    createdDateDp: any;
    updatedDateDp: any;

    constructor(
        public activeModal: NgbActiveModal,
        private alertService: JhiAlertService,
        private orderService: OrderService,
        private eventManager: JhiEventManager
    ) {
    }

    ngOnInit() {
        this.isSaving = false;
        this.authorities = ['ROLE_USER', 'ROLE_ADMIN'];
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    save() {
        this.isSaving = true;
        if (this.order.id !== undefined) {
            this.subscribeToSaveResponse(
                this.orderService.update(this.order));
        } else {
            this.subscribeToSaveResponse(
                this.orderService.create(this.order));
        }
    }

    private subscribeToSaveResponse(result: Observable<Order>) {
        result.subscribe((res: Order) =>
            this.onSaveSuccess(res), (res: Response) => this.onSaveError(res));
    }

    private onSaveSuccess(result: Order) {
        this.eventManager.broadcast({ name: 'orderListModification', content: 'OK'});
        this.isSaving = false;
        this.activeModal.dismiss(result);
    }

    private onSaveError(error) {
        try {
            error.json();
        } catch (exception) {
            error.message = error.text();
        }
        this.isSaving = false;
        this.onError(error);
    }

    private onError(error) {
        this.alertService.error(error.message, null, null);
    }
}

@Component({
    selector: 'jhi-order-popup',
    template: ''
})
export class OrderPopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private orderPopupService: OrderPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            if ( params['id'] ) {
                this.modalRef = this.orderPopupService
                    .open(OrderDialogComponent, params['id']);
            } else {
                this.modalRef = this.orderPopupService
                    .open(OrderDialogComponent);
            }
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
