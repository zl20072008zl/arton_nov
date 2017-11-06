import { BaseEntity } from './../../shared';

export class Item implements BaseEntity {
    constructor(
        public id?: number,
        public createdDate?: any,
        public updatedDate?: any,
        public type?: string,
        public value?: number,
        public unit?: string,
        public weight?: number,
        public length?: number,
        public width?: number,
        public height?: number,
        public user?: string,
    ) {
    }
}
