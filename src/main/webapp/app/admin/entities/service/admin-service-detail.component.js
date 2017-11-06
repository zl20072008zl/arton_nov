"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var ServiceDetailComponent = (function () {
    function ServiceDetailComponent(eventManager, serviceService, route) {
        this.eventManager = eventManager;
        this.serviceService = serviceService;
        this.route = route;
    }
    ServiceDetailComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.subscription = this.route.params.subscribe(function (params) {
            _this.load(params['id']);
        });
        this.registerChangeInServices();
    };
    ServiceDetailComponent.prototype.load = function (id) {
        var _this = this;
        this.serviceService.find(id).subscribe(function (service) {
            _this.service = service;
        });
    };
    ServiceDetailComponent.prototype.previousState = function () {
        window.history.back();
    };
    ServiceDetailComponent.prototype.ngOnDestroy = function () {
        this.subscription.unsubscribe();
        this.eventManager.destroy(this.eventSubscriber);
    };
    ServiceDetailComponent.prototype.registerChangeInServices = function () {
        var _this = this;
        this.eventSubscriber = this.eventManager.subscribe('serviceListModification', function (response) { return _this.load(_this.service.id); });
    };
    return ServiceDetailComponent;
}());
ServiceDetailComponent = __decorate([
    core_1.Component({
        selector: 'jhi-service-detail',
        templateUrl: './service-detail.component.html'
    })
], ServiceDetailComponent);
exports.ServiceDetailComponent = ServiceDetailComponent;
