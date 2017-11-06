import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { AdminReceiptComponent } from './admin-receipt.component';
import { AdminReceiptDetailComponent } from './admin-receipt-detail.component';
import { AdminReceiptPopupComponent } from './admin-receipt-dialog.component';
import { AdminReceiptDeletePopupComponent } from './admin-receipt-delete-dialog.component';

import { Principal } from '../../../shared';

@Injectable()
export class AdminReceiptResolvePagingParams implements Resolve<any> {

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

export const receiptRoute: Routes = [
    {
        path: 'receipt',
        component: AdminReceiptComponent,
        resolve: {
            'pagingParams': AdminReceiptResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Receipts'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'receipt/:id',
        component: AdminReceiptDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Receipts'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const receiptPopupRoute: Routes = [
    {
        path: 'receipt-new',
        component: AdminReceiptPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Receipts'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'receipt/:id/edit',
        component: AdminReceiptPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Receipts'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'receipt/:id/delete',
        component: AdminReceiptDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Receipts'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
