import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { JhiDateUtils } from 'ng-jhipster';

import { Order } from '../../entities/order/order.model';
import { ResponseWrapper, createRequestOption } from '../../shared';

@Injectable()
export class OrderService {

    private resourceUrl = 'api/orders';

    constructor(private http: Http, private dateUtils: JhiDateUtils) { }

    create(order: Order): Observable<Order> {
        const copy = this.convert(order, true);
        return this.http.post(this.resourceUrl, copy).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    update(order: Order): Observable<Order> {
        const copy = this.convert(order);
        return this.http.put(this.resourceUrl, copy).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    find(id: number): Observable<Order> {
        return this.http.get(`${this.resourceUrl}/${id}`).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    findByUser(login: string, req?: any): Observable<ResponseWrapper> {
        const options = createRequestOption(req);
        return this.http.get(`${this.resourceUrl}/user/${login}`, options)
            .map((res: Response) => this.convertResponse(res));
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

    private convert(order: Order, create?: boolean): Order {
        const copy: Order = Object.assign({}, order);
        if (create) {
            copy.createdDate = this.dateUtils
                .convertLocalDateToServer({
                    year : new Date().getFullYear(),
                    month : new Date().getMonth() + 1,
                    day : new Date().getDate()
                });
        }

        copy.updatedDate = this.dateUtils
            .convertLocalDateToServer({
                year : new Date().getFullYear(),
                month : new Date().getMonth() + 1,
                day : new Date().getDate()
            });
        return copy;
    }
}
