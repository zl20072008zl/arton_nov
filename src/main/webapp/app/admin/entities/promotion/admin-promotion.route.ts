import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { AdminPromotionComponent } from './admin-promotion.component';
import { AdminPromotionDetailComponent } from './admin-promotion-detail.component';
import { AdminPromotionPopupComponent } from './admin-promotion-dialog.component';
import { AdminPromotionDeletePopupComponent } from './admin-promotion-delete-dialog.component';

import { Principal } from '../../../shared';

@Injectable()
export class AdminPromotionResolvePagingParams implements Resolve<any> {

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

export const promotionRoute: Routes = [
    {
        path: 'promotion',
        component: AdminPromotionComponent,
        resolve: {
            'pagingParams': AdminPromotionResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Promotions'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'promotion/:id',
        component: AdminPromotionDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Promotions'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const promotionPopupRoute: Routes = [
    {
        path: 'promotion-new',
        component: AdminPromotionPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Promotions'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'promotion/:id/edit',
        component: AdminPromotionPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Promotions'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'promotion/:id/delete',
        component: AdminPromotionDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Promotions'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
