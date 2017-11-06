import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { ExpressAccountComponent } from './express-account.component';
import { ExpressAccountDetailComponent } from './express-account-detail.component';
import { ExpressAccountPopupComponent } from './express-account-dialog.component';
import { ExpressAccountDeletePopupComponent } from './express-account-delete-dialog.component';

import { Principal } from '../../shared';

export const expressAccountRoute: Routes = [
    {
        path: 'express-account',
        component: ExpressAccountComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'ExpressAccounts'
        },
        canActivate: [UserRouteAccessService]
    }, {
        path: 'express-account/:id',
        component: ExpressAccountDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'ExpressAccounts'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const expressAccountPopupRoute: Routes = [
    {
        path: 'express-account-new',
        component: ExpressAccountPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'ExpressAccounts'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'express-account/:id/edit',
        component: ExpressAccountPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'ExpressAccounts'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'express-account/:id/delete',
        component: ExpressAccountDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'ExpressAccounts'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
