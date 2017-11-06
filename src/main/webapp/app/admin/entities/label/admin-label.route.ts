import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { AdminLabelComponent } from './admin-label.component';
import { AdminLabelDetailComponent } from './admin-label-detail.component';
import { AdminLabelPopupComponent } from './admin-label-dialog.component';
import { AdminLabelDeletePopupComponent } from './admin-label-delete-dialog.component';

import { Principal } from '../../../shared';

@Injectable()
export class AdminLabelResolvePagingParams implements Resolve<any> {

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

export const labelRoute: Routes = [
    {
        path: 'label',
        component: AdminLabelComponent,
        resolve: {
            'pagingParams': AdminLabelResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Labels'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'label/:id',
        component: AdminLabelDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Labels'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const labelPopupRoute: Routes = [
    {
        path: 'label-new',
        component: AdminLabelPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Labels'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'label/:id/edit',
        component: AdminLabelPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Labels'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'label/:id/delete',
        component: AdminLabelDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Labels'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
