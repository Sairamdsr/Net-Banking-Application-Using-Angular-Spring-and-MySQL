import { TestBed } from '@angular/core/testing';

import { WeekdayGuard } from './weekday.guard';

describe('WeekdayGuard', () => {
  let guard: WeekdayGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(WeekdayGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
