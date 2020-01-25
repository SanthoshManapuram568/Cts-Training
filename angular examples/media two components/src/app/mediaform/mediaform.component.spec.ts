import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MediaformComponent } from './mediaform.component';

describe('MediaformComponent', () => {
  let component: MediaformComponent;
  let fixture: ComponentFixture<MediaformComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MediaformComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MediaformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
