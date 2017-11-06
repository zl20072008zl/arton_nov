import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Response } from '@angular/http';

import { Observable } from 'rxjs/Rx';
import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager, JhiAlertService } from 'ng-jhipster';

import { Item } from '../../../entities/item/item.model';
import { ItemPopupService } from '../../../services/entities/item-popup.service';
import { ItemService } from '../../../services/entities/item.service';
import {UserService} from '../../../shared/index';

@Component({
    selector: 'jhi-admin-item-dialog',
    templateUrl: './admin-item-dialog.component.html'
})
export class AdminItemDialogComponent implements OnInit {

    item: Item;
    authorities: any[];
    isSaving: boolean;
    createdDateDp: any;
    updatedDateDp: any;
    users: any;

    public packaging_types: string[] = ['Customer Package', 'Envelope'];
    public units: string[] = ['KGS', 'LGS'];

    constructor(
        public activeModal: NgbActiveModal,
        private alertService: JhiAlertService,
        private itemService: ItemService,
        private eventManager: JhiEventManager,
        private userService: UserService
    ) {
    }

    ngOnInit() {
        this.isSaving = false;
        this.authorities = ['ROLE_USER', 'ROLE_ADMIN'];
        this.userService.query().subscribe((users) => this.users = users.json);
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    save() {
        this.isSaving = true;
        if (this.item.id !== undefined) {
            this.subscribeToSaveResponse(
                this.itemService.update(this.item));
        } else {
            this.subscribeToSaveResponse(
                this.itemService.create(this.item));
        }
    }

    private subscribeToSaveResponse(result: Observable<Item>) {
        result.subscribe((res: Item) =>
            this.onSaveSuccess(res), (res: Response) => this.onSaveError(res));
    }

    private onSaveSuccess(result: Item) {
        this.eventManager.broadcast({ name: 'itemListModification', content: 'OK'});
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
    selector: 'jhi-item-popup',
    template: ''
})
export class AdminItemPopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private itemPopupService: ItemPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            if ( params['id'] ) {
                this.modalRef = this.itemPopupService
                    .open(AdminItemDialogComponent, params['id']);
            } else {
                this.modalRef = this.itemPopupService
                    .open(AdminItemDialogComponent);
            }
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
