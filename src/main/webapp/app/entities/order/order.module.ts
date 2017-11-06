import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ArtonexpressSharedModule } from '../../shared';
import {
    OrderService,
    OrderPopupService,
    OrderComponent,
    OrderDetailComponent,
    OrderDialogComponent,
    OrderPopupComponent,
    OrderDeletePopupComponent,
    OrderDeleteDialogComponent,
    orderRoute,
    orderPopupRoute,
    OrderResolvePagingParams,
} from './';

const ENTITY_STATES = [
    ...orderRoute,
    ...orderPopupRoute,
];

@NgModule({
    imports: [
        ArtonexpressSharedModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        OrderComponent,
        OrderDetailComponent,
        OrderDialogComponent,
        OrderDeleteDialogComponent,
        OrderPopupComponent,
        OrderDeletePopupComponent,
    ],
    entryComponents: [
        OrderComponent,
        OrderDialogComponent,
        OrderPopupComponent,
        OrderDeleteDialogComponent,
        OrderDeletePopupComponent,
    ],
    providers: [
        OrderService,
        OrderPopupService,
        OrderResolvePagingParams,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ArtonexpressOrderModule {}
