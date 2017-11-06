import { TestBed, inject } from '@angular/core/testing';

import { CpService } from './cp.service';

describe('CpTrackingServiceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CpService]
    });
  });

  it('should be created', inject([CpService], (service: CpService) => {
    expect(service).toBeTruthy();
  }));
});
