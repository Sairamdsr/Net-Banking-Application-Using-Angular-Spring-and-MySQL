import { TestBed } from '@angular/core/testing';

import { TransferServiceService } from './transfer-service.service';

describe('TransferServiceService', () => {
  let service: TransferServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TransferServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
