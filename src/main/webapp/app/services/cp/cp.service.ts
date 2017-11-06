import { Injectable }       from '@angular/core';
import { Http, Response }    from '@angular/http';
import { Observable }       from 'rxjs/Rx';

import 'rxjs/add/operator/toPromise';

import { TrackingSummeryResponse } from '../trackingSummeryResponse';
import { TrackingDetailResponse } from '../trackingDetailResponse';
import {LocalStorageService} from 'ng2-webstorage';
import {Principal} from '../../shared/auth/principal.service';
import {Res} from 'awesome-typescript-loader/dist/checker/protocol';

@Injectable()
export class CpService {

    private cpTrackingSummeryUrl   = 'api/canadapost/track/summery';
    private cpTrackingDetailUrl    = 'api/canadapost/track/detail';
    private cpRateUrl              = 'api/canadapost/rate';
    private cpContractShipping     = 'api/canadapost/contract/shipping';
    private cpContractRefund       = 'api/canadapost/contract/refund';
    private cpNonContractShipping  = 'api/canadapost/noncontract/shipping';
    private cpNonContractRefund    = 'api/canadapost/noncontract/refund';
    private cpVoid                 = 'api/canadapost/void';
    private cpLabel                = 'api/canadapost/label';

    constructor(
        private http: Http
    ) { }

    getCpTrackingSummery(trackingNumber: string): Observable<any> {
        return this.http.post(this.cpTrackingSummeryUrl, trackingNumber)
            .map((res: Response) => {
            console.log(res.json())
                return res.json();
            });
    };

    getCpTrackingDetail(trackingNumber: string): Observable<any> {
        return this.http.post(this.cpTrackingDetailUrl, trackingNumber)
            .map((res: Response) => {
                console.log(res.json())

                return res.json();
            });
    };

    getCpRates(rates: any): Observable<any> {
        return this.http.post(this.cpRateUrl, rates)
            .map((res: Response) => {
                return res.json();
            });
    }

    getCpContractShipping(shipment: any): Observable<any> {
        return this.http.post(this.cpContractShipping, shipment)
            .map((res: Response) => {
                return res.json();
            });
    }

    getCpNonContractShipping(shipment: any): Observable<any> {
        return this.http.post(this.cpNonContractShipping, shipment)
            .map((res: Response) => {
            console.log(res.json())
                return res.json();
            });
    }

    getCpContractRefund(refund: any): Observable<any> {
        return this.http.post(this.cpContractRefund, refund)
            .map((res: Response) => {
                return res.json();
            });
    }

    getCpNonContractRefund(refund: any): Observable<any> {
        return this.http.post(this.cpNonContractRefund, refund)
            .map((res: Response) => {
                return res.json();
            });
    }

    getCpVoid(cancel: any): Observable<any> {
        return this.http.post(this.cpVoid, cancel)
            .map((res: Response) => {
                return res.json();
            });
    }

    getLabel(link: string): Observable<string> {
        return this.http.post(this.cpLabel, link)
            .map((res: Response) => {
                return res.text();
            });
    }
}
