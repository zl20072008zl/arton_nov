import {Address} from '../entities/address/address.model';
import {Item} from '../entities/item/item.model';
import {Service} from '../entities/service/service.model';
import {Order} from '../entities/order/order.model';
import {Promotion} from '../entities/promotion/promotion.model';
import {Receipt} from '../entities/receipt/receipt.model';
import {Label} from '../entities/label/label.model';
/**
 * Created by limingyang on 2017/8/13.
 */
export class ShipmentRequest {
    constructor(
        public recipient?: Address,
        public parcel?: Item,
        public service?: Service,
        public user?: Account,
        public sender?: Address,
        public order?: Order,
        public promotion?: Promotion,
        public receipt?: Receipt,
        public label?: Label
    ) {}
}
