import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { AdminOrderComponent } from './admin-order.component';
import { AdminOrderDetailComponent } from './admin-order-detail.component';
import { AdminOrderPopupComponent } from './admin-order-dialog.component';
import { AdminOrderDeletePopupComponent } from './admin-order-delete-dialog.component';

import { Principal } from '../../../shared';

@Injectable()
export class AdminOrderResolvePagingParams implements Resolve<any> {

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

export const orderRoute: Routes = [
    {
        path: 'order',
        component: AdminOrderComponent,
        resolve: {
            'pagingParams': AdminOrderResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Orders'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'order/:id',
        component: AdminOrderDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Orders'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const orderPopupRoute: Routes = [
    {
        path: 'order-new',
        component: AdminOrderPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Orders'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'order/:id/edit',
        component: AdminOrderPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Orders'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'order/:id/delete',
        component: AdminOrderDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Orders'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
