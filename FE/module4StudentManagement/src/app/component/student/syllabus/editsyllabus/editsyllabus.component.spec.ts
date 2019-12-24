import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditsyllabusComponent } from './editsyllabus.component';

describe('EditsyllabusComponent', () => {
  let component: EditsyllabusComponent;
  let fixture: ComponentFixture<EditsyllabusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditsyllabusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditsyllabusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
