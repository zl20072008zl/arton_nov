import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { Ads } from '../../../entities/ads/ads.model';
import { AdsPopupService } from '../../../services/entities/ads-popup.service';
import { AdsService } from '../../../services/entities/ads.service';

@Component({
    selector: 'jhi-ads-delete-dialog',
    templateUrl: './admin-ads-delete-dialog.component.html'
})
export class AdminAdsDeleteDialogComponent {

    ads: Ads;

    constructor(
        private adsService: AdsService,
        public activeModal: NgbActiveModal,
        private eventManager: JhiEventManager
    ) {
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.adsService.delete(id).subscribe((response) => {
            this.eventManager.broadcast({
                name: 'adsListModification',
                content: 'Deleted an ads'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-ads-delete-popup',
    template: ''
})
export class AdminAdsDeletePopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private adsPopupService: AdsPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            this.modalRef = this.adsPopupService
                .open(AdminAdsDeleteDialogComponent, params['id']);
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
