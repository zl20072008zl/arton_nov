import {Component, DoCheck, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {CpService} from '../../services/cp/cp.service';
import {DomSanitizer} from '@angular/platform-browser';
import {NgbModal, ModalDismissReasons} from '@ng-bootstrap/ng-bootstrap';
import {UpsService} from '../../services/ups/ups.service';
import {FedexService} from '../../services/fedex/fedex.service';

@Component({
    selector: 'shipment-label-component',
    templateUrl: './label.component.html',
    styles: []
})
export class ShipmentLabelComponent implements OnInit, DoCheck {

    @Input() request: any;

    @Output() requestChange: EventEmitter<any> = new EventEmitter();

    public stream: any;
    closeResult: string;

    constructor(
        private cpService: CpService,
        private sanitizer: DomSanitizer,
        private modalService: NgbModal,
        private upsService: UpsService,
        private fedexService: FedexService
    ) { }

    ngOnInit() {
console.log(this.request)
    }

    ngDoCheck() {
        this.requestChange.emit(this.request);
    }

    getLabel(content) {
        switch (this.request.service.company) {
            case 'Canada Post':
                this.cpService.getLabel(this.request.label.link)
                    .subscribe((res) => {
                        this.stream = this.sanitizer.bypassSecurityTrustResourceUrl('data:application/pdf;base64,' + res);
                        this.modalService.open(content, {size: 'lg'}).result.then((result) => {
                            this.closeResult = `Closed with: ${result}`;

                        }, (reason) => {
                            this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
                        });
                    });
                break;
            case 'UPS':
                //'1Z12345E8791315509'
                this.upsService.getLabel(this.request.label.trackingNumber)
                    .subscribe((res) => {
                        this.stream = this.sanitizer.bypassSecurityTrustResourceUrl('data:application/pdf;base64,' + res);
                        this.modalService.open(content, {size: 'lg'}).result.then((result) => {
                            this.closeResult = `Closed with: ${result}`;

                        }, (reason) => {
                            this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
                        });
                    });
                break;
            case 'Fedex':
                this.stream = this.sanitizer.bypassSecurityTrustResourceUrl('data:application/pdf;base64,' + this.request.label.shippingLabel);
                this.modalService.open(content, {size: 'lg'}).result.then((result) => {
                    this.closeResult = `Closed with: ${result}`;

                }, (reason) => {
                    this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
                });
                break;
        }

    }

    private getDismissReason(reason: any): string {
        if (reason === ModalDismissReasons.ESC) {
            return 'by pressing ESC';
        } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
            return 'by clicking on a backdrop';
        } else {
            return  `with: ${reason}`;
        }
    }
}
