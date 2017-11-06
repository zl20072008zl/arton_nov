import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { AdminItemComponent } from './admin-item.component';
import { AdminItemDetailComponent } from './admin-item-detail.component';
import { AdminItemPopupComponent } from './admin-item-dialog.component';
import { AdminItemDeletePopupComponent } from './admin-item-delete-dialog.component';

import { Principal } from '../../../shared';

@Injectable()
export class AdminItemResolvePagingParams implements Resolve<any> {

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

export const itemRoute: Routes = [
    {
        path: 'item',
        component: AdminItemComponent,
        resolve: {
            'pagingParams': AdminItemResolvePagingParams
        },
        data: {
            authorities: ['ROLE_ADMIN'],
            pageTitle: 'Items'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'item/:id',
        component: AdminItemDetailComponent,
        data: {
            authorities: ['ROLE_ADMIN'],
            pageTitle: 'Items'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const itemPopupRoute: Routes = [
    {
        path: 'item-new',
        component: AdminItemPopupComponent,
        data: {
            authorities: ['ROLE_ADMIN'],
            pageTitle: 'Items'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'item/:id/edit',
        component: AdminItemPopupComponent,
        data: {
            authorities: ['ROLE_ADMIN'],
            pageTitle: 'Items'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'item/:id/delete',
        component: AdminItemDeletePopupComponent,
        data: {
            authorities: ['ROLE_ADMIN'],
            pageTitle: 'Items'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
