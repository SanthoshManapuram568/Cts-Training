import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MediaformComponent } from './mediaform/mediaform.component';
import { MedialistComponent } from './medialist/medialist.component';

@NgModule({
  declarations: [
    AppComponent,
    MediaformComponent,
    MedialistComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
