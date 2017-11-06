import {Component, DoCheck, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Service} from '../../entities/service/service.model';
import {Observable} from 'rxjs/Observable';
import {CpService} from '../../services/cp/cp.service';
import {LocalStorageService} from 'ng2-webstorage';
import {Router} from '@angular/router';
import {UpsService} from '../../services/ups/ups.service';
import {FedexService} from '../../services/fedex/fedex.service';

@Component({
    selector: 'shipment-service-component',
    templateUrl: './service.component.html',
    styleUrls: []
})
export class ShipmentServiceComponent implements OnInit, DoCheck {

    @Input() request: any;

    @Output() requestChange: EventEmitter<any> = new EventEmitter();

    public services: any = [];
    public selectedService: any;
    public sortReverse = false;

    constructor(
        private cpService: CpService,
        private router: Router,
        private localSt: LocalStorageService,
        private upsService: UpsService,
        private fedexService: FedexService
    ) { }

    ngOnInit() {
        if (!this.request.service) {
            this.request.service = new Service();
        }

        Observable.forkJoin(
            this.cpService.getCpRates(this.request),
            this.upsService.getTnt(this.request),
            this.fedexService.getRate(this.request)
        ).subscribe(
            (data) => {
                this.services = this.services.concat(data[0]);
                this.services = this.services.concat(data[1]);
                this.services = this.services.concat(data[2]);

                this.services = this.services.sort(function(a, b) {
                    return a.price - b.price;
                });
                if (this.request.service.code) {
                    this.selectedService = this.services.filter((v) => v.code == this.request.service.code)[0];
                }
            },
            (err) => console.error(err)
        );
    }

    selectService(service: any): void {
        this.selectedService = service;
        Object.keys(this.selectedService).forEach((key) => {
            this.request.service[key] = this.selectedService[key];
        });
    }

    sort(): void {
        this.sortReverse = !this.sortReverse;
        if (this.sortReverse) {
            this.services = this.services.reverse();
        }
    }

    ngDoCheck() {
        this.requestChange.emit(this.request);
    }

    next() {
        if (this.check()) {
            this.localSt.store('shipment.request.data.' + this.request.user.login, this.request);
            this.router.navigate(['/shipment', 'details']);
        }
    }

    back() {
        this.router.navigate(['/shipment', 'item']);
    }

    check() {
        return !!(this.request.service.company && this.request.service.code &&
            this.request.service.name && this.request.service.price);
    }
}
