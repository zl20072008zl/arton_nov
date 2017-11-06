import { Injectable, Component } from '@angular/core';
import { Router } from '@angular/router';
import { NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { Service } from '../../entities/service/service.model';
import { ServiceService } from './service.service';

@Injectable()
export class ServicePopupService {
    private isOpen = false;
    constructor(
        private modalService: NgbModal,
        private router: Router,
        private serviceService: ServiceService

    ) {}

    open(component: Component, id?: number | any): NgbModalRef {
        if (this.isOpen) {
            return;
        }
        this.isOpen = true;

        if (id) {
            this.serviceService.find(id).subscribe((service) => {
                if (service.createdDate) {
                    service.createdDate = {
                        year: service.createdDate.getFullYear(),
                        month: service.createdDate.getMonth() + 1,
                        day: service.createdDate.getDate()
                    };
                }
                if (service.updatedDate) {
                    service.updatedDate = {
                        year: service.updatedDate.getFullYear(),
                        month: service.updatedDate.getMonth() + 1,
                        day: service.updatedDate.getDate()
                    };
                }
                this.serviceModalRef(component, service);
            });
        } else {
            return this.serviceModalRef(component, new Service());
        }
    }

    serviceModalRef(component: Component, service: Service): NgbModalRef {
        const modalRef = this.modalService.open(component, { size: 'lg', backdrop: 'static'});
        modalRef.componentInstance.service = service;
        modalRef.result.then((result) => {
            this.router.navigate([{ outlets: { popup: null }}], { replaceUrl: true });
            this.isOpen = false;
        }, (reason) => {
            this.router.navigate([{ outlets: { popup: null }}], { replaceUrl: true });
            this.isOpen = false;
        });
        return modalRef;
    }
}
