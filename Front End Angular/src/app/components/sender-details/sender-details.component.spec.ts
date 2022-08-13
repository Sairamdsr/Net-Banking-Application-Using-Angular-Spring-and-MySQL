import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SenderDetailsComponent } from './sender-details.component';

describe('SenderDetailsComponent', () => {
  let component: SenderDetailsComponent;
  let fixture: ComponentFixture<SenderDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SenderDetailsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SenderDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
