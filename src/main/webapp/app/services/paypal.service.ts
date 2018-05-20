import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';

@Injectable()
export class PaypalService {
    private paypalUrl = 'api/paypal/';

  constructor(private http: Http) { }

  getPurchase(sum: any){
      return this.http.post(this.paypalUrl + 'purchase',sum)
          .map((res: Response) => res.json());
  }

  completePayment(paymentId, payerId) {
      console.log(paymentId)
    return this.http.post(this.paypalUrl + 'complete?paymentId=' + paymentId + '&payerId=' + payerId , {})
        .map((response: Response) => response.json());
  }

}
