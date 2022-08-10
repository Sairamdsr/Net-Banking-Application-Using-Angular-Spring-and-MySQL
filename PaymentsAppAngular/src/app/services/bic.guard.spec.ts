import { TestBed } from '@angular/core/testing';

import { BicGuard } from './bic.guard';

describe('BicGuard', () => {
  let guard: BicGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(BicGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
