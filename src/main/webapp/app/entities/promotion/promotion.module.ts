import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ArtonexpressSharedModule } from '../../shared';
import {
    PromotionService,
    PromotionPopupService,
    PromotionComponent,
    PromotionDetailComponent,
    PromotionDialogComponent,
    PromotionPopupComponent,
    PromotionDeletePopupComponent,
    PromotionDeleteDialogComponent,
    promotionRoute,
    promotionPopupRoute,
    PromotionResolvePagingParams,
} from './';

const ENTITY_STATES = [
    ...promotionRoute,
    ...promotionPopupRoute,
];

@NgModule({
    imports: [
        ArtonexpressSharedModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        PromotionComponent,
        PromotionDetailComponent,
        PromotionDialogComponent,
        PromotionDeleteDialogComponent,
        PromotionPopupComponent,
        PromotionDeletePopupComponent,
    ],
    entryComponents: [
        PromotionComponent,
        PromotionDialogComponent,
        PromotionPopupComponent,
        PromotionDeleteDialogComponent,
        PromotionDeletePopupComponent,
    ],
    providers: [
        PromotionService,
        PromotionPopupService,
        PromotionResolvePagingParams,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ArtonexpressPromotionModule {}
