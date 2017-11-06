import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import { Location } from '@angular/common';

import { CpService } from '../services/cp/cp.service';
import {Observable} from 'rxjs/Observable';
import {UpsService} from '../services/ups/ups.service';
import {FedexService} from '../services/fedex/fedex.service';

@Component({
  selector: 'jhi-tracking',
  templateUrl: './tracking.component.html',
  styles: []
})
export class TrackingComponent implements OnInit {
    trackingSummery: any;
    trackingDetail: any;
    trackingNumber: string;

  constructor(
      private router: Router,
      private route: ActivatedRoute,
      private location: Location,
      private cpService: CpService,
      private upsService: UpsService,
      private fedexService: FedexService
  ) { }

  ngOnInit() {
      this.route.params.subscribe((params) => {
          this.trackingNumber = params['trackingNumber'];
          this.load();
      });
  }

  load() {
      switch (true) {
          case this.trackingNumber.length == 16 :
              Observable.forkJoin(
                  this.cpService.getCpTrackingSummery(this.trackingNumber),
                  this.cpService.getCpTrackingDetail(this.trackingNumber)
              ).subscribe(
                  (data) => {
                      this.trackingSummery = data[0][0];
                      this.trackingDetail = data[1];
                  },
                  (err) => console.error(err)
              );
              break;
          case this.trackingNumber.indexOf('1Z') >= 0 && this.trackingNumber.length == 18:
              this.upsService.getTracking(this.trackingNumber)
                  .subscribe((res) => {
                      this.trackingSummery = res.trackingSummery;
                      this.trackingDetail = res.trackingDetail;
                  });
              break;
          case this.trackingNumber.length == 12 || this.trackingNumber.length == 15 || this.trackingNumber.length == 14:
              this.fedexService.getTrack(this.trackingNumber)
                  .subscribe((res) => {
                      this.trackingSummery = res.summery;
                      this.trackingDetail = res.details;
                  });
              break;
      }
  }

  track() {
      this.router.navigate(['/tracking', this.trackingNumber]);
  }

  back(): void {
      this.router.navigate(['/']);
  }

}
