import { BaseEntity } from './../../shared';

export class Promotion implements BaseEntity {
    constructor(
        public id?: number,
        public createdDate?: any,
        public updatedDate?: any,
        public name?: string,
        public description?: string,
        public percentageOff?: number,
        public startDate?: any,
        public expiredDate?: any,
    ) {
    }
}
