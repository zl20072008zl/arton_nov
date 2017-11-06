import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { JhiDateUtils } from 'ng-jhipster';

import { Promotion } from './promotion.model';
import { ResponseWrapper, createRequestOption } from '../../shared';

@Injectable()
export class PromotionService {

    private resourceUrl = 'api/promotions';

    constructor(private http: Http, private dateUtils: JhiDateUtils) { }

    create(promotion: Promotion): Observable<Promotion> {
        const copy = this.convert(promotion);
        return this.http.post(this.resourceUrl, copy).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    update(promotion: Promotion): Observable<Promotion> {
        const copy = this.convert(promotion);
        return this.http.put(this.resourceUrl, copy).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    find(id: number): Observable<Promotion> {
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
        entity.startDate = this.dateUtils
            .convertLocalDateFromServer(entity.startDate);
        entity.expiredDate = this.dateUtils
            .convertLocalDateFromServer(entity.expiredDate);
    }

    private convert(promotion: Promotion): Promotion {
        const copy: Promotion = Object.assign({}, promotion);
        copy.createdDate = this.dateUtils
            .convertLocalDateToServer(promotion.createdDate);
        copy.updatedDate = this.dateUtils
            .convertLocalDateToServer(promotion.updatedDate);
        copy.startDate = this.dateUtils
            .convertLocalDateToServer(promotion.startDate);
        copy.expiredDate = this.dateUtils
            .convertLocalDateToServer(promotion.expiredDate);
        return copy;
    }
}
