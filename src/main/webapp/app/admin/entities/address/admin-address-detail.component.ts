import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager  } from 'ng-jhipster';

import { Address } from '../../../entities/address/address.model';
import { AddressService } from '../../../services/entities/address.service';

@Component({
    selector: 'jhi-admin-address-detail',
    templateUrl: './admin-address-detail.component.html'
})
export class AdminAddressDetailComponent implements OnInit, OnDestroy {

    address: Address;
    private subscription: Subscription;
    private eventSubscriber: Subscription;

    constructor(
        private eventManager: JhiEventManager,
        private addressService: AddressService,
        private route: ActivatedRoute
    ) {
    }

    ngOnInit() {
        this.subscription = this.route.params.subscribe((params) => {
            this.load(params['id']);
        });
        this.registerChangeInAddresses();
    }

    load(id) {
        this.addressService.find(id).subscribe((address) => {
            this.address = address;
        });
    }
    previousState() {
        window.history.back();
    }

    ngOnDestroy() {
        this.subscription.unsubscribe();
        this.eventManager.destroy(this.eventSubscriber);
    }

    registerChangeInAddresses() {
        this.eventSubscriber = this.eventManager.subscribe(
            'addressListModification',
            (response) => this.load(this.address.id)
        );
    }
}
