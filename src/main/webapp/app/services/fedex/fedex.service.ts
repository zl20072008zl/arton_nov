import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';
import {Observable} from 'rxjs/Rx';
import {TrackingSummeryResponse} from '../trackingSummeryResponse';

@Injectable()
export class FedexService{
    private trackUrl = 'api/fedex/track';
    private rateUrl = 'api/fedex/rate';
    private shipUrl = 'api/fedex/ship';

    constructor(
        private http: Http
    ) { }

    getTrack(trackingNumber: string): Observable<any>{
        return this.http.post(this.trackUrl, trackingNumber)
            .map((res: Response) => {
                if (res.json().highestSeverity.value == 'SUCCESS') {
                    const trackDetail = res.json().completedTrackDetails[0].trackDetails[0];
                    const trackingSummery = new TrackingSummeryResponse();
                    const trackingDetails = [];
                    trackingSummery.trackingNumber = trackDetail.trackingNumber;
                    trackingSummery.destinationPostal = trackDetail.destinationAddress.postalCode;
                    trackingSummery.destinationProvince = trackDetail.destinationAddress.stateOrProvinceCode;
                    trackingSummery.eventDateTime = trackDetail.statusDetail.creationTime;
                    trackingSummery.eventDescription = trackDetail.statusDetail.description;
                    trackingSummery.eventType = trackDetail.statusDetail.code;
                    trackingSummery.eventLocation = trackDetail.statusDetail.location.city + ', ' + trackDetail.statusDetail.location.city + ',' + trackDetail.statusDetail.location.countryCode;

                    trackDetail.datesOrTimes.forEach((date) => {
                        if (date.type.value == 'ACTUAL_DELIVERY') {
                            trackingSummery.actualDeliveryDate = date.dateOrTimestamp;
                        }
                    });

                    trackingSummery.originPostal = trackDetail.shipperAddress.postalCode;
                    trackingSummery.serviceName = trackDetail.service.description;
                    trackingSummery.signatoryName = trackDetail.siguature;

                    trackDetail.events.forEach((event) => {
                        trackingDetails.push({
                            date : event.timestamp.split('T')[0],
                            time : event.timestamp.split('T')[1].split('.')[0],
                            city : event.address.city,
                            province : event.address.stateOrProvinceCode,
                            status : event.eventDescription
                        });
                    });

                    return {
                        details : trackingDetails,
                        summery : trackingSummery
                    }
                }
            });
    }

    getRate(shipment: any): Observable<any>{
        return this.http.post(this.rateUrl, shipment)
            .map((res: Response) => res.json());
    }

    getShip(shipment: any): Observable<any> {
        return this.http.post(this.shipUrl, shipment)
            .map((res: Response) => {
                console.log(res.json())
                return res.json()
            });
    }
}
