import { Injectable, Component } from '@angular/core';
import { Router } from '@angular/router';
import { NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { ExpressAccount } from '../../entities/express-account/express-account.model';
import { ExpressAccountService } from './express-account.service';

@Injectable()
export class ExpressAccountPopupService {
    private isOpen = false;
    constructor(
        private modalService: NgbModal,
        private router: Router,
        private expressAccountService: ExpressAccountService

    ) {}

    open(component: Component, id?: number | any): NgbModalRef {
        if (this.isOpen) {
            return;
        }
        this.isOpen = true;

        if (id) {
            this.expressAccountService.find(id).subscribe((expressAccount) => {
                this.expressAccountModalRef(component, expressAccount);
            });
        } else {
            return this.expressAccountModalRef(component, new ExpressAccount());
        }
    }

    expressAccountModalRef(component: Component, expressAccount: ExpressAccount): NgbModalRef {
        const modalRef = this.modalService.open(component, { size: 'lg', backdrop: 'static'});
        modalRef.componentInstance.expressAccount = expressAccount;
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
