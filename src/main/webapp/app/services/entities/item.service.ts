import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { JhiDateUtils } from 'ng-jhipster';

import { Item } from '../../entities/item/item.model';
import { ResponseWrapper, createRequestOption } from '../../shared';

@Injectable()
export class ItemService {

    private resourceUrl = 'api/items';

    constructor(private http: Http, private dateUtils: JhiDateUtils) { }

    create(item: Item): Observable<Item> {
        const copy = this.convert(item, true);
        return this.http.post(this.resourceUrl, copy).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    update(item: Item): Observable<Item> {
        const copy = this.convert(item);
        return this.http.put(this.resourceUrl, copy).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    find(id: number): Observable<Item> {
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

    private convert(item: Item, create?: boolean): Item {
        const copy: Item = Object.assign({}, item);
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
