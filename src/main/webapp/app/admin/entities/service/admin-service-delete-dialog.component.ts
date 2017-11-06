import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { Service } from '../../../entities/service/service.model';
import { ServicePopupService } from '../../../services/entities/service-popup.service';
import { ServiceService } from '../../../services/entities/service.service';

@Component({
    selector: 'jhi-admin-service-delete-dialog',
    templateUrl: './admin-service-delete-dialog.component.html'
})
export class AdminServiceDeleteDialogComponent {

    service: Service;

    constructor(
        private serviceService: ServiceService,
        public activeModal: NgbActiveModal,
        private eventManager: JhiEventManager
    ) {
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.serviceService.delete(id).subscribe((response) => {
            this.eventManager.broadcast({
                name: 'serviceListModification',
                content: 'Deleted an service'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-admin-service-delete-popup',
    template: ''
})
export class AdminServiceDeletePopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private servicePopupService: ServicePopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            this.modalRef = this.servicePopupService
                .open(AdminServiceDeleteDialogComponent, params['id']);
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
