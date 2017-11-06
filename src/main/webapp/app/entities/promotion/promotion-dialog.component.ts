import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Response } from '@angular/http';

import { Observable } from 'rxjs/Rx';
import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { Promotion } from './promotion.model';
import { PromotionPopupService } from './promotion-popup.service';
import { PromotionService } from './promotion.service';

@Component({
    selector: 'jhi-promotion-dialog',
    templateUrl: './promotion-dialog.component.html'
})
export class PromotionDialogComponent implements OnInit {

    promotion: Promotion;
    authorities: any[];
    isSaving: boolean;
    createdDateDp: any;
    updatedDateDp: any;
    startDateDp: any;
    expiredDateDp: any;

    constructor(
        public activeModal: NgbActiveModal,
        private alertService: JhiAlertService,
        private promotionService: PromotionService,
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
    selector: 'jhi-promotion-popup',
    template: ''
})
export class PromotionPopupComponent implements OnInit, OnDestroy {

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
                    .open(PromotionDialogComponent, params['id']);
            } else {
                this.modalRef = this.promotionPopupService
                    .open(PromotionDialogComponent);
            }
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
