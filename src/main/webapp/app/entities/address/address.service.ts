import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { JhiDateUtils } from 'ng-jhipster';

import { Address } from './address.model';
import { ResponseWrapper, createRequestOption } from '../../shared';

@Injectable()
export class AddressService {

    private resourceUrl = 'api/addresses';

    constructor(private http: Http, private dateUtils: JhiDateUtils) { }

    create(address: Address): Observable<Address> {
        const copy = this.convert(address);
        return this.http.post(this.resourceUrl, copy).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    update(address: Address): Observable<Address> {
        const copy = this.convert(address);
        return this.http.put(this.resourceUrl, copy).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    find(id: number): Observable<Address> {
        return this.http.get(`${this.resourceUrl}/${id}`).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
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
        for (let i = 0; i < jsonResponse.length; i++) {
            this.convertItemFromServer(jsonResponse[i]);
        }
        return new ResponseWrapper(res.headers, jsonResponse, res.status);
    }

    private convertItemFromServer(entity: any) {
        entity.createdDate = this.dateUtils
            .convertLocalDateFromServer(entity.createdDate);
        entity.updatedDate = this.dateUtils
            .convertLocalDateFromServer(entity.updatedDate);
    }

    private convert(address: Address): Address {
        const copy: Address = Object.assign({}, address);
        copy.createdDate = this.dateUtils
            .convertLocalDateToServer(address.createdDate);
        copy.updatedDate = this.dateUtils
            .convertLocalDateToServer(address.updatedDate);
        return copy;
    }
}
