import {Injectable} from '@angular/core';
import {Http, Response} from '@angular/http';

@Injectable()
export class MonerisService{
    private monerisUrl = 'api/moneris/purchase';

    constructor(
        private http: Http
    ) { }

    getPurchase(payment: any) {
        return this.http.post(this.monerisUrl, payment)
            .map((res: Response) => res.json());
    }
}
