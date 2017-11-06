import { Routes } from '@angular/router';

import {
    activateRoute,
    passwordResetFinishRoute,
    passwordResetInitRoute,
    registerRoute,
    socialRegisterRoute,
    socialAuthRoute,
} from './';

const ACCOUNT_ROUTES = [
    activateRoute,
    passwordResetFinishRoute,
    passwordResetInitRoute,
    registerRoute,
    socialAuthRoute,
    socialRegisterRoute,
];

export const accountState: Routes = [{
    path: '',
    children: ACCOUNT_ROUTES
}];
