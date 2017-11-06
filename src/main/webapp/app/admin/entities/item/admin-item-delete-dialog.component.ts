import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { NgbActiveModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { Item } from '../../../entities/item/item.model';
import { ItemPopupService } from '../../../services/entities/item-popup.service';
import { ItemService } from '../../../services/entities/item.service';

@Component({
    selector: 'jhi-admin-item-delete-dialog',
    templateUrl: './admin-item-delete-dialog.component.html'
})
export class AdminItemDeleteDialogComponent {

    item: Item;

    constructor(
        private itemService: ItemService,
        public activeModal: NgbActiveModal,
        private eventManager: JhiEventManager
    ) {
    }

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.itemService.delete(id).subscribe((response) => {
            this.eventManager.broadcast({
                name: 'itemListModification',
                content: 'Deleted an item'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-item-delete-popup',
    template: ''
})
export class AdminItemDeletePopupComponent implements OnInit, OnDestroy {

    modalRef: NgbModalRef;
    routeSub: any;

    constructor(
        private route: ActivatedRoute,
        private itemPopupService: ItemPopupService
    ) {}

    ngOnInit() {
        this.routeSub = this.route.params.subscribe((params) => {
            this.modalRef = this.itemPopupService
                .open(AdminItemDeleteDialogComponent, params['id']);
        });
    }

    ngOnDestroy() {
        this.routeSub.unsubscribe();
    }
}
