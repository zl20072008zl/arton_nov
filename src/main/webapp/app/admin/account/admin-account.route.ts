import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes, CanActivate } from '@angular/router';

import { UserRouteAccessService } from '../../shared';
import { JhiPaginationUtil } from 'ng-jhipster';

import { AdminAccountComponent } from './admin-account.component';
import { AdminAccountPopupComponent } from './admin-account-dialog.component';

import { Principal } from '../../shared';

export const expressAccountRoute: Routes = [
    {
        path: 'account',
        component: AdminAccountComponent,
        data: {
            authorities: ['ROLE_ADMIN'],
            pageTitle: 'ExpressAccounts'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const expressAccountPopupRoute: Routes = [
    {
        path: 'express-account-new',
        component: AdminAccountPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'ExpressAccounts'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'express-account/:id/edit',
        component: AdminAccountPopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'ExpressAccounts'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    },
];
