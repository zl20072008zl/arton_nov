import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager, JhiParseLinks, JhiPaginationUtil, JhiAlertService } from 'ng-jhipster';

import { Address } from '../../../entities/address/address.model';
import { AddressService } from '../../../services/entities/address.service';
import { ITEMS_PER_PAGE, Principal, ResponseWrapper, User } from '../../../shared';
import { PaginationConfig } from '../../../blocks/config/uib-pagination.config';
import {UserService} from '../../../shared/user/user.service';

@Component({
    selector: 'jhi-admin-address',
    templateUrl: './admin-address.component.html'
})
export class AdminAddressComponent implements OnInit, OnDestroy {

    currentAccount: any;
    addresses: Address[];
    error: any;
    success: any;
    eventSubscriber: Subscription;
    routeData: any;
    links: any;
    totalItems: any;
    queryCount: any;
    itemsPerPage: any;
    page: any;
    predicate: any;
    previousPage: any;
    reverse: any;
    users: any;
    search:string = '';

    constructor(
        private addressService: AddressService,
        private parseLinks: JhiParseLinks,
        private alertService: JhiAlertService,
        private principal: Principal,
        private activatedRoute: ActivatedRoute,
        private router: Router,
        private eventManager: JhiEventManager,
        private paginationUtil: JhiPaginationUtil,
        private paginationConfig: PaginationConfig,
        private userService: UserService
    ) {
        this.itemsPerPage = ITEMS_PER_PAGE;
        this.routeData = this.activatedRoute.data.subscribe((data) => {
            this.page = data['pagingParams'].page;
            this.previousPage = data['pagingParams'].page;
            this.reverse = data['pagingParams'].ascending;
            this.predicate = data['pagingParams'].predicate;
        });
    }

    loadAll() {
        this.addressService.query({
            page: this.page - 1,
            size: this.itemsPerPage,
            sort: this.sort()}).subscribe(
            (res: ResponseWrapper) => this.onSuccess(res.json, res.headers),
            (res: ResponseWrapper) => this.onError(res.json)
        );
    }

    loadByLogin() {
        this.addressService.findByUser(this.currentAccount.login, {
            page: this.page - 1,
            size: this.itemsPerPage,
            sort: this.sort()}).subscribe(
            (res: ResponseWrapper) => this.onSuccess(res.json, res.headers),
            (res: ResponseWrapper) => this.onError(res.json)
        );
    }

    loadPage(page: number) {
        if (page !== this.previousPage) {
            this.previousPage = page;
            this.transition();
        }
    }
    transition() {
        this.router.navigate(['/address'], {queryParams:
            {
                page: this.page,
                size: this.itemsPerPage,
                sort: this.predicate + ',' + (this.reverse ? 'asc' : 'desc')
            }
        });
        if (this.currentAccount.authorities.indexOf('ROLE_ADMIN') >= 0) {
            this.loadAll();
        } else {
            this.loadByLogin();
        }
    }

    clear() {
        this.page = 0;
        this.router.navigate(['/address', {
            page: this.page,
            sort: this.predicate + ',' + (this.reverse ? 'asc' : 'desc')
        }]);
        if (this.currentAccount.authorities.indexOf('ROLE_ADMIN') >= 0) {
            this.loadAll();
        } else {
            this.loadByLogin();
        }
    }

    ngOnInit() {
        this.principal.identity().then((account) => {
            this.currentAccount = account;
            if (this.currentAccount.authorities.indexOf('ROLE_ADMIN') >= 0) {
                this.loadAll();
            } else {
                this.loadByLogin();
            }
        });
        this.registerChangeInAddresses();
    }

    ngOnDestroy() {
        this.eventManager.destroy(this.eventSubscriber);
    }

    trackId(index: number, item: Address) {
        return item.id;
    }
    registerChangeInAddresses() {
        this.eventSubscriber = this.eventManager.subscribe('addressListModification', (response) => {
            if (this.currentAccount.authorities.indexOf('ROLE_ADMIN') >= 0) {
                this.loadAll();
            } else {
                this.loadByLogin();
            }
        });
    }

    sort() {
        const result = [this.predicate + ',' + (this.reverse ? 'asc' : 'desc')];
        if (this.predicate !== 'id') {
            result.push('id');
        }
        return result;
    }

    private onSuccess(data, headers) {
        this.links = this.parseLinks.parse(headers.get('link'));
        this.totalItems = headers.get('X-Total-Count');
        this.queryCount = this.totalItems;
        // this.page = pagingParams.page;
        this.addresses = data;
    }
    private onError(error) {
        this.alertService.error(error.message, null, null);
    }
}
