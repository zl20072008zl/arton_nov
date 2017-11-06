import {Injectable} from '@angular/core';
import { Http, Response } from '@angular/http';
import {ShipmentRequest} from '../../shipment/shipment.model';
import {TrackingDetailResponse} from '../trackingDetailResponse';
import {TrackingSummeryResponse} from '../trackingSummeryResponse';
import { DatePipe } from '@angular/common';
import {Observable} from 'rxjs/Rx';
import {UpsCodeService} from './ups-code.service';
import {ExpressAccountService} from "../entities/express-account.service";
import {ExpressAccount} from "../../entities/express-account/express-account.model";

@Injectable()
export class UpsService {
    private trackingSummery: any;
    private trackingDetail: any;

    private trackUrl = 'https://wwwcie.ups.com/rest/Track';
    private rateUrl = 'https://wwwcie.ups.com/rest/Rate';
    private shippingUrl = 'https://wwwcie.ups.com/rest/Ship';
    private voidUrl = 'https://wwwcie.ups.com/rest/Void';
    private labelUrl = 'https://wwwcie.ups.com/rest/LBRecovery';
    private timeUrl = 'https://wwwcie.ups.com/rest/TimeInTransit';

    // private trackUrl = "https://onlinetools.ups.com/rest/Track";
    // private rateUrl = "https://onlinetools.ups.com/rest/Rate";
    // private shippingUrl = "https://onlinetools.ups.com/rest/Ship ";
    // private voidUrl = "https://onlinetools.ups.com/rest/Void";
    // private labelUrl = "https://onlinetools.ups.com/rest/LBRecovery";
    // private timeUrl = "https://onlinetools.ups.com/rest/TimeInTransit";

    private username = 'lmywilks';
    private password = 'Lmy121314';
    private license = 'AD35F3AD75F7DA0D';
    private accountNumber = '22F8F4';

    private account: any;

    constructor(
        private http: Http,
        private datePipe: DatePipe,
        private upsCodeService: UpsCodeService,
        private expressAccountService:ExpressAccountService
    ) {
    }

    getTracking(trackingNumber: string) {
        console.log(this.account);
        return this.http.post(this.trackUrl, this.setTrackRequest(trackingNumber))
            .map((res: Response) => {
                return this.setTrackResponse(res.json());
            });
    };

    getShipping(shipmentRequest: ShipmentRequest) {
        return this.http.post(this.shippingUrl, this.setShipRequest(shipmentRequest))
            .map((res: Response) => {
                const shipment: any = {};
                if (res.json().ShipmentResponse && res.json().ShipmentResponse.Response.ResponseStatus.Code == '1') {
                    const response = res.json().ShipmentResponse.ShipmentResults;
                    shipment.trackingNumber = response.PackageResults.TrackingNumber;
                    shipment.shipmentId = response.ShipmentIdentificationNumber;
                    shipment.shippingLabel = response.PackageResults.ShippingLabel.GraphicImage;
                    // shipment.shippingLabel = response.PackageResults.ShippingLabel.HTMLImage;
                }
                return shipment;
            });
    };

    getRate(shipmentRequest: ShipmentRequest, service?: any) {
        return this.http.post(this.rateUrl, this.setRateRequest(shipmentRequest, service))
            .map((res: Response) => res.json());
    };

    getLabel(trackingNumber: string) {
        return this.http.post(this.labelUrl, this.setLabelRequest(trackingNumber))
            .map((res: Response) => {
                let stream: string;
                if (res.json().LabelRecoveryResponse && res.json().LabelRecoveryResponse.Response.ResponseStatus.Code == 1) {
                    stream = res.json().LabelRecoveryResponse.LabelResults.LabelImage.GraphicImage;
                }
                return stream;
            });
    };

    getVoid(trackingNumber: string) {
        return this.http.post(this.voidUrl, this.setVoidRequest(trackingNumber))
            .map((res: Response) => res.json());
    };

    getTnt(rate: any) {
        let scope: any = {};
        let services: any = [];
        return this.http.post(this.timeUrl, this.setTntRequest(rate))
            .map((res: Response) => {
                let observables = [];
                if (res.json().TimeInTransitResponse.Response.ResponseStatus.Code == '1') {
                    res.json().TimeInTransitResponse.TransitResponse.ServiceSummary.forEach((service) => {
                        scope[this.upsCodeService.getCode(service.Service.Description).code] = {
                            expectedDeliveryDate : service.EstimatedArrival.Arrival.Date + ' ' + service.EstimatedArrival.Arrival.Time,
                            expectedTransitTime : service.EstimatedArrival.TotalTransitDays
                        };
                        observables.push(this.getRate(rate, this.upsCodeService.getCode(service.Service.Description)));
                    });
                    Observable.forkJoin(observables)
                        .subscribe((results) => {
                            results.forEach((data: Response) => {
                                const service = this.setRateResponse(data);
                                if (service) {
                                    service.expectedDeliveryDate = scope[service.code].expectedDeliveryDate;
                                    service.expectedTransitTime = scope[service.code].expectedTransitTime;

                                    services.push(service);
                                }
                            });
                        })
                }
                return services;
            });
    };

    private setTrackRequest(trackingNumber: string)  {
        return { 'UPSSecurity': { 'UsernameToken': { 'Username': this.username, 'Password': this.password }, 'ServiceAccessToken': { 'AccessLicenseNumber': this.license } }, 'TrackRequest': { 'Request': { 'RequestOption': '1', 'TransactionReference': { 'CustomerContext': 'Your Test Case Summary Description' } }, 'InquiryNumber': trackingNumber } };
    };

    private setTrackResponse(res: any) {
        const response: any = {};

        if (res.TrackResponse && res.TrackResponse.Response.ResponseStatus.Code == '1') {
            const request = res.TrackResponse.Shipment;
            response.trackingSummery = new TrackingSummeryResponse();
            response.trackingDetail = [];

            response.trackingSummery.trackingNumber = request.Package.TrackingNumber;
            response.trackingSummery.mailedOnDate = request.PickupDate;
            response.trackingSummery.serviceName = request.Service.Description;
            if (request.Package.Activity instanceof Array) {
                if (request.Package.Activity[0]) {
                    if (request.Package.Activity[0].Date) {
                        response.trackingSummery.eventDateTime = request.Package.Activity[0].Date;
                    }
                    if (request.Package.Activity[0].Time) {
                        response.trackingSummery.eventDateTime += request.Package.Activity[0].Time;
                    }
                    if (request.Package.Activity[0].Status) {
                        response.trackingSummery.eventDescription = request.Package.Activity[0].Status.Description;
                    }
                    if (request.Package.Activity[0].ActivityLocation) {
                        response.trackingSummery.eventLocation = request.Package.Activity[0].ActivityLocation.Address.City + ', ' + request.Package.Activity[0].ActivityLocation.Address.CountryCode;
                        response.trackingSummery.signatoryName = request.Package.Activity[0].ActivityLocation.SignedForByName;
                    }
                }

                request.Package.Activity.forEach((activity) => {
                    const entity: any = {};
                    if (activity.ActivityLocation) {
                        entity.city = activity.ActivityLocation.Address.City;
                        entity.province = activity.ActivityLocation.Address.CountryCode;
                        entity.signatoryName = activity.ActivityLocation.SignedForByName;
                    }
                    if (activity.Status) {
                        entity.status = activity.Status.Description;
                    }
                    if (activity.Date) {
                        entity.date = activity.Date;
                    }
                    if (activity.Time) {
                        entity.time = activity.Time;
                    }
                    response.trackingDetail.push(entity);
                });
            } else {
                const entity: any = {};

                if (request.Package.Activity) {
                    if (request.Package.Activity.Status) {
                        response.trackingSummery.eventDescription = request.Package.Activity.Status.Description;
                        entity.status = request.Package.Activity.Status.Description;
                    }
                    if (request.Package.Activity.Date) {
                        response.trackingSummery.eventDateTime = request.Package.Activity.Date;
                        entity.date = request.Package.Activity.Date;
                    }
                    if (request.Package.Activity.Time) {
                        response.trackingSummery.eventDateTime += request.Package.Activity.Time;
                        entity.time = request.Package.Activity.Time;
                    }
                    if (request.Package.Activity.ActivityLocation) {
                        response.trackingSummery.eventLocation = request.Package.Activity.ActivityLocation.Address.City + ', ' + request.Package.Activity.ActivityLocation.Address.CountryCode;
                        response.trackingSummery.signatoryName = request.Package.Activity.ActivityLocation.SignedForByName;
                        entity.signatoryName = request.Package.Activity.ActivityLocation.SignedForByName;
                        entity.city = request.Package.Activity.ActivityLocation.Address.City;
                        entity.province = request.Package.Activity.ActivityLocation.Address.CountryCode;
                    }
                }

                response.trackingDetail.push(entity);
            }
        }
        return response;
    };

    private setShipRequest(shipmentRequest: ShipmentRequest) {
        const request = {
            'UPSSecurity': {
                'UsernameToken': {
                    'Username': this.username,
                    'Password': this.password
                },
                'ServiceAccessToken': {
                    'AccessLicenseNumber': this.license
                }
            },
            'ShipmentRequest': {
                'Request': {
                    'RequestOption': 'validate',
                    'TransactionReference': {
                        'CustomerContext': 'Your Customer Context'
                    }
                },
                'Shipment': {
                    'Description': 'Description',
                    'Shipper': {
                        'Name': shipmentRequest.sender.name,
                        'AttentionName': shipmentRequest.sender.name,
                        'Phone': {
                            'Number': shipmentRequest.sender.phone
                        },
                        'ShipperNumber': this.accountNumber,
                        'Address': {
                            'AddressLine': shipmentRequest.sender.address1 + ' ' + shipmentRequest.sender.address2 || '',
                            'City': shipmentRequest.sender.city,
                            'StateProvinceCode': shipmentRequest.sender.provinceCode,
                            'PostalCode': shipmentRequest.sender.postalCode.replace(/\s/g, ''),
                            'CountryCode': shipmentRequest.sender.countryCode
                        }
                    },
                    'ShipTo': {
                        'Name': shipmentRequest.recipient.name,
                        'AttentionName': shipmentRequest.recipient.name,
                        'Phone': {
                            'Number': shipmentRequest.recipient.phone
                        },
                        'Address': {
                            'AddressLine': shipmentRequest.recipient.address1 + ' ' + shipmentRequest.recipient.address2 || '',
                            'City': shipmentRequest.recipient.city,
                            'StateProvinceCode': shipmentRequest.recipient.provinceCode,
                            'PostalCode': shipmentRequest.recipient.postalCode.replace(/\s/g, ''),
                            'CountryCode': shipmentRequest.recipient.countryCode
                        }
                    },
                    'ShipFrom': {
                        'Name': shipmentRequest.sender.name,
                        'AttentionName': shipmentRequest.sender.name,
                        'Phone': {
                            'Number': shipmentRequest.sender.phone
                        },
                        'Address': {
                            'AddressLine': shipmentRequest.sender.address1 + ' ' + shipmentRequest.sender.address2 || '',
                            'City': shipmentRequest.sender.city,
                            'StateProvinceCode': shipmentRequest.sender.provinceCode,
                            'PostalCode': shipmentRequest.sender.postalCode.replace(/\s/g, ''),
                            'CountryCode': shipmentRequest.sender.countryCode
                        }
                    },
                    'PaymentInformation': {
                        'ShipmentCharge': {
                            'Type': '01',
                            'BillShipper': {
                                'AccountNumber': this.accountNumber
                            }
                        }
                    },
                    'Service': {
                        'Code': shipmentRequest.service.code,
                        'Description': shipmentRequest.service.name
                    },
                    'Package': {
                        'Description': 'Description',
                        'Packaging': {
                            'Code': shipmentRequest.parcel.type == 'Customer Package' ? '02' : '01',
                            'Description': 'Description'
                        },
                        'PackageWeight': {
                            'UnitOfMeasurement': {
                                'Code': shipmentRequest.parcel.unit
                            },
                            'Weight': shipmentRequest.parcel.weight.toString()
                        }
                    }
                },
                'LabelSpecification': {
                    'LabelImageFormat': {
                        'Code': 'GIF',
                        'Description': 'GIF'
                    },
                    'HTTPUserAgent': 'Mozilla/4.5'
                }
            }
        };

        if (shipmentRequest.parcel.length && shipmentRequest.parcel.width && shipmentRequest.parcel.height) {
            request['ShipmentRequest']['Shipment']['Package']['Dimensions'] = {
                'UnitOfMeasurement': {
                    'Code': shipmentRequest.parcel.unit == 'KGS' ? 'CM' : 'IN'
                },
                'Length': shipmentRequest.parcel.length,
                'Width': shipmentRequest.parcel.width,
                'Height': shipmentRequest.parcel.height
            };
        }

        return request;
    };

    private setRateRequest(shipmentRequest: ShipmentRequest, service?: any) {
        const req = {
            'UPSSecurity': {
                'UsernameToken': {
                    'Username': this.username,
                    'Password': this.password
                },
                'ServiceAccessToken': {
                    'AccessLicenseNumber': this.license
                }
            },
            'RateRequest': {
                'Request': {
                    'RequestOption': 'Rate',
                    'TransactionReference': {
                        'CustomerContext': 'Your Customer Context'
                    }
                },
                'Shipment': {
                    'Shipper': {
                        'Name': shipmentRequest.sender.name || '',
                        'ShipperNumber': this.accountNumber,
                        'Address': {
                            'AddressLine': [ shipmentRequest.sender.address1 || '', shipmentRequest.sender.address2 || ''],
                            'City': shipmentRequest.sender.city || '',
                            'StateProvinceCode': shipmentRequest.sender.provinceCode || '',
                            'PostalCode': shipmentRequest.sender.postalCode.replace(/\s/g, ''),
                            'CountryCode': shipmentRequest.sender.countryCode
                        }
                    },
                    'ShipTo': {
                        'Name': shipmentRequest.recipient.name || '',
                        'Address': {
                            'AddressLine': [ shipmentRequest.recipient.address1 || '', shipmentRequest.recipient.address2 || ''],
                            'City': shipmentRequest.recipient.city || '',
                            'StateProvinceCode': shipmentRequest.recipient.provinceCode || '',
                            'PostalCode': shipmentRequest.recipient.postalCode.replace(/\s/g, ''),
                            'CountryCode': shipmentRequest.recipient.countryCode
                        }
                    },
                    'ShipFrom': {
                        'Name': shipmentRequest.sender.name || '',
                        'Address': {
                            'AddressLine': [ shipmentRequest.sender.address1 || '', shipmentRequest.sender.address2 || ''],
                            'City': shipmentRequest.sender.city || '',
                            'StateProvinceCode': shipmentRequest.sender.provinceCode || '',
                            'PostalCode': shipmentRequest.sender.postalCode.replace(/\s/g, ''),
                            'CountryCode': shipmentRequest.sender.countryCode
                        }
                    },
                    'Service': {
                        'Code': (service && service.code) ? service.code : shipmentRequest.service.code || '',
                        'Description': (service && service.description) ? service.description : shipmentRequest.service.name || ''
                    },
                    'Package': {
                        'PackagingType': {
                            'Code': shipmentRequest.parcel.type == 'Customer Package' ? '02' : '01',
                            'Description': 'Rate'
                        },
                        'PackageWeight': {
                            'UnitOfMeasurement': {
                                'Code': shipmentRequest.parcel.unit
                            },
                            'Weight': shipmentRequest.parcel.weight.toString()
                        }
                    },
                    'ShipmentRatingOptions': { 'NegotiatedRatesIndicator': '' }
                }
            }
        };

        if (shipmentRequest.parcel.length && shipmentRequest.parcel.width && shipmentRequest.parcel.height) {
            req['RateRequest']['Shipment']['Package']['Dimensions'] = {
                'UnitOfMeasurement': {
                    'Code': shipmentRequest.parcel.unit == 'KGS' ? 'CM' : 'IN'
                },
                'Length': shipmentRequest.parcel.length,
                'Width': shipmentRequest.parcel.width,
                'Height': shipmentRequest.parcel.height
            };
        }
        return req;
    };

    private setRateResponse(res: any) {
        let service: any = false;
        if (res && res.RateResponse && res.RateResponse.Response.ResponseStatus.Code == '1') {
            service = {
                company: 'UPS',
                name: res.RateResponse.RatedShipment.Service.Description || this.upsCodeService.getCode(res.RateResponse.RatedShipment.Service.Code).description,
                code: res.RateResponse.RatedShipment.Service.Code,
                price: res.RateResponse.RatedShipment.TotalCharges.MonetaryValue
            }
        }
        return service;
    };

    private setLabelRequest(trackingNumber: string) {
        return {
            'UPSSecurity': {
                'UsernameToken': {
                    'Username': this.username,
                    'Password': this.password
                },
                'ServiceAccessToken': {
                    'AccessLicenseNumber': '2D0E8F7B97F312C8'
                }
            },
            'LabelRecoveryRequest': {
                'LabelSpecification': {
                    'LabelImageFormat': {
                        'Code': 'GIF'
                    },
                    'HTTPUserAgent': 'Mozilla/4.5'
                },
                'Translate': {
                    'LanguageCode': 'eng',
                    'DialectCode': 'GB',
                    'Code': '01'
                },
                'TrackingNumber': trackingNumber
            }
        };
    };

    private setVoidRequest(trackingNumber: string) {
        return {
            'UPSSecurity': {
                'UsernameToken': {
                    'Username': this.username,
                    'Password': this.password
                },
                'UPSServiceAccessToken': {
                    'AccessLicenseNumber': this.license
                }
            },
            'VoidShipmentRequest': {
                'Request': {
                    'TransactionReference': {
                        'CustomerContext': 'Your Customer Context'
                    }
                },
                'VoidShipment': {
                    'ShipmentIdentificationNumber': trackingNumber
                }
            }
        }
    };

    private setTntRequest(rate: any) {
        return {
            'Security': {
                'UsernameToken': {
                    'Username': this.username,
                    'Password': this.password
                },
                'UPSServiceAccessToken': {
                    'AccessLicenseNumber': this.license
                }
            },
            'TimeInTransitRequest': {
                'Request': {
                    'RequestOption': 'TNT',
                    'TransactionReference': {
                        'CustomerContext': '',
                        'TransactionIdentifier': ''
                    }
                },
                'ShipFrom': {
                    'Address': {
                        'StateProvinceCode': rate.sender.provinceCode,
                        'CountryCode': rate.sender.countryCode,
                        'PostalCode': rate.sender.postalCode.replace(/\s/g, '')
                    }
                },
                'ShipTo': {
                    'Address': {
                        'StateProvinceCode': rate.recipient.provinceCode,
                        'CountryCode': rate.recipient.countryCode,
                        'PostalCode': rate.recipient.postalCode.replace(/\s/g, '')
                    }
                },
                'Pickup': {
                    'Date': this.datePipe.transform(new Date(), 'yyyyMMdd')
                },
                'ShipmentWeight': {
                    'UnitOfMeasurement': {
                        'Code': rate.parcel.unit
                    },
                    'Weight': rate.parcel.weight.toString()
                },
                'MaximumListSize': '1'
            }
        };
    };
}
