import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { ServiceComponent } from './service.component';
import { ServiceDetailComponent } from './service-detail.component';
import { ServicePopupComponent } from './service-dialog.component';
import { ServiceDeletePopupComponent } from './service-delete-dialog.component';

import { Principal } from '../../shared';

@Injectable()
export class ServiceResolvePagingParams implements Resolve<any> {

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
        component: ServiceComponent,
        resolve: {
            'pagingParams': ServiceResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'service/:id',
        component: ServiceDetailComponent,
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
        component: ServicePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'service/:id/edit',
        component: ServicePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'service/:id/delete',
        component: ServiceDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
