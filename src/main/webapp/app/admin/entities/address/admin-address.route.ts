import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { AdminAddressComponent } from './admin-address.component';
import { AdminAddressDetailComponent } from './admin-address-detail.component';
import { AdminAddressPopupComponent } from './admin-address-dialog.component';
import { AdminAddressDeletePopupComponent } from './admin-address-delete-dialog.component';

import { Principal } from '../../../shared';

@Injectable()
export class AdminAddressResolvePagingParams implements Resolve<any> {

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

export const addressRoute: Routes = [
    {
        path: 'address',
        component: AdminAddressComponent,
        resolve: {
            'pagingParams': AdminAddressResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Addresses'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'address/:id',
        component: AdminAddressDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Addresses'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const addressPopupRoute: Routes = [
    {
        path: 'address-new',
        component: AdminAddressPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Addresses'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'address/:id/edit',
        component: AdminAddressPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Addresses'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'address/:id/delete',
        component: AdminAddressDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Addresses'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
