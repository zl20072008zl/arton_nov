import {Component, Input, OnInit} from '@angular/core';
import { Location } from '@angular/common';
import {CpService} from '../services/cp/cp.service';
import {ActivatedRoute, Router} from '@angular/router';
import {Account, Principal} from '../shared';
import {LocalStorageService} from 'ng2-webstorage';
import {ShipmentRequest} from "../shipment/shipment.model";

@Component({
  selector: 'jhi-rates',
  templateUrl: './rates.component.html',
  styles: []
})
export class RatesComponent implements OnInit {
    account: Account;
    services: any[] = [];
    selectedService: any;
    request:ShipmentRequest;


    constructor(
        private principal: Principal,
        private router: Router,
        private location: Location,
        private localStorageService: LocalStorageService
    ) {
    }

    ngOnInit() {
        //this.principal.identity().then((account) => {
            //this.account = account;
            // this.services = this.localStorageService.retrieve('shipment.rates.data.' + this.account.login);
            // this.request = this.localStorageService.retrieve('shipment.request.data.' + this.account.login);
            this.services = this.localStorageService.retrieve('shipment.rates.data.');
            this.request = this.localStorageService.retrieve('shipment.request.data.');
        //});
    }

    back(): void {
        this.location.back();
    }

    shipment() {
        this.principal.identity().then((account) => {
            this.account = account;
            if(this.account){
                if (this.selectedService) {
                    this.localStorageService.store('shipment.request.data.' + this.account.login, this.request);
                    this.router.navigate(['/shipment']);
                }
            }else{
                this.router.navigate(['/register']);
            }
        });

    }

    selectService(service: any): void {
        this.selectedService = service;
        Object.keys(this.selectedService).forEach((key) => {
            this.request.service[key] = this.selectedService[key];
        });
    }


}
