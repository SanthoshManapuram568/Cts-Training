import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderPartoneComponent } from './header-partone.component';

describe('HeaderPartoneComponent', () => {
  let component: HeaderPartoneComponent;
  let fixture: ComponentFixture<HeaderPartoneComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HeaderPartoneComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HeaderPartoneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
