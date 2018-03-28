import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { AdsComponent } from './ads.component';
import { AdsDetailComponent } from './ads-detail.component';
import { AdsPopupComponent } from './ads-dialog.component';
import { AdsDeletePopupComponent } from './ads-delete-dialog.component';

import { Principal } from '../../shared';

@Injectable()
export class AdsResolvePagingParams implements Resolve<any> {

    constructor(private paginationUtil: JhiPaginationUtil) {}

    resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
        const page = route.queryParams['page'] ? route.queryParams['page'] : '1';
        const sort = route.queryParams['sort'] ? route.queryParams['sort'] : 'id,asc';
        return {
            page: this.paginationUtil.parsePage(page),
            predicate: this.paginationUtil.parsePredicate(sort),
            ascending: this.paginationUtil.parseAscending(sort)
      };
    }
}

export const adsRoute: Routes = [
    {
        path: 'ads',
        component: AdsComponent,
        resolve: {
            'pagingParams': AdsResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Ads'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'ads/:id',
        component: AdsDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Ads'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const adsPopupRoute: Routes = [
    {
        path: 'ads-new',
        component: AdsPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Ads'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'ads/:id/edit',
        component: AdsPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Ads'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'ads/:id/delete',
        component: AdsDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Ads'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
