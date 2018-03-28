import './vendor.ts';

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Ng2Webstorage } from 'ng2-webstorage';

import { ArtonexpressSharedModule, UserRouteAccessService } from './shared';
import { ArtonexpressHomeModule } from './home/home.module';
import { ArtonexpressAdminModule } from './admin/admin.module';
import { ArtonexpressAccountModule } from './account/account.module';
import { ArtonexpressEntityModule } from './entities/entity.module';

import { customHttpProvider } from './blocks/interceptor/http.provider';
import { PaginationConfig } from './blocks/config/uib-pagination.config';

import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

// jhipster-needle-angular-add-module-import JHipster will add new module here

import { CountryListService } from './services/country-list.service';

import {
    JhiMainComponent,
    LayoutRoutingModule,
    NavbarComponent,
    FooterComponent,
    ProfileService,
    PageRibbonComponent,
    ErrorComponent
} from './layouts';
import { OrderByPipe } from './pipes/order-by.pipe';
import {ShipmentModule} from './shipment/shipment.module';
import {CapitalizePipe} from './pipes/capitalize.pipe';
import {AddressService} from './services/entities/address.service';
import {ItemService} from './services/entities/item.service';
import {OrderService} from './services/entities/order.service';
import {ReceiptService} from './services/entities/receipt.service';
import {PromotionService} from './services/entities/promotion.service';
import {ServiceService} from './services/entities/service.service';
import {AddressPopupService} from './services/entities/address-popup.service';
import {MonerisService} from './services/moneris.service';
import {ItemPopupService} from './services/entities/item-popup.service';
import {ServicePopupService} from './services/entities/service-popup.service';
import {OrderPopupService} from './services/entities/order-popup.service';
import {ReceiptPopupService} from './services/entities/receipt-popup.service';
import {PromotionPopupService} from './services/entities/promotion-popup.service';
import {LabelService} from './services/entities/label.service';
import {ExpressAccountService} from "./services/entities/express-account.service";
import {AdsService} from "./services/entities/ads.service";
import {AdsPopupService} from "./services/entities/ads-popup.service";

@NgModule({
    imports: [
        BrowserModule,
        LayoutRoutingModule,
        Ng2Webstorage.forRoot({ prefix: 'jhi', separator: '-'}),
        ArtonexpressSharedModule,
        ArtonexpressHomeModule,
        ArtonexpressAdminModule,
        ArtonexpressAccountModule,
        ArtonexpressEntityModule,
        BrowserAnimationsModule,
        // jhipster-needle-angular-add-module JHipster will add new module here
        ShipmentModule,
    ],
    declarations: [
        JhiMainComponent,
        NavbarComponent,
        ErrorComponent,
        PageRibbonComponent,
        FooterComponent,
        OrderByPipe,
        CapitalizePipe
    ],
    providers: [
        ProfileService,
        customHttpProvider(),
        PaginationConfig,
        UserRouteAccessService,
        CountryListService,
        AddressService,
        ItemService,
        ServiceService,
        OrderService,
        ReceiptService,
        PromotionService,
        AddressPopupService,
        ItemPopupService,
        ServicePopupService,
        OrderPopupService,
        ReceiptPopupService,
        PromotionPopupService,
        MonerisService,
        LabelService,
        ExpressAccountService,
        AdsService,
        AdsPopupService
    ],
    bootstrap: [ JhiMainComponent ]
})
export class ArtonexpressAppModule {}
