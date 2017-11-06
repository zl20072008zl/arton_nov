import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager  } from 'ng-jhipster';

import { ExpressAccount } from './express-account.model';
import { ExpressAccountService } from '../../services/entities/express-account.service';

@Component({
    selector: 'jhi-express-account-detail',
    templateUrl: './express-account-detail.component.html'
})
export class ExpressAccountDetailComponent implements OnInit, OnDestroy {

    expressAccount: ExpressAccount;
    private subscription: Subscription;
    private eventSubscriber: Subscription;

    constructor(
        private eventManager: JhiEventManager,
        private expressAccountService: ExpressAccountService,
        private route: ActivatedRoute
    ) {
    }

    ngOnInit() {
        this.subscription = this.route.params.subscribe((params) => {
            this.load(params['id']);
        });
        this.registerChangeInExpressAccounts();
    }

    load(id) {
        this.expressAccountService.find(id).subscribe((expressAccount) => {
            this.expressAccount = expressAccount;
        });
    }
    previousState() {
        window.history.back();
    }

    ngOnDestroy() {
        this.subscription.unsubscribe();
        this.eventManager.destroy(this.eventSubscriber);
    }

    registerChangeInExpressAccounts() {
        this.eventSubscriber = this.eventManager.subscribe(
            'expressAccountListModification',
            (response) => this.load(this.expressAccount.id)
        );
    }
}
