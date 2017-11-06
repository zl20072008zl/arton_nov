"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
Object.defineProperty(exports, "__esModule", { value: true });
var core_1 = require("@angular/core");
var ServiceDeleteDialogComponent = (function () {
    function ServiceDeleteDialogComponent(serviceService, activeModal, eventManager) {
        this.serviceService = serviceService;
        this.activeModal = activeModal;
        this.eventManager = eventManager;
    }
    ServiceDeleteDialogComponent.prototype.clear = function () {
        this.activeModal.dismiss('cancel');
    };
    ServiceDeleteDialogComponent.prototype.confirmDelete = function (id) {
        var _this = this;
        this.serviceService.delete(id).subscribe(function (response) {
            _this.eventManager.broadcast({
                name: 'serviceListModification',
                content: 'Deleted an service'
            });
            _this.activeModal.dismiss(true);
        });
    };
    return ServiceDeleteDialogComponent;
}());
ServiceDeleteDialogComponent = __decorate([
    core_1.Component({
        selector: 'jhi-service-delete-dialog',
        templateUrl: './service-delete-dialog.component.html'
    })
], ServiceDeleteDialogComponent);
exports.ServiceDeleteDialogComponent = ServiceDeleteDialogComponent;
var ServiceDeletePopupComponent = (function () {
    function ServiceDeletePopupComponent(route, servicePopupService) {
        this.route = route;
        this.servicePopupService = servicePopupService;
    }
    ServiceDeletePopupComponent.prototype.ngOnInit = function () {
        var _this = this;
        this.routeSub = this.route.params.subscribe(function (params) {
            _this.modalRef = _this.servicePopupService
                .open(ServiceDeleteDialogComponent, params['id']);
        });
    };
    ServiceDeletePopupComponent.prototype.ngOnDestroy = function () {
        this.routeSub.unsubscribe();
    };
    return ServiceDeletePopupComponent;
}());
ServiceDeletePopupComponent = __decorate([
    core_1.Component({
        selector: 'jhi-service-delete-popup',
        template: ''
    })
], ServiceDeletePopupComponent);
exports.ServiceDeletePopupComponent = ServiceDeletePopupComponent;
