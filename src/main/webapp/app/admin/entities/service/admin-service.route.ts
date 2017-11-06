import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { AdminServiceComponent } from './admin-service.component';
import { AdminServiceDetailComponent } from './admin-service-detail.component';
import { AdminServicePopupComponent } from './admin-service-dialog.component';
import { AdminServiceDeletePopupComponent } from './admin-service-delete-dialog.component';

import { Principal } from '../../../shared';

@Injectable()
export class AdminServiceResolvePagingParams implements Resolve<any> {

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

export const serviceRoute: Routes = [
    {
        path: 'service',
        component: AdminServiceComponent,
        resolve: {
            'pagingParams': AdminServiceResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'service/:id',
        component: AdminServiceDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const servicePopupRoute: Routes = [
    {
        path: 'service-new',
        component: AdminServicePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'service/:id/edit',
        component: AdminServicePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'service/:id/delete',
        component: AdminServiceDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
