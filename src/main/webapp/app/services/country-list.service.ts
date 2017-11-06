import { Injectable } from '@angular/core';
import {Observable} from 'rxjs/Observable';
import {Http} from '@angular/http';
import {count} from 'rxjs/operator/count';

@Injectable()
export class CountryListService {

    private list     = 'api/country/list';
    private retrieve = 'api/country/retrieve';

  constructor(private http: Http) { }

    getCounties(): Observable<any> {
    return this.http.get(this.list)
        .map((res) => {
            return res.json().sort(function(a, b) {
                const nameA = a.name.toUpperCase(); // ignore upper and lowercase
                const nameB = b.name.toUpperCase(); // ignore upper and lowercase
                if (nameA < nameB) {
                    return -1;
                }
                if (nameA > nameB) {
                    return 1;
                }

                // names must be equal
                return 0;
            });
        });
  }

  getStates(code: string): Observable<any> {
      return this.http.get(`${this.retrieve}/${code}`)
          .map((res) => {
              return res.json().sort(function(a, b) {
                  const nameA = a.name.toUpperCase(); // ignore upper and lowercase
                  const nameB = b.name.toUpperCase(); // ignore upper and lowercase
                  if (nameA < nameB) {
                      return -1;
                  }
                  if (nameA > nameB) {
                      return 1;
                  }

                  // names must be equal
                  return 0;
              }); ;
          });
  }

  getState(country: string, state: string): Observable<any> {
      return this.http.get(`${this.retrieve}/${country}/${state}`)
          .map((res) => {
              return res.json();
          });
  }
}
