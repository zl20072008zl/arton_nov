import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { Receipt } from '../../../entities/receipt/receipt.model';
import { ReceiptPopupService } from '../../../services/entities/receipt-popup.service';
import { ReceiptService } from '../../../services/entities/receipt.service';

@Component({
    selector: 'jhi-admin-receipt-delete-dialog',
    templateUrl: './admin-receipt-delete-dialog.component.html'
})
export class AdminReceiptDeleteDialogComponent {

    receipt: Receipt;

    constructor(
        private receiptService: ReceiptService,
        public activeModal: NgbActiveModal,
        private eventManager: JhiEventManager
    ) {
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.receiptService.delete(id).subscribe((response) => {
            this.eventManager.broadcast({
                name: 'receiptListModification',
                content: 'Deleted an receipt'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-admin-receipt-delete-popup',
    template: ''
})
export class AdminReceiptDeletePopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private receiptPopupService: ReceiptPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            this.modalRef = this.receiptPopupService
                .open(AdminReceiptDeleteDialogComponent, params['id']);
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
