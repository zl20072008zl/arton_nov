import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ArtonexpressSharedModule } from '../../shared';
import {
    ServiceService,
    ServicePopupService,
    ServiceComponent,
    ServiceDetailComponent,
    ServiceDialogComponent,
    ServicePopupComponent,
    ServiceDeletePopupComponent,
    ServiceDeleteDialogComponent,
    serviceRoute,
    servicePopupRoute,
    ServiceResolvePagingParams,
} from './';

const ENTITY_STATES = [
    ...serviceRoute,
    ...servicePopupRoute,
];

@NgModule({
    imports: [
        ArtonexpressSharedModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        ServiceComponent,
        ServiceDetailComponent,
        ServiceDialogComponent,
        ServiceDeleteDialogComponent,
        ServicePopupComponent,
        ServiceDeletePopupComponent,
    ],
    entryComponents: [
        ServiceComponent,
        ServiceDialogComponent,
        ServicePopupComponent,
        ServiceDeleteDialogComponent,
        ServiceDeletePopupComponent,
    ],
    providers: [
        ServiceService,
        ServicePopupService,
        ServiceResolvePagingParams,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ArtonexpressServiceModule {}
