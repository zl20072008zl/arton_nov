import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager  } from 'ng-jhipster';

import { Receipt } from '../../../entities/receipt/receipt.model';
import { ReceiptService } from '../../../services/entities/receipt.service';

@Component({
    selector: 'jhi-admin-receipt-detail',
    templateUrl: './admin-receipt-detail.component.html'
})
export class AdminReceiptDetailComponent implements OnInit, OnDestroy {

    receipt: Receipt;
    private subscription: Subscription;
    private eventSubscriber: Subscription;

    constructor(
        private eventManager: JhiEventManager,
        private receiptService: ReceiptService,
        private route: ActivatedRoute
    ) {
    }

    ngOnInit() {
        this.subscription = this.route.params.subscribe((params) => {
            this.load(params['id']);
        });
        this.registerChangeInReceipts();
    }

    load(id) {
        this.receiptService.find(id).subscribe((receipt) => {
            this.receipt = receipt;
        });
    }
    previousState() {
        window.history.back();
    }

    ngOnDestroy() {
        this.subscription.unsubscribe();
        this.eventManager.destroy(this.eventSubscriber);
    }

    registerChangeInReceipts() {
        this.eventSubscriber = this.eventManager.subscribe(
            'receiptListModification',
            (response) => this.load(this.receipt.id)
        );
    }
}
