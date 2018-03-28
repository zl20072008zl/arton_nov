import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { AdminAdsComponent } from './admin-ads.component';
import { AdminAdsDetailComponent } from './admin-ads-detail.component';
import { AdminAdsPopupComponent } from './admin-ads-dialog.component';
import { AdminAdsDeletePopupComponent } from './admin-ads-delete-dialog.component';

import { Principal } from '../../../shared';

@Injectable()
export class AdminAdsResolvePagingParams implements Resolve<any> {

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
        component: AdminAdsComponent,
        resolve: {
            'pagingParams': AdminAdsResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Ads'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'ads/:id',
        component: AdminAdsDetailComponent,
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
        component: AdminAdsPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Ads'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'ads/:id/edit',
        component: AdminAdsPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Ads'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'ads/:id/delete',
        component: AdminAdsDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Ads'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
