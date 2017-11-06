import { BaseEntity } from './../../shared';

export class Service implements BaseEntity {
    constructor(
        public id?: number,
        public createdDate?: any,
        public updatedDate?: any,
        public company?: string,
        public name?: string,
        public code?: string,
        public price?: number,
        public expectedDeliveryDate?: string,
        public expectedTransitTime?: string,
        public user?: string,
    ) {
    }
}
