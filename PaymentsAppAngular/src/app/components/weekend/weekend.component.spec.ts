import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WeekendComponent } from './weekend.component';

describe('WeekendComponent', () => {
  let component: WeekendComponent;
  let fixture: ComponentFixture<WeekendComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WeekendComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(WeekendComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
