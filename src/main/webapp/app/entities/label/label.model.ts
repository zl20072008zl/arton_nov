import { BaseEntity } from './../../shared';

export class Label implements BaseEntity {
    constructor(
        public id?: number,
        public createdDate?: any,
        public updatedDate?: any,
        public trackingNumber?: string,
        public shippingLabelContentType?: string,
        public shippingLabel?: any,
        public link?: string,
        public shipmentId?: string,
        public shipmentStatus?: string,
        public user?: string,
    ) {
    }
}
