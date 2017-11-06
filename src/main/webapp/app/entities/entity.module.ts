import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { ArtonexpressAddressModule } from './address/address.module';
import { ArtonexpressServiceModule } from './service/service.module';
import { ArtonexpressReceiptModule } from './receipt/receipt.module';
import { ArtonexpressPromotionModule } from './promotion/promotion.module';
import { ArtonexpressLabelModule } from './label/label.module';
import { ArtonexpressOrderModule } from './order/order.module';
import { ArtonexpressItemModule } from './item/item.module';
import { ArtonexpressExpressAccountModule } from './express-account/express-account.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        // ArtonexpressAddressModule,
        // ArtonexpressServiceModule,
        // ArtonexpressReceiptModule,
        // ArtonexpressPromotionModule,
        // ArtonexpressLabelModule,
        // ArtonexpressOrderModule,
        // ArtonexpressItemModule,
        // ArtonexpressExpressAccountModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ArtonexpressEntityModule {}
