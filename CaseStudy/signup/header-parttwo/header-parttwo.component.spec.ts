import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderParttwoComponent } from './header-parttwo.component';

describe('HeaderParttwoComponent', () => {
  let component: HeaderParttwoComponent;
  let fixture: ComponentFixture<HeaderParttwoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HeaderParttwoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HeaderParttwoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
