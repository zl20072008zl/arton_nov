import {Component, Input, OnInit} from '@angular/core';
import {LocalStorageService} from 'ng2-webstorage';
import {OrderService} from '../../services/entities/order.service';
import {CpService} from '../../services/cp/cp.service';
import {MonerisService} from '../../services/moneris.service';
import {Router, ActivatedRoute} from '@angular/router';
import {ReceiptService} from '../../services/entities/receipt.service';
import {LabelService} from '../../services/entities/label.service';
import {UpsService} from '../../services/ups/ups.service';
import {FedexService} from '../../services/fedex/fedex.service';
import {PromotionService} from "../../entities/promotion/promotion.service";
import {Promotion} from "../../entities/promotion/promotion.model";
import {PaypalService} from "../../services/paypal.service";

@Component({
    selector: 'shipment-payment-component',
    templateUrl: './payment.component.html',
    styleUrls: ['../../../content/css/shipment.payment.component.css']
})
export class ShipmentPaymentComponent implements OnInit {

    @Input() request: any;

    public finalPrice: string;
    public paymentType: string;
    public payment: any = {
        name : '',
        card : '',
        cvv : '',
        month : '',
        year : ''
    };
    public months: any = ['01', '02', '03', '04', '05', '06', '07', '08', '09', '10', '11', '12'];
    public years: any = ['17', '18', '19', '20', '21', '22', '23', '24', '25', '26'];
    public paymentTypes: any = ['Credit Card', 'Account', 'PayPal'];

    constructor(
        private localSt: LocalStorageService,
        private orderService: OrderService,
        private cpService: CpService,
        private moneris: MonerisService,
        private paypal: PaypalService,
        private router: Router,
        private receiptService: ReceiptService,
        private labelService: LabelService,
        private upsService: UpsService,
        private fedexService: FedexService,
        private activatedRoute: ActivatedRoute,
        private promotionService: PromotionService
    ) { }

    ngOnInit() {
        this.finalPrice = parseFloat(this.request.order.totalCharges).toFixed(2);
        this.selectPromotion();
        this.fromPaypal();
    }

    submit() {

        if(this.paymentType == 'Account'){
            this.completeOrder(null);
        }else
        if (this.paymentType == 'Credit Card' && this.payment.name && this.payment.card && this.payment.cvv &&
            this.payment.month && this.payment.year
        ) {
            this.moneris.getPurchase({
                name: this.payment.name,
                orderId: this.request.order.orderId,
                amount: this.finalPrice,
                pan: this.payment.card,
                cvd: this.payment.cvv,
                expdate: (this.payment.year.toString() + this.payment.month.toString()),
                custId: this.request.user.login
            })
                .subscribe((res) => {
                    if (res.complete) {
                        this.completeOrder(res);
                    }
                });
        }else
        if(this.paymentType == 'PayPal'){
            this.paypal.getPurchase(this.finalPrice).subscribe((res) => {
                window.location.href = res.redirect_url;
            });
        }
    }

    fromPaypal(){
        this.activatedRoute.queryParams.subscribe(params => {
            let paymentId = params['paymentId'];
            let PayerID = params['PayerID'];
            if(paymentId&&PayerID){
                this.completePaypal(paymentId, PayerID);
            }
        });
    }
    completePaypal(paymentId, PayerID){
        document.getElementById('load-animation').style.display='block';
        document.getElementById('bg').style.display='block';
        this.paypal.completePayment(paymentId,PayerID).subscribe((res) => {
            if(res.status){
                this.completeOrder(res);
            }
        });
    }

    selectPromotion() {
        if(!this.request.user.promotionId){
            this.request.promotion.name = "No Promotion";
            this.request.promotion.percentageOff = 100;
        }else{
            this.promotionService.find(this.request.user.promotionId).subscribe((promotion) => {
                this.request.order.promotion = new Promotion();
                this.request.promotion = new Promotion();
                if(promotion.startDate < new Date() && promotion.expiredDate > new Date()){
                    this.request.order.promotion = promotion;
                    this.request.order.promotionId = promotion.id;
                    this.request.promotion = promotion;
                    this.finalPrice = (parseFloat(this.finalPrice) * (this.request.promotion.percentageOff / 100)).toFixed(2);
                }
                else{
                    this.request.promotion.name = "No Promotion";
                    this.request.promotion.percentageOff = 100;
                }
            });
        }
    }

    completeOrder(res){
        this.receiptService.create(res).subscribe((receipt) => {
            this.request.receipt = receipt;
            this.request.order.receiptId = this.request.receipt.id;
            this.request.order.totalCharges = this.finalPrice;
            switch (this.request.service.company) {
                case 'Canada Post':
                    this.cpService.getCpNonContractShipping(this.request)
                        .subscribe(
                            (data) => {
                                this.request.label.link = data.labelLink;
                                this.request.label.shipmentId = data.shipmentId;
                                this.request.label.shipmentStatus = 'Completed';
                                this.request.label.trackingNumber = data.trackingNumber;
                                delete this.request.label.id;

                                this.labelService.create(this.request.label)
                                    .subscribe((label) => {
                                        this.request.label = label;
                                        this.request.order.labelId = label.id;
                                        this.request.order.trackingNumber = label.trackingNumber;

                                        this.orderService.update(this.request.order)
                                            .subscribe(() => {
                                                this.localSt.store('shipment.request.data.' + this.request.user.login, this.request);
                                                this.router.navigate(['/shipment', 'label']);
                                            });
                                    });
                            }
                        );
                    break;
                case 'UPS':
                    this.upsService.getShipping(this.request)
                        .subscribe((res) => {
                            this.request.label.trackingNumber = res.trackingNumber;
                            this.request.label.shipmentId = res.shipmentId;
                            this.request.label.shippingLabel = res.shippingLabel;
                            this.request.label.shipmentStatus = 'Completed';
                            delete this.request.label.id;
                            this.labelService.create(this.request.label)
                                .subscribe((label) => {
                                    this.request.label = label;
                                    this.request.order.labelId = label.id;
                                    this.request.order.trackingNumber = label.trackingNumber;

                                    this.orderService.update(this.request.order)
                                        .subscribe(() => {
                                            this.localSt.store('shipment.request.data.' + this.request.user.login, this.request);
                                            this.router.navigate(['/shipment', 'label']);
                                        });
                                });
                        });
                    break;
                case 'Fedex':
                    this.fedexService.getShip(this.request)
                        .subscribe((res) => {
                            this.request.label.trackingNumber = res.trackingNumber;
                            this.request.label.shipmentId = res.shipmentId;
                            this.request.label.shippingLabel = res.labelLink;
                            this.request.label.shipmentStatus = 'Completed';
                            delete this.request.label.id;

                            this.labelService.create(this.request.label)
                                .subscribe((label) => {
                                    this.request.label = label;
                                    this.request.order.labelId = label.id;
                                    this.request.order.trackingNumber = label.trackingNumber;

                                    this.orderService.update(this.request.order)
                                        .subscribe(() => {
                                            this.localSt.store('shipment.request.data.' + this.request.user.login, this.request);
                                            this.router.navigate(['/shipment', 'label']);
                                        });
                                });
                        });
                    break;
            }
        });
    }

}
