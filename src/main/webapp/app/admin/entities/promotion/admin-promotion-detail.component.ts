import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager  } from 'ng-jhipster';

import { Promotion } from '../../../entities/promotion/promotion.model';
import { PromotionService } from '../../../services/entities/promotion.service';

@Component({
    selector: 'jhi-admin-promotion-detail',
    templateUrl: './admin-promotion-detail.component.html'
})
export class AdminPromotionDetailComponent implements OnInit, OnDestroy {

    promotion: Promotion;
    private subscription: Subscription;
    private eventSubscriber: Subscription;

    constructor(
        private eventManager: JhiEventManager,
        private promotionService: PromotionService,
        private route: ActivatedRoute
    ) {
    }

    ngOnInit() {
        this.subscription = this.route.params.subscribe((params) => {
            this.load(params['id']);
        });
        this.registerChangeInPromotions();
    }

    load(id) {
        this.promotionService.find(id).subscribe((promotion) => {
            this.promotion = promotion;
        });
    }
    previousState() {
        window.history.back();
    }

    ngOnDestroy() {
        this.subscription.unsubscribe();
        this.eventManager.destroy(this.eventSubscriber);
    }

    registerChangeInPromotions() {
        this.eventSubscriber = this.eventManager.subscribe(
            'promotionListModification',
            (response) => this.load(this.promotion.id)
        );
    }
}
