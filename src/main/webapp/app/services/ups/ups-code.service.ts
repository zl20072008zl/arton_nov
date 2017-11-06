import {Injectable} from '@angular/core';

@Injectable()
export class UpsCodeService {

    private serviceCode = {
        '02' : {
            code: '02',
            description: 'UPS Expedited'
        },
        '13' : {
            code: '13',
            description: 'UPS Express Saver'
        },
        '12' : {
            code: '12',
            description: 'UPS 3 Day Select'
        },
        '70' : {
            code: '70',
            description: 'UPS Access Point Economy'
        },
        '01' : {
            code: '01',
            description: 'UPS Express'
        },
        '14' : {
            code: '14',
            description: 'UPS Express Early'
        },
        '65' : {
            code: '65',
            description: 'UPS Express Saver'
        },
        '11' : {
            code: '11',
            description: 'UPS Standard'
        },
        '08' : {
            code: '08',
            description: 'UPS Worldwide Expedited'
        },
        '07' : {
            code: '07',
            description: 'UPS Worldwide Express'
        },
        '54' : {
            code: '54',
            description: 'UPS Worldwide Express Plus'
        },
        'UPS Express Early' : {
            code: '54',
            description: 'UPS Express Early'
        }
    };

    getCode(name: string) {
        let service: any;
        Object.keys(this.serviceCode).forEach((code) => {
            if (name == this.serviceCode[code].description || name == this.serviceCode[code].code) {
                service = this.serviceCode[code];
            }
        });

        return service;
    }

}
