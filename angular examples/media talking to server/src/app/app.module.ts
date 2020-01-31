import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MediaUploadComponent } from './mediabase/media-upload/media-upload.component';
import { MediaDisplayComponent } from './mediabase/media-display/media-display.component';
import { MediaUpdateComponent } from './mediabase/media-update/media-update.component';
import { MenuComponent } from './menu/menu.component';
import {HttpClientModule}from'@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    MediaUploadComponent,
    MediaDisplayComponent,
    MediaUpdateComponent,
    MenuComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
