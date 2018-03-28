import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager  } from 'ng-jhipster';

import { Ads } from '../../../entities/ads/ads.model';
import { AdsService } from '../../../services/entities/ads.service';

@Component({
    selector: 'jhi-ads-detail',
    templateUrl: './admin-ads-detail.component.html'
})
export class AdminAdsDetailComponent implements OnInit, OnDestroy {

    ads: Ads;
    private subscription: Subscription;
    private eventSubscriber: Subscription;

    constructor(
        private eventManager: JhiEventManager,
        private adsService: AdsService,
        private route: ActivatedRoute
    ) {
    }

    ngOnInit() {
        this.subscription = this.route.params.subscribe((params) => {
            this.load(params['id']);
        });
        this.registerChangeInAds();
    }

    load(id) {
        this.adsService.find(id).subscribe((ads) => {
            this.ads = ads;
        });
    }
    previousState() {
        window.history.back();
    }

    ngOnDestroy() {
        this.subscription.unsubscribe();
        this.eventManager.destroy(this.eventSubscriber);
    }

    registerChangeInAds() {
        this.eventSubscriber = this.eventManager.subscribe(
            'adsListModification',
            (response) => this.load(this.ads.id)
        );
    }
}
