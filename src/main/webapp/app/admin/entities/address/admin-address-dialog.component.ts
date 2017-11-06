import {Component, OnInit, OnDestroy} from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Response } from '@angular/http';
import { Account} from '../../../shared';

import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { Address } from '../../../entities/address/address.model';
import { AddressPopupService } from '../../../services/entities/address-popup.service';
import { AddressService } from '../../../services/entities/address.service';
import {CountryListService} from '../../../services/country-list.service';
import {UserService} from '../../../shared/user/user.service';
import {Observable} from 'rxjs/Observable';
import {Principal} from "../../../shared/auth/principal.service";

@Component({
    selector: 'jhi-admin-address-dialog',
    templateUrl: './admin-address-dialog.component.html'
})
export class AdminAddressDialogComponent implements OnInit {

    account: Account;
    address: Address;
    authorities: any[];
    isSaving: boolean;
    createdDateDp: any;
    updatedDateDp: any;
    countries: any = [];
    states: any = [];
    users: any = [];

    constructor(
        public activeModal: NgbActiveModal,
        private alertService: JhiAlertService,
        private addressService: AddressService,
        private eventManager: JhiEventManager,
        private countryService: CountryListService,
        private userService: UserService,
        private principal: Principal
    ) {
    }

    ngOnInit() {
        this.isSaving = false;
        this.authorities = ['ROLE_USER', 'ROLE_ADMIN'];
        this.principal.identity().then(account => {
            this.account = account;
            Observable.forkJoin(
                this.countryService.getCounties(),
                this.userService.query()
            ).subscribe(
                (data) => {
                    this.countries = data[0];
                    this.users = data[1].json;

                    if (this.address.id) {
                        this.refresh_states();
                    }
                },
                (err) => console.error(err)
            );
        });
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    refresh_states() {
        this.address.countryCode = this.countries.filter((v) => v.name == this.address.country)[0].value;
        this.countryService.getStates(this.address.countryCode).subscribe((states) => this.states = states);
    }

    save() {
        this.isSaving = true;
        if (!this.address.user) {
            this.address.user = this.account.login;
        }
        if (this.address.id !== undefined) {
            this.subscribeToSaveResponse(
                this.addressService.update(this.address));
        } else {
            this.subscribeToSaveResponse(
                this.addressService.create(this.address));
        }
    }

    private subscribeToSaveResponse(result: Observable<Address>) {
        result.subscribe((res: Address) =>
            this.onSaveSuccess(res), (res: Response) => this.onSaveError(res));
    }

    private onSaveSuccess(result: Address) {
        this.eventManager.broadcast({ name: 'addressListModification', content: 'OK'});
        this.isSaving = false;
        this.activeModal.dismiss(result);
    }

    private onSaveError(error) {
        try {
            error.json();
        } catch (exception) {
            error.message = error.text();
        }
        this.isSaving = false;
        this.onError(error);
    }

    private onError(error) {
        this.alertService.error(error.message, null, null);
    }
}

@Component({
    selector: 'jhi-admin-address-popup',
    template: ''
})
export class AdminAddressPopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private addressPopupService: AddressPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            if ( params['id'] ) {
                this.modalRef = this.addressPopupService
                    .open(AdminAddressDialogComponent, params['id']);
            } else {
                this.modalRef = this.addressPopupService
                    .open(AdminAddressDialogComponent);
            }
        });
    }

    ngAfterViewInit() {

    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
