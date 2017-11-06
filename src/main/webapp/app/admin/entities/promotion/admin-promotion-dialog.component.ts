import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Response } from '@angular/http';

import { Observable } from 'rxjs/Rx';
import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { Promotion } from '../../../entities/promotion/promotion.model';
import { PromotionPopupService } from '../../../services/entities/promotion-popup.service';
import { PromotionService } from '../../../services/entities/promotion.service';
import {Account, Principal} from "../../../shared";

@Component({
    selector: 'jhi-admin-promotion-dialog',
    templateUrl: './admin-promotion-dialog.component.html'
})
export class AdminPromotionDialogComponent implements OnInit {

    promotion: Promotion;
    authorities: any[];
    isSaving: boolean;
    createdDateDp: any;
    updatedDateDp: any;
    startDateDp: any;
    expiredDateDp: any;
    account:Account;

    constructor(
        public activeModal: NgbActiveModal,
        private alertService: JhiAlertService,
        private promotionService: PromotionService,
        private eventManager: JhiEventManager,
        private principal: Principal
    ) {
    }

    ngOnInit() {
        this.isSaving = false;
        this.authorities = ['ROLE_USER', 'ROLE_ADMIN'];
        this.principal.identity().then(account => {
            this.account = account;
        });
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    save() {
        this.isSaving = true;
        if (this.promotion.id !== undefined) {
            this.subscribeToSaveResponse(
                this.promotionService.update(this.promotion));
        } else {
            this.subscribeToSaveResponse(
                this.promotionService.create(this.promotion));
        }
    }

    private subscribeToSaveResponse(result: Observable<Promotion>) {
        result.subscribe((res: Promotion) =>
            this.onSaveSuccess(res), (res: Response) => this.onSaveError(res));
    }

    private onSaveSuccess(result: Promotion) {
        this.eventManager.broadcast({ name: 'promotionListModification', content: 'OK'});
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
    selector: 'jhi-admin-promotion-popup',
    template: ''
})
export class AdminPromotionPopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private promotionPopupService: PromotionPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            if ( params['id'] ) {
                this.modalRef = this.promotionPopupService
                    .open(AdminPromotionDialogComponent, params['id']);
            } else {
                this.modalRef = this.promotionPopupService
                    .open(AdminPromotionDialogComponent);
            }
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
