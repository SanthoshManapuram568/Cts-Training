import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UploadMediaComponent } from './media/upload-media/upload-media.component';
import { MyMediaComponent } from './media/my-media/my-media.component';
import { FollowersFollowingComponent } from './media/followers-following/followers-following.component';
import { HeaderPartoneComponent } from './header-partone/header-partone.component';
import { HeaderParttwoComponent } from './header-parttwo/header-parttwo.component';
import { AccountButtonComponent } from './account/account-button/account-button.component';
import { AccountProfileComponent } from './account/account-profile/account-profile.component';


@NgModule({
  declarations: [
    AppComponent,
    UploadMediaComponent,
    MyMediaComponent,
    FollowersFollowingComponent,
    HeaderPartoneComponent,
    HeaderParttwoComponent,
    AccountButtonComponent,
    AccountProfileComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
