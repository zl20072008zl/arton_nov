import {Routes} from '@angular/router';
import {ShipmentComponent} from './shipment.component';
import {UserRouteAccessService} from '../shared/auth/user-route-access-service';

export const SHIPMENT_ROUTES: Routes = [
    {
        path: 'shipment',
        component: ShipmentComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Shipment'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: 'shipment/:step',
        component: ShipmentComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Shipment'
        },
        canActivate: [UserRouteAccessService]
    }
];
