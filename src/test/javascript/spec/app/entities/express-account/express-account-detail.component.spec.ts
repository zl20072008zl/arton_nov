/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, async, inject } from '@angular/core/testing';
import { OnInit } from '@angular/core';
import { DatePipe } from '@angular/common';
import { ActivatedRoute } from '@angular/router';
import { Observable } from 'rxjs/Rx';
import { JhiDateUtils, JhiDataUtils, JhiEventManager } from 'ng-jhipster';
import { ArtonexpressTestModule } from '../../../test.module';
import { MockActivatedRoute } from '../../../helpers/mock-route.service';
import { ExpressAccountDetailComponent } from '../../../../../../main/webapp/app/entities/express-account/express-account-detail.component';
import { ExpressAccountService } from '../../../../../../main/webapp/app/services/entities/express-account.service';
import { ExpressAccount } from '../../../../../../main/webapp/app/entities/express-account/express-account.model';

describe('Component Tests', () => {

    describe('ExpressAccount Management Detail Component', () => {
        let comp: ExpressAccountDetailComponent;
        let fixture: ComponentFixture<ExpressAccountDetailComponent>;
        let service: ExpressAccountService;

        beforeEach(async(() => {
            TestBed.configureTestingModule({
                imports: [ArtonexpressTestModule],
                declarations: [ExpressAccountDetailComponent],
                providers: [
                    JhiDateUtils,
                    JhiDataUtils,
                    DatePipe,
                    {
                        provide: ActivatedRoute,
                        useValue: new MockActivatedRoute({id: 123})
                    },
                    ExpressAccountService,
                    JhiEventManager
                ]
            }).overrideTemplate(ExpressAccountDetailComponent, '')
            .compileComponents();
        }));

        beforeEach(() => {
            fixture = TestBed.createComponent(ExpressAccountDetailComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(ExpressAccountService);
        });

        describe('OnInit', () => {
            it('Should call load all on init', () => {
            // GIVEN

            spyOn(service, 'find').and.returnValue(Observable.of(new ExpressAccount(10)));

            // WHEN
            comp.ngOnInit();

            // THEN
            expect(service.find).toHaveBeenCalledWith(123);
            expect(comp.expressAccount).toEqual(jasmine.objectContaining({id: 10}));
            });
        });
    });

});
