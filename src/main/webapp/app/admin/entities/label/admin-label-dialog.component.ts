import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Response } from '@angular/http';

import { Observable } from 'rxjs/Rx';
import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager, JhiAlertService, JhiDataUtils } from 'ng-jhipster';

import { Label } from '../../../entities/label/label.model';
import { LabelPopupService } from '../../../services/entities/label-popup.service';
import { LabelService } from '../../../services/entities/label.service';
import {UserService} from '../../../shared/user/user.service';

@Component({
    selector: 'jhi-admin-label-dialog',
    templateUrl: './admin-label-dialog.component.html'
})
export class AdminLabelDialogComponent implements OnInit {

    label: Label;
    authorities: any[];
    isSaving: boolean;
    createdDateDp: any;
    updatedDateDp: any;
    users: any;

    constructor(
        public activeModal: NgbActiveModal,
        private dataUtils: JhiDataUtils,
        private alertService: JhiAlertService,
        private labelService: LabelService,
        private eventManager: JhiEventManager,
        private userService: UserService
    ) {
    }

    ngOnInit() {
        this.isSaving = false;
        this.authorities = ['ROLE_USER', 'ROLE_ADMIN'];
        this.userService.query().subscribe((users) => this.users = users.json);
    }

    byteSize(field) {
        return this.dataUtils.byteSize(field);
    }

    openFile(contentType, field) {
        return this.dataUtils.openFile(contentType, field);
    }

    setFileData(event, label, field, isImage) {
        if (event && event.target.files && event.target.files[0]) {
            const file = event.target.files[0];
            if (isImage && !/^image\//.test(file.type)) {
                return;
            }
            this.dataUtils.toBase64(file, (base64Data) => {
                label[field] = base64Data;
                label[`${field}ContentType`] = file.type;
            });
        }
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    save() {
        this.isSaving = true;
        if (this.label.id !== undefined) {
            this.subscribeToSaveResponse(
                this.labelService.update(this.label));
        } else {
            this.subscribeToSaveResponse(
                this.labelService.create(this.label));
        }
    }

    private subscribeToSaveResponse(result: Observable<Label>) {
        result.subscribe((res: Label) =>
            this.onSaveSuccess(res), (res: Response) => this.onSaveError(res));
    }

    private onSaveSuccess(result: Label) {
        this.eventManager.broadcast({ name: 'labelListModification', content: 'OK'});
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
    selector: 'jhi-admin-label-popup',
    template: ''
})
export class AdminLabelPopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private labelPopupService: LabelPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            if ( params['id'] ) {
                this.modalRef = this.labelPopupService
                    .open(AdminLabelDialogComponent, params['id']);
            } else {
                this.modalRef = this.labelPopupService
                    .open(AdminLabelDialogComponent);
            }
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
