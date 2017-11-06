import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { ArtonexpressSharedModule } from '../shared';

import {
    Register,
    ActivateService,
    PasswordResetInitService,
    PasswordResetFinishService,
    RegisterComponent,
    ActivateComponent,
    PasswordResetInitComponent,
    PasswordResetFinishComponent,
    SocialRegisterComponent,
    SocialAuthComponent,
    accountState
} from './';

@NgModule({
    imports: [
        ArtonexpressSharedModule,
        RouterModule.forRoot(accountState, { useHash: true })
    ],
    declarations: [
        SocialRegisterComponent,
        SocialAuthComponent,
        ActivateComponent,
        RegisterComponent,
        PasswordResetInitComponent,
        PasswordResetFinishComponent,
    ],
    providers: [
        Register,
        ActivateService,
        PasswordResetInitService,
        PasswordResetFinishService
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class ArtonexpressAccountModule {}
