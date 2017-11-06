"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var ServiceDialogComponent = (function () {
    function ServiceDialogComponent(activeModal, alertService, serviceService, eventManager) {
        this.activeModal = activeModal;
        this.alertService = alertService;
        this.serviceService = serviceService;
        this.eventManager = eventManager;
    }
    ServiceDialogComponent.prototype.ngOnInit = function () {
        this.isSaving = false;
        this.authorities = ['ROLE_USER', 'ROLE_ADMIN'];
    };
    ServiceDialogComponent.prototype.clear = function () {
        this.activeModal.dismiss('cancel');
    };
    ServiceDialogComponent.prototype.save = function () {
        this.isSaving = true;
        if (this.service.id !== undefined) {
            this.subscribeToSaveResponse(this.serviceService.update(this.service));
        }
        else {
            this.subscribeToSaveResponse(this.serviceService.create(this.service));
        }
    };
    ServiceDialogComponent.prototype.subscribeToSaveResponse = function (result) {
        var _this = this;
        result.subscribe(function (res) {
            return _this.onSaveSuccess(res);
        }, function (res) { return _this.onSaveError(res); });
    };
    ServiceDialogComponent.prototype.onSaveSuccess = function (result) {
        this.eventManager.broadcast({ name: 'serviceListModification', content: 'OK' });
        this.isSaving = false;
        this.activeModal.dismiss(result);
    };
    ServiceDialogComponent.prototype.onSaveError = function (error) {
        try {
            error.json();
        }
        catch (exception) {
            error.message = error.text();
        }
        this.isSaving = false;
        this.onError(error);
    };
    ServiceDialogComponent.prototype.onError = function (error) {
        this.alertService.error(error.message, null, null);
    };
    return ServiceDialogComponent;
}());
ServiceDialogComponent = __decorate([
    core_1.Component({
        selector: 'jhi-service-dialog',
        templateUrl: './service-dialog.component.html'
    })
], ServiceDialogComponent);
exports.ServiceDialogComponent = ServiceDialogComponent;
var ServicePopupComponent = (function () {
    function ServicePopupComponent(route, servicePopupService) {
        this.route = route;
        this.servicePopupService = servicePopupService;
    }
    ServicePopupComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.routeSub = this.route.params.subscribe(function (params) {
            if (params['id']) {
                _this.modalRef = _this.servicePopupService
                    .open(ServiceDialogComponent, params['id']);
            }
            else {
                _this.modalRef = _this.servicePopupService
                    .open(ServiceDialogComponent);
            }
        });
    };
    ServicePopupComponent.prototype.ngOnDestroy = function () {
        this.routeSub.unsubscribe();
    };
    return ServicePopupComponent;
}());
ServicePopupComponent = __decorate([
    core_1.Component({
        selector: 'jhi-service-popup',
        template: ''
    })
], ServicePopupComponent);
exports.ServicePopupComponent = ServicePopupComponent;
