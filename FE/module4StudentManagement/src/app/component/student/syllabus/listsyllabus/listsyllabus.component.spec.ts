import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListsyllabusComponent } from './listsyllabus.component';

describe('ListsyllabusComponent', () => {
  let component: ListsyllabusComponent;
  let fixture: ComponentFixture<ListsyllabusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListsyllabusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListsyllabusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
