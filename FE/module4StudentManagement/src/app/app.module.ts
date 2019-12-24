import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListsyllabusComponent } from './component/student/syllabus/listsyllabus/listsyllabus.component';
import { EditsyllabusComponent } from './component/student/syllabus/editsyllabus/editsyllabus.component';
import { CreateComponent } from './component/student/syllabus/create/create.component';
import { CreateobjectComponent } from './component/student/objective/createobject/createobject.component';
import { CreatesyllabusComponent } from './component/student/syllabus/createsyllabus/createsyllabus.component';
import { EditobjectComponent } from './component/student/objective/editobject/editobject.component';
import { ListobjectComponent } from './component/student/objective/listobject/listobject.component';

@NgModule({
  declarations: [
    AppComponent,
    ListsyllabusComponent,
    EditsyllabusComponent,
    CreateComponent,
    CreateobjectComponent,
    CreatesyllabusComponent,
    EditobjectComponent,
    ListobjectComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
