import { Injectable, Component } from '@angular/core';
import { Router } from '@angular/router';
import { NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { Promotion } from './promotion.model';
import { PromotionService } from './promotion.service';

@Injectable()
export class PromotionPopupService {
    private isOpen = false;
    constructor(
        private modalService: NgbModal,
        private router: Router,
        private promotionService: PromotionService

    ) {}

    open(component: Component, id?: number | any): NgbModalRef {
        if (this.isOpen) {
            return;
        }
        this.isOpen = true;

        if (id) {
            this.promotionService.find(id).subscribe((promotion) => {
                // if (promotion.createdDate) {
                //     promotion.createdDate = {
                //         year: promotion.createdDate.getFullYear(),
                //         month: promotion.createdDate.getMonth() + 1,
                //         day: promotion.createdDate.getDate()
                //     };
                // }
                // if (promotion.updatedDate) {
                //     promotion.updatedDate = {
                //         year: promotion.updatedDate.getFullYear(),
                //         month: promotion.updatedDate.getMonth() + 1,
                //         day: promotion.updatedDate.getDate()
                //     };
                // }
                if (promotion.startDate) {
                    promotion.startDate = {
                        year: promotion.startDate.getFullYear(),
                        month: promotion.startDate.getMonth() + 1,
                        day: promotion.startDate.getDate()
                    };
                }
                if (promotion.expiredDate) {
                    promotion.expiredDate = {
                        year: promotion.expiredDate.getFullYear(),
                        month: promotion.expiredDate.getMonth() + 1,
                        day: promotion.expiredDate.getDate()
                    };
                }
                this.promotionModalRef(component, promotion);
            });
        } else {
            return this.promotionModalRef(component, new Promotion());
        }
    }

    promotionModalRef(component: Component, promotion: Promotion): NgbModalRef {
        const modalRef = this.modalService.open(component, { size: 'lg', backdrop: 'static'});
        modalRef.componentInstance.promotion = promotion;
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
