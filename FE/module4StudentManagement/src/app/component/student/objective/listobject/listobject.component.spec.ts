import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListobjectComponent } from './listobject.component';

describe('ListobjectComponent', () => {
  let component: ListobjectComponent;
  let fixture: ComponentFixture<ListobjectComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListobjectComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListobjectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
