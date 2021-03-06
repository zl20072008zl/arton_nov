import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { JhiEventManager  } from 'ng-jhipster';

import { Service } from '../../../entities/service/service.model';
import { ServiceService } from '../../../services/entities/service.service';

@Component({
    selector: 'jhi-admin-service-detail',
    templateUrl: './admin-service-detail.component.html'
})
export class AdminServiceDetailComponent implements OnInit, OnDestroy {

    service: Service;
    private subscription: Subscription;
    private eventSubscriber: Subscription;

    constructor(
        private eventManager: JhiEventManager,
        private serviceService: ServiceService,
        private route: ActivatedRoute
    ) {
    }

    ngOnInit() {
        this.subscription = this.route.params.subscribe((params) => {
            this.load(params['id']);
        });
        this.registerChangeInServices();
    }

    load(id) {
        this.serviceService.find(id).subscribe((service) => {
            this.service = service;
        });
    }
    previousState() {
        window.history.back();
    }

    ngOnDestroy() {
        this.subscription.unsubscribe();
        this.eventManager.destroy(this.eventSubscriber);
    }

    registerChangeInServices() {
        this.eventSubscriber = this.eventManager.subscribe(
            'serviceListModification',
            (response) => this.load(this.service.id)
        );
    }
}
