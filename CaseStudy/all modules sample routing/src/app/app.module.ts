import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderPartOneComponent } from './header-user/header-part-one/header-part-one.component';
import { HeaderPartTwoComponent } from './header-user/header-part-two/header-part-two.component';
import { LoginComponent } from './authentication/login/login.component';
import { RegisterComponent } from './authentication/register/register.component';
import { SingleMediaComponent } from './media-actions/upload-media/single-media/single-media.component';
import { MultipleMediaComponent } from './media-actions/upload-media/multiple-media/multiple-media.component';
import { GalleryComponent } from './media-actions/view/gallery/gallery.component';
import { SingleImageComponent } from './media-actions/view/single-image/single-image.component';
import { FollowersComponent } from './profile/followers/followers.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderPartOneComponent,
    HeaderPartTwoComponent,
    LoginComponent,
    RegisterComponent,
    SingleMediaComponent,
    MultipleMediaComponent,
    GalleryComponent,
    SingleImageComponent,
    FollowersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
