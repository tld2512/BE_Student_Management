import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditobjectComponent } from './editobject.component';

describe('EditobjectComponent', () => {
  let component: EditobjectComponent;
  let fixture: ComponentFixture<EditobjectComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditobjectComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditobjectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
