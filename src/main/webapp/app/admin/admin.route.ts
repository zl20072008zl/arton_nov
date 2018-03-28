import { Routes } from '@angular/router';

import {
    auditsRoute,
    configurationRoute,
    docsRoute,
    healthRoute,
    logsRoute,
    metricsRoute,
    trackerRoute,
    userMgmtRoute,
    userDialogRoute,
    addressRoute,
    addressPopupRoute,
    itemRoute,
    itemPopupRoute,
    orderRoute,
    orderPopupRoute,
    promotionRoute,
    promotionPopupRoute,
    receiptRoute,
    receiptPopupRoute,
    expressAccountRoute,
    expressAccountPopupRoute,
    adsRoute,
    adsPopupRoute
} from './';

import { UserRouteAccessService } from '../shared';
import {AdminComponent} from './admin.component';
import {settingsRoute} from "./settings/settings.route";
import {passwordRoute} from "./password/password.route";
import {servicePopupRoute, serviceRoute} from "./entities/service/admin-service.route";
import {labelPopupRoute, labelRoute} from "./entities/label/admin-label.route";

const ADMIN_ROUTES = [
    auditsRoute,
    configurationRoute,
    docsRoute,
    healthRoute,
    logsRoute,
    trackerRoute,
    ...userMgmtRoute,
    metricsRoute,
    ...addressRoute,
    ...itemRoute,
    ...orderRoute,
    ...promotionRoute,
    ...receiptRoute,
    settingsRoute,
    passwordRoute,
    ...serviceRoute,
    ...labelRoute,
    ...expressAccountRoute,
    ...adsRoute
];

export const adminState: Routes = [{
    path: 'admin',
    data: {
        authorities: ['ROLE_ADMIN', 'ROLE_USER']
    },
    component: AdminComponent,
    canActivate: [UserRouteAccessService],
    children: ADMIN_ROUTES
},
    ...userDialogRoute,
    ...addressPopupRoute,
    ...itemPopupRoute,
    ...orderPopupRoute,
    ...promotionPopupRoute,
    ...receiptPopupRoute,
    ...servicePopupRoute,
    ...labelPopupRoute,
    ...expressAccountPopupRoute,
    ...adsPopupRoute
];
