import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { ExpressAccount } from './express-account.model';
import { ExpressAccountPopupService } from '../../services/entities/express-account-popup.service';
import { ExpressAccountService } from '../../services/entities/express-account.service';

@Component({
    selector: 'jhi-express-account-delete-dialog',
    templateUrl: './express-account-delete-dialog.component.html'
})
export class ExpressAccountDeleteDialogComponent {

    expressAccount: ExpressAccount;

    constructor(
        private expressAccountService: ExpressAccountService,
        public activeModal: NgbActiveModal,
        private eventManager: JhiEventManager
    ) {
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.expressAccountService.delete(id).subscribe((response) => {
            this.eventManager.broadcast({
                name: 'expressAccountListModification',
                content: 'Deleted an expressAccount'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-express-account-delete-popup',
    template: ''
})
export class ExpressAccountDeletePopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private expressAccountPopupService: ExpressAccountPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            this.modalRef = this.expressAccountPopupService
                .open(ExpressAccountDeleteDialogComponent, params['id']);
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
