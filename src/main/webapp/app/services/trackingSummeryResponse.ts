/**
 * Created by limingyang on 2017/7/23.
 */
export class TrackingSummeryResponse {
    constructor(
        public trackingNumber?: string,
        public mailedOnDate?: string,
        public eventDescription?: string,
        public actualDeliveryDate?: string,
        public attemptedDate?: string,
        public destinationPostal?: string,
        public destinationProvince?: string,
        public eventDateTime?: string,
        public eventLocation?: string,
        public eventType?: string,
        public expectedDeliveryDate?: string,
        public originPostal?: string,
        public serviceName?: string,
        public signatoryName?: string
    ) {}
}
