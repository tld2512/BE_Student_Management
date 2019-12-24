import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatesyllabusComponent } from './createsyllabus.component';

describe('CreatesyllabusComponent', () => {
  let component: CreatesyllabusComponent;
  let fixture: ComponentFixture<CreatesyllabusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreatesyllabusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreatesyllabusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
