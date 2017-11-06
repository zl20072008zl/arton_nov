import { BaseEntity } from './../../shared';

export class Address implements BaseEntity {
    constructor(
        public id?: number,
        public createdDate?: any,
        public updatedDate?: any,
        public name?: string,
        public address1?: string,
        public address2?: string,
        public city?: string,
        public province?: string,
        public provinceCode?: string,
        public country?: string,
        public countryCode?: string,
        public postalCode?: string,
        public phone?: string,
        public user?: string,
    ) {
    }
}
