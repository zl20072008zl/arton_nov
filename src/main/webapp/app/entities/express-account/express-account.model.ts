import { BaseEntity } from './../../shared';

export class ExpressAccount implements BaseEntity {
    constructor(
        public id?: number,
        public cpUserName?: string,
        public cpPassword?: string,
        public cpMailedBy?: string,
        public cpContractId?: string,
        public upsUserName?: string,
        public upsPassword?: string,
        public upsAccessLicenseNumber?: string,
        public upsAccountNumber?: string,
        public fedexAccountNumber?: string,
        public fedexMeterNumber?: string,
        public fedexKey?: string,
        public fedexPassword?: string,
    ) {
    }
}
