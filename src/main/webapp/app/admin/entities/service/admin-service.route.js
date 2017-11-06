"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var shared_1 = require("../../shared");
var admin_service_component_1 = require("./admin-service.component");
var service_detail_component_1 = require("./admin-service-detail.component");
var service_dialog_component_1 = require("./admin-service-dialog.component");
var service_delete_dialog_component_1 = require("./admin-service-delete-dialog.component");
var ServiceResolvePagingParams = (function () {
    function ServiceResolvePagingParams(paginationUtil) {
        this.paginationUtil = paginationUtil;
    }
    ServiceResolvePagingParams.prototype.resolve = function (route, state) {
        var page = route.queryParams['page'] ? route.queryParams['page'] : '1';
        var sort = route.queryParams['sort'] ? route.queryParams['sort'] : 'id,asc';
        return {
            page: this.paginationUtil.parsePage(page),
            predicate: this.paginationUtil.parsePredicate(sort),
            ascending: this.paginationUtil.parseAscending(sort)
        };
    };
    return ServiceResolvePagingParams;
}());
ServiceResolvePagingParams = __decorate([
    core_1.Injectable()
], ServiceResolvePagingParams);
exports.ServiceResolvePagingParams = ServiceResolvePagingParams;
exports.serviceRoute = [
    {
        path: 'service',
        component: admin_service_component_1.ServiceComponent,
        resolve: {
            'pagingParams': ServiceResolvePagingParams
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [shared_1.UserRouteAccessService]
    }, {
        path: 'service/:id',
        component: service_detail_component_1.ServiceDetailComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [shared_1.UserRouteAccessService]
    }
];
exports.servicePopupRoute = [
    {
        path: 'service-new',
        component: service_dialog_component_1.ServicePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [shared_1.UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'service/:id/edit',
        component: service_dialog_component_1.ServicePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [shared_1.UserRouteAccessService],
        outlet: 'popup'
    },
    {
        path: 'service/:id/delete',
        component: service_delete_dialog_component_1.ServiceDeletePopupComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Services'
        },
        canActivate: [shared_1.UserRouteAccessService],
        outlet: 'popup'
    }
];
