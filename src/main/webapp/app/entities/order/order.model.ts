import { BaseEntity } from './../../shared';

export class Order implements BaseEntity {
    constructor(
        public id?: number,
        public createdDate?: any,
        public updatedDate?: any,
        public totalCharges?: number,
        public orderId?: string,
        public trackingNumber?: string,
        public shipperId?: number,
        public recipientId?: number,
        public itemId?: number,
        public serviceId?: number,
        public promotionId?: number,
        public user?: string,
        public receiptId?: number,
        public labelId?: number,
    ) {
    }
}
