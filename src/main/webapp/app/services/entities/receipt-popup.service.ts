import { Injectable, Component } from '@angular/core';
import { Router } from '@angular/router';
import { NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { Receipt } from '../../entities/receipt/receipt.model';
import { ReceiptService } from './receipt.service';

@Injectable()
export class ReceiptPopupService {
    private isOpen = false;
    constructor(
        private modalService: NgbModal,
        private router: Router,
        private receiptService: ReceiptService

    ) {}

    open(component: Component, id?: number | any): NgbModalRef {
        if (this.isOpen) {
            return;
        }
        this.isOpen = true;

        if (id) {
            this.receiptService.find(id).subscribe((receipt) => {
                if (receipt.createdDate) {
                    receipt.createdDate = {
                        year: receipt.createdDate.getFullYear(),
                        month: receipt.createdDate.getMonth() + 1,
                        day: receipt.createdDate.getDate()
                    };
                }
                if (receipt.updatedDate) {
                    receipt.updatedDate = {
                        year: receipt.updatedDate.getFullYear(),
                        month: receipt.updatedDate.getMonth() + 1,
                        day: receipt.updatedDate.getDate()
                    };
                }
                this.receiptModalRef(component, receipt);
            });
        } else {
            return this.receiptModalRef(component, new Receipt());
        }
    }

    receiptModalRef(component: Component, receipt: Receipt): NgbModalRef {
        const modalRef = this.modalService.open(component, { size: 'lg', backdrop: 'static'});
        modalRef.componentInstance.receipt = receipt;
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
