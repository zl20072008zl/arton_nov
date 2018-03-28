import { BaseEntity } from './../../shared';

export class Ads implements BaseEntity {
    constructor(
        public id?: number,
        public name?: string,
        public imagePath?: string,
        public description?: string,
        public sort?: number,
        public createDate?: Date,
        public updateDate?: Date,
        public activated?: boolean,
    ) {
        this.activated = false;
    }
}
