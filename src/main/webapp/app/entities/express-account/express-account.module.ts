import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ArtonexpressSharedModule } from '../../shared';
import {
    ExpressAccountService,
    ExpressAccountPopupService,
    ExpressAccountComponent,
    ExpressAccountDetailComponent,
    ExpressAccountDialogComponent,
    ExpressAccountPopupComponent,
    ExpressAccountDeletePopupComponent,
    ExpressAccountDeleteDialogComponent,
    expressAccountRoute,
    expressAccountPopupRoute,
} from './';

const ENTITY_STATES = [
    ...expressAccountRoute,
    ...expressAccountPopupRoute,
];

@NgModule({
    imports: [
        ArtonexpressSharedModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        ExpressAccountComponent,
        ExpressAccountDetailComponent,
        ExpressAccountDialogComponent,
        ExpressAccountDeleteDialogComponent,
        ExpressAccountPopupComponent,
        ExpressAccountDeletePopupComponent,
    ],
    entryComponents: [
        ExpressAccountComponent,
        ExpressAccountDialogComponent,
        ExpressAccountPopupComponent,
        ExpressAccountDeleteDialogComponent,
        ExpressAccountDeletePopupComponent,
    ],
    providers: [
        ExpressAccountService,
        ExpressAccountPopupService,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ArtonexpressExpressAccountModule {}
