import { Route } from '@angular/router';

import { UserRouteAccessService } from '../shared';
import { HomeComponent } from './';
import { TrackingComponent } from '../tracking/tracking.component';
import { RatesComponent } from '../rates/rates.component';

export const HOME_ROUTE: Route = {
    path: '',
    component: HomeComponent,
    data: {
        authorities: [],
        pageTitle: 'Welcome, Java Hipster!'
    }
};

export const TRACK_ROUTE: Route = {
    path: 'tracking/:trackingNumber',
    component: TrackingComponent,
    data: {
        authorities: [],
        pageTitle: 'Tracking Your Package'
    }
};

export const RATE_ROUTE: Route = {
    path: 'rates',
    component: RatesComponent,
    data: {
        authorities: [],
        pageTitle: 'Rates'
    }
};
