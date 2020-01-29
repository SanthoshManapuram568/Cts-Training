import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UploadMediaComponent } from './media/upload-media/upload-media.component';
import { MyMediaComponent } from './media/my-media/my-media.component';
import { FollowersFollowingComponent } from './media/followers-following/followers-following.component';
import { AccountButtonComponent } from './account/account-button/account-button.component';
import { AccountProfileComponent } from './account/account-profile/account-profile.component';


const routes: Routes = [
  {path:"upload",component:UploadMediaComponent},
  {path:"mymedia",component:MyMediaComponent},
  {path:"follow",component:FollowersFollowingComponent},
  {path:"account",component:AccountButtonComponent},
  {path:"profile",component:AccountProfileComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
