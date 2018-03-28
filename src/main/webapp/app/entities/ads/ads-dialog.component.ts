import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Response } from '@angular/http';

import { Observable } from 'rxjs/Rx';
import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { Ads } from './ads.model';
import { AdsPopupService } from '../../services/entities/ads-popup.service';
import { AdsService } from '../../services/entities/ads.service';

@Component({
    selector: 'jhi-ads-dialog',
    templateUrl: './admin-ads-dialog.component.html'
})
export class AdsDialogComponent implements OnInit {

    ads: Ads;
    authorities: any[];
    isSaving: boolean;
    createDateDp: any;
    updateDateDp: any;

    constructor(
        public activeModal: NgbActiveModal,
        private alertService: JhiAlertService,
        private adsService: AdsService,
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
        if (this.ads.id !== undefined) {
            this.subscribeToSaveResponse(
                this.adsService.update(this.ads));
        } else {
            this.subscribeToSaveResponse(
                this.adsService.create(this.ads));
        }
    }

    private subscribeToSaveResponse(result: Observable<Ads>) {
        result.subscribe((res: Ads) =>
            this.onSaveSuccess(res), (res: Response) => this.onSaveError(res));
    }

    private onSaveSuccess(result: Ads) {
        this.eventManager.broadcast({ name: 'adsListModification', content: 'OK'});
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
    selector: 'jhi-ads-popup',
    template: ''
})
export class AdsPopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private adsPopupService: AdsPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            if ( params['id'] ) {
                this.modalRef = this.adsPopupService
                    .open(AdsDialogComponent, params['id']);
            } else {
                this.modalRef = this.adsPopupService
                    .open(AdsDialogComponent);
            }
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
