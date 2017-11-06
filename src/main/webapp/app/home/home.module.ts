import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { ArtonexpressSharedModule } from '../shared';

import { HOME_ROUTE, TRACK_ROUTE, RATE_ROUTE, HomeComponent } from './';
import { TrackingComponent } from '../tracking/tracking.component';
import { RatesComponent } from '../rates/rates.component';

import { CpService } from '../services/cp/cp.service';
import {UpsService} from '../services/ups/ups.service';
import {FedexService} from '../services/fedex/fedex.service';
import {UpsCodeService} from '../services/ups/ups-code.service';

@NgModule({
    imports: [
        ArtonexpressSharedModule,
        RouterModule.forRoot([ HOME_ROUTE ], { useHash: true }),
        RouterModule.forRoot([ TRACK_ROUTE ], { useHash: true }),
        RouterModule.forRoot([ RATE_ROUTE ], { useHash: true }),
        NgbModule
    ],
    declarations: [
        HomeComponent,
        TrackingComponent,
        RatesComponent
    ],
    entryComponents: [
    ],
    providers: [
        CpService,
        UpsService,
        FedexService,
        UpsCodeService
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ArtonexpressHomeModule {}
