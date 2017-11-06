import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { Address } from '../../../entities/address/address.model';
import { AddressPopupService } from '../../../services/entities/address-popup.service';
import { AddressService } from '../../../services/entities/address.service';

@Component({
    selector: 'jhi-admin-address-delete-dialog',
    templateUrl: './admin-address-delete-dialog.component.html'
})
export class AdminAddressDeleteDialogComponent {

    address: Address;

    constructor(
        private addressService: AddressService,
        public activeModal: NgbActiveModal,
        private eventManager: JhiEventManager
    ) {
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.addressService.delete(id).subscribe((response) => {
            this.eventManager.broadcast({
                name: 'addressListModification',
                content: 'Deleted an address'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-admin-address-delete-popup',
    template: ''
})
export class AdminAddressDeletePopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private addressPopupService: AddressPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            this.modalRef = this.addressPopupService
                .open(AdminAddressDeleteDialogComponent, params['id']);
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
