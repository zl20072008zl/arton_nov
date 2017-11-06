import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {RouterModule} from '@angular/router';
import {SHIPMENT_ROUTES} from './shipment.route';

import {ShipmentComponent} from './shipment.component';
import {FormsModule} from '@angular/forms';
import {ShipmentAddressComponent} from './address/address.component';
import {ShipmentItemComponent} from './item/item.component';
import {ShipmentServiceComponent} from './service/service.component';
import {ShipmentDetailComponent} from './detail/detail.component';

import {MdCardModule, MdButtonModule} from '@angular/material';
import {ShipmentPaymentComponent} from './payment/payment.component';
import {ShipmentLabelComponent} from './label/label.component';

const ENTITY_STATES = [
    ...SHIPMENT_ROUTES
];

@NgModule({
    imports: [
        CommonModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true }),
        NgbModule,
        FormsModule,
        MdCardModule,
        MdButtonModule
    ],
    declarations: [
        ShipmentComponent,
        ShipmentAddressComponent,
        ShipmentItemComponent,
        ShipmentServiceComponent,
        ShipmentDetailComponent,
        ShipmentPaymentComponent,
        ShipmentLabelComponent
    ],
    entryComponents: [
    ]
})
export class ShipmentModule { }
