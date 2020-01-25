import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormsModule,ReactiveFormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { FormModelOneComponent } from './form-model-one/form-model-one.component';

@NgModule({
  declarations: [
    AppComponent,
    FormModelOneComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
