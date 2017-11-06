import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Response } from '@angular/http';

import { Observable } from 'rxjs/Rx';
import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { ExpressAccount } from './express-account.model';
import { ExpressAccountPopupService } from '../../services/entities/express-account-popup.service';
import { ExpressAccountService } from '../../services/entities/express-account.service';

@Component({
    selector: 'jhi-express-account-dialog',
    templateUrl: './express-account-dialog.component.html'
})
export class ExpressAccountDialogComponent implements OnInit {

    expressAccount: ExpressAccount;
    authorities: any[];
    isSaving: boolean;

    constructor(
        public activeModal: NgbActiveModal,
        private alertService: JhiAlertService,
        private expressAccountService: ExpressAccountService,
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
        if (this.expressAccount.id !== undefined) {
            this.subscribeToSaveResponse(
                this.expressAccountService.update(this.expressAccount));
        } else {
            this.subscribeToSaveResponse(
                this.expressAccountService.create(this.expressAccount));
        }
    }

    private subscribeToSaveResponse(result: Observable<ExpressAccount>) {
        result.subscribe((res: ExpressAccount) =>
            this.onSaveSuccess(res), (res: Response) => this.onSaveError(res));
    }

    private onSaveSuccess(result: ExpressAccount) {
        this.eventManager.broadcast({ name: 'expressAccountListModification', content: 'OK'});
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
    selector: 'jhi-express-account-popup',
    template: ''
})
export class ExpressAccountPopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private expressAccountPopupService: ExpressAccountPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            if ( params['id'] ) {
                this.modalRef = this.expressAccountPopupService
                    .open(ExpressAccountDialogComponent, params['id']);
            } else {
                this.modalRef = this.expressAccountPopupService
                    .open(ExpressAccountDialogComponent);
            }
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
