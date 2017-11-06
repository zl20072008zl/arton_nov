import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Rx';

import { ExpressAccount } from '../../entities/express-account/express-account.model';
import { ResponseWrapper, createRequestOption } from '../../shared';

@Injectable()
export class ExpressAccountService {

    private resourceUrl = 'api/express-accounts';

    constructor(private http: Http) { }

    create(expressAccount: ExpressAccount): Observable<ExpressAccount> {
        const copy = this.convert(expressAccount);
        return this.http.post(this.resourceUrl, copy).map((res: Response) => {
            return res.json();
        });
    }

    update(expressAccount: ExpressAccount): Observable<ExpressAccount> {
        const copy = this.convert(expressAccount);
        return this.http.put(this.resourceUrl, copy).map((res: Response) => {
            return res.json();
        });
    }

    find(id: number): Observable<ExpressAccount> {
        return this.http.get(`${this.resourceUrl}/${id}`).map((res: Response) => {
            return res.json();
        });
    }

    query(req?: any): Observable<ResponseWrapper> {
        const options = createRequestOption(req);
        return this.http.get(this.resourceUrl, options)
            .map((res: Response) => this.convertResponse(res));
    }

    delete(id: number): Observable<Response> {
        return this.http.delete(`${this.resourceUrl}/${id}`);
    }

    private convertResponse(res: Response): ResponseWrapper {
        const jsonResponse = res.json();
        return new ResponseWrapper(res.headers, jsonResponse, res.status);
    }

    private convert(expressAccount: ExpressAccount): ExpressAccount {
        const copy: ExpressAccount = Object.assign({}, expressAccount);
        return copy;
    }
}
