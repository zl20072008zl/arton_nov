import { Injectable, Component } from '@angular/core';
import { Router } from '@angular/router';
import { NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { Ads } from '../../entities/ads/ads.model';
import { AdsService } from './ads.service';

@Injectable()
export class AdsPopupService {
    private isOpen = false;
    constructor(
        private modalService: NgbModal,
        private router: Router,
        private adsService: AdsService

    ) {}

    open(component: Component, id?: number | any): NgbModalRef {
        if (this.isOpen) {
            return;
        }
        this.isOpen = true;

        if (id) {
            this.adsService.find(id).subscribe((ads) => {
                // if (ads.createDate) {
                //     ads.createDate = {
                //         year: ads.createDate.getFullYear(),
                //         month: ads.createDate.getMonth() + 1,
                //         day: ads.createDate.getDate()
                //     };
                // }
                // if (ads.updateDate) {
                //     ads.updateDate = {
                //         year: ads.updateDate.getFullYear(),
                //         month: ads.updateDate.getMonth() + 1,
                //         day: ads.updateDate.getDate()
                //     };
                // }
                this.adsModalRef(component, ads);
            });
        } else {
            return this.adsModalRef(component, new Ads());
        }
    }

    adsModalRef(component: Component, ads: Ads): NgbModalRef {
        const modalRef = this.modalService.open(component, { size: 'lg', backdrop: 'static'});
        modalRef.componentInstance.ads = ads;
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
