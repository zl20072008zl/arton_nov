import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ArtonexpressSharedModule } from '../../shared';
import {
    AdsService,
    AdsPopupService,
    AdsComponent,
    AdsDetailComponent,
    AdsDialogComponent,
    AdsPopupComponent,
    AdsDeletePopupComponent,
    AdsDeleteDialogComponent,
    adsRoute,
    adsPopupRoute,
    AdsResolvePagingParams,
} from './';

const ENTITY_STATES = [
    ...adsRoute,
    ...adsPopupRoute,
];

@NgModule({
    imports: [
        ArtonexpressSharedModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        AdsComponent,
        AdsDetailComponent,
        AdsDialogComponent,
        AdsDeleteDialogComponent,
        AdsPopupComponent,
        AdsDeletePopupComponent,
    ],
    entryComponents: [
        AdsComponent,
        AdsDialogComponent,
        AdsPopupComponent,
        AdsDeleteDialogComponent,
        AdsDeletePopupComponent,
    ],
    providers: [
        AdsService,
        AdsPopupService,
        AdsResolvePagingParams,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ArtonexpressAdsModule {}
