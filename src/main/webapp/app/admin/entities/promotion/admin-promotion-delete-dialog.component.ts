import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { Promotion } from '../../../entities/promotion/promotion.model';
import { PromotionPopupService } from '../../../services/entities/promotion-popup.service';
import { PromotionService } from '../../../services/entities/promotion.service';

@Component({
    selector: 'jhi-admin-promotion-delete-dialog',
    templateUrl: './admin-promotion-delete-dialog.component.html'
})
export class AdminPromotionDeleteDialogComponent {

    promotion: Promotion;

    constructor(
        private promotionService: PromotionService,
        public activeModal: NgbActiveModal,
        private eventManager: JhiEventManager
    ) {
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.promotionService.delete(id).subscribe((response) => {
            this.eventManager.broadcast({
                name: 'promotionListModification',
                content: 'Deleted an promotion'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-admin-promotion-delete-popup',
    template: ''
})
export class AdminPromotionDeletePopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private promotionPopupService: PromotionPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            this.modalRef = this.promotionPopupService
                .open(AdminPromotionDeleteDialogComponent, params['id']);
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
