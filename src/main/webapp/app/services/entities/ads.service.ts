import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs/Rx';
import { JhiDateUtils } from 'ng-jhipster';

import { Ads } from '../../entities/ads/ads.model';
import { ResponseWrapper, createRequestOption } from '../../shared';

@Injectable()
export class AdsService {

    private resourceUrl = 'api/ads';
    private list     = 'api/ads/list';
    public file: File;

    constructor(private http: Http, private dateUtils: JhiDateUtils) { }

    create(ads: Ads): Observable<Ads> {
        const copy = this.convert(ads,true);
        return this.http.post(this.resourceUrl, copy).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    update(ads: Ads): Observable<Ads> {
        const copy = this.convert(ads);
        return this.http.put(this.resourceUrl, copy).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    find(id: number): Observable<Ads> {
        return this.http.get(`${this.resourceUrl}/${id}`).map((res: Response) => {
            const jsonResponse = res.json();
            this.convertItemFromServer(jsonResponse);
            return jsonResponse;
        });
    }

    findAll(): Observable<any>{
        return this.http.get(this.list)
            .map((res) => {
                return res.json().sort();
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

    fileChange(fileList: any): Promise<string> {
        if(fileList.length > 0) {
            let file: File = fileList[0];
            let formData:FormData = new FormData();
            // formData.append("id","666");
            formData.append('uploadFile', file);
            let headers = new Headers();
            /** No need to include Content-Type in Angular 4 */
            headers.append('Content-Type', 'multipart/form-data');
            headers.append('Accept', 'application/json');


            return this.http.post('/api/ads/uploadImage', formData, headers).toPromise().
            then(res => res.json())
                .catch(error => Observable.throw(error));
        }
    }

    private convertResponse(res: Response): ResponseWrapper {
        const jsonResponse = res.json();
        for (let i = 0; i < jsonResponse.length; i++) {
            this.convertItemFromServer(jsonResponse[i]);
        }
        return new ResponseWrapper(res.headers, jsonResponse, res.status);
    }

    private convertItemFromServer(entity: any) {
        entity.createDate = this.dateUtils
            .convertLocalDateFromServer(entity.createDate);
        entity.updateDate = this.dateUtils
            .convertLocalDateFromServer(entity.updateDate);
    }

    private convert(ads: Ads, create?: boolean): Ads {
        const copy: Ads = Object.assign({}, ads);
        if (create) {
            copy.createDate = new Date();
        }

        copy.updateDate = new Date();
        return copy;
    }
}
