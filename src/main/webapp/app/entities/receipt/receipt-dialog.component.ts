import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Response } from '@angular/http';

import { Observable } from 'rxjs/Rx';
import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { Receipt } from './receipt.model';
import { ReceiptPopupService } from '../../services/entities/receipt-popup.service';
import { ReceiptService } from '../../services/entities/receipt.service';

@Component({
    selector: 'jhi-receipt-dialog',
    templateUrl: './receipt-dialog.component.html'
})
export class ReceiptDialogComponent implements OnInit {

    receipt: Receipt;
    authorities: any[];
    isSaving: boolean;
    createdDateDp: any;
    updatedDateDp: any;

    constructor(
        public activeModal: NgbActiveModal,
        private alertService: JhiAlertService,
        private receiptService: ReceiptService,
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
        if (this.receipt.id !== undefined) {
            this.subscribeToSaveResponse(
                this.receiptService.update(this.receipt));
        } else {
            this.subscribeToSaveResponse(
                this.receiptService.create(this.receipt));
        }
    }

    private subscribeToSaveResponse(result: Observable<Receipt>) {
        result.subscribe((res: Receipt) =>
            this.onSaveSuccess(res), (res: Response) => this.onSaveError(res));
    }

    private onSaveSuccess(result: Receipt) {
        this.eventManager.broadcast({ name: 'receiptListModification', content: 'OK'});
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
    selector: 'jhi-receipt-popup',
    template: ''
})
export class ReceiptPopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private receiptPopupService: ReceiptPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            if ( params['id'] ) {
                this.modalRef = this.receiptPopupService
                    .open(ReceiptDialogComponent, params['id']);
            } else {
                this.modalRef = this.receiptPopupService
                    .open(ReceiptDialogComponent);
            }
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
