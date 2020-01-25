import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FormModelTwoComponent } from './form-model-two.component';

describe('FormModelTwoComponent', () => {
  let component: FormModelTwoComponent;
  let fixture: ComponentFixture<FormModelTwoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormModelTwoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FormModelTwoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
