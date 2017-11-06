import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager, JhiParseLinks, JhiPaginationUtil, JhiAlertService } from 'ng-jhipster';

import { ExpressAccount } from './express-account.model';
import { ExpressAccountService } from '../../services/entities/express-account.service';
import { ITEMS_PER_PAGE, Principal, ResponseWrapper } from '../../shared';
import { PaginationConfig } from '../../blocks/config/uib-pagination.config';

@Component({
    selector: 'jhi-express-account',
    templateUrl: './express-account.component.html'
})
export class ExpressAccountComponent implements OnInit, OnDestroy {
expressAccounts: ExpressAccount[];
    currentAccount: any;
    eventSubscriber: Subscription;

    constructor(
        private expressAccountService: ExpressAccountService,
        private alertService: JhiAlertService,
        private eventManager: JhiEventManager,
        private principal: Principal
    ) {
    }

    loadAll() {
        this.expressAccountService.query().subscribe(
            (res: ResponseWrapper) => {
                this.expressAccounts = res.json;
            },
            (res: ResponseWrapper) => this.onError(res.json)
        );
    }
    ngOnInit() {
        this.loadAll();
        this.principal.identity().then((account) => {
            this.currentAccount = account;
        });
        this.registerChangeInExpressAccounts();
    }

    ngOnDestroy() {
        this.eventManager.destroy(this.eventSubscriber);
    }

    trackId(index: number, item: ExpressAccount) {
        return item.id;
    }
    registerChangeInExpressAccounts() {
        this.eventSubscriber = this.eventManager.subscribe('expressAccountListModification', (response) => this.loadAll());
    }

    private onError(error) {
        this.alertService.error(error.message, null, null);
    }
}
