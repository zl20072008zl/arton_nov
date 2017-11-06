import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager  } from 'ng-jhipster';

import { ExpressAccount } from '../../entities/express-account/express-account.model';
import { ExpressAccountService } from '../../services/entities/express-account.service';

@Component({
    selector: 'jhi-admin-account',
    templateUrl: './admin-account.component.html'
})
export class AdminAccountComponent implements OnInit, OnDestroy {

    expressAccount: ExpressAccount;
    private subscription: Subscription;
    private eventSubscriber: Subscription;

    constructor(
        private eventManager: JhiEventManager,
        private expressAccountService: ExpressAccountService,
    ) {
    }

    ngOnInit() {
        this.expressAccountService.find(1).subscribe((expressAccount) => {
            this.expressAccount = expressAccount;
        });
        this.registerChangeInExpressAccounts();
    }

    load() {
        this.expressAccountService.find(1).subscribe((expressAccount) => {
            this.expressAccount = expressAccount;
        });
    }

    ngOnDestroy() {
        // this.subscription.unsubscribe();
        this.eventManager.destroy(this.eventSubscriber);
    }

    registerChangeInExpressAccounts() {
        this.eventSubscriber = this.eventManager.subscribe(
            'expressAccountListModification',
            (response) => this.load()
        );
    }
}
