import { Component, OnInit } from '@angular/core';
import {Principal} from "../shared/auth/principal.service";
import { Account} from '../shared';

@Component({
    selector: 'jhi-admin',
    templateUrl: './admin.component.html',
    styleUrls: ['admin.component.css']
})
export class AdminComponent implements OnInit {

    account:Account;

    public managements: any = [
        {
            link : 'user-management',
            name : 'User management',
            icon : 'fa-user',
            admin : true
        },
        {
            link : 'settings',
            name : 'Profile',
            icon : 'fa-file'
        },
        {
            link : 'password',
            name : 'Password',
            icon : 'fa-key'
        },
        {
            link : 'address',
            name : 'Address',
            icon : 'fa-address-card-o'
        },
        {
            link : 'order',
            name : 'Order',
            icon : 'fa-list'
        },
        {
            link : 'promotion',
            name : 'Promotion',
            icon : 'fa-money'
        },
        {
            link : 'item',
            name : 'Item',
            icon : 'fa-envelope',
            admin : true
        },
        {
            link : 'service',
            name : 'Service',
            icon : 'fa-server',
            admin : true
        },
        {
            link : 'receipt',
            name : 'Receipt',
            icon : 'fa-usd',
            admin : true
        },
        {
            link : 'label',
            name : 'Label',
            icon : 'fa-tag',
            admin : true
        },
        // {
        //     link : 'account',
        //     name : 'Account',
        //     icon : 'fa-book',
        //     admin : true
        // },
        // {
        //     link : 'jhi-tracker',
        //     name : 'User tracker',
        //     icon : 'fa-eye'
        // },
        // {
        //     link : 'jhi-metrics',
        //     name : 'Metrics',
        //     icon : 'fa-tachometer'
        // },
        // {
        //     link : 'jhi-health',
        //     name : 'Health',
        //     icon : 'fa-heart'
        // },
        // {
        //     link : 'jhi-configuration',
        //     name : 'Configuration',
        //     icon : 'fa-list'
        // },
        // {
        //     link : 'audits',
        //     name : 'Audits',
        //     icon : 'fa-bell'
        // },
        // {
        //     link : 'logs',
        //     name : 'Logs',
        //     icon : 'fa-tasks'
        // },
        // {
        //     link : 'docs',
        //     name : 'API',
        //     icon : 'fa-book'
        // },
        // {
        //     link : '',
        //     name : 'Entities',
        //     icon : 'fa-th-list'
        // }
    ];

    constructor(
        private principal: Principal,
    ) { }

    ngOnInit() {
        this.principal.identity().then((account) => {
            this.account = account;
        });
    }

    checkPriv(nav:any) {
        let flag = true;
        if (this.account.authorities.indexOf('ROLE_ADMIN') < 0 ){
            if (nav.admin) {
                flag = false;
            }
        }
        return flag;
    }
}
