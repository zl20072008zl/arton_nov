import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { Label } from '../../../entities/label/label.model';
import { LabelPopupService } from '../../../services/entities/label-popup.service';
import { LabelService } from '../../../services/entities/label.service';

@Component({
    selector: 'jhi-label-delete-dialog',
    templateUrl: './admin-label-delete-dialog.component.html'
})
export class AdminLabelDeleteDialogComponent {

    label: Label;

    constructor(
        private labelService: LabelService,
        public activeModal: NgbActiveModal,
        private eventManager: JhiEventManager
    ) {
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.labelService.delete(id).subscribe((response) => {
            this.eventManager.broadcast({
                name: 'labelListModification',
                content: 'Deleted an label'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-admin-label-delete-popup',
    template: ''
})
export class AdminLabelDeletePopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private labelPopupService: LabelPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            this.modalRef = this.labelPopupService
                .open(AdminLabelDeleteDialogComponent, params['id']);
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
