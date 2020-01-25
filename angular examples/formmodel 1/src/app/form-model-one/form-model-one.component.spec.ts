import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FormModelOneComponent } from './form-model-one.component';

describe('FormModelOneComponent', () => {
  let component: FormModelOneComponent;
  let fixture: ComponentFixture<FormModelOneComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormModelOneComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FormModelOneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
