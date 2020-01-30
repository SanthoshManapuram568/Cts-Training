import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './authentication/login/login.component';
import { SingleMediaComponent } from './media-actions/upload-media/single-media/single-media.component';
import { GalleryComponent } from './media-actions/view/gallery/gallery.component';
import { RegisterComponent } from './authentication/register/register.component';
import { MultipleMediaComponent } from './media-actions/upload-media/multiple-media/multiple-media.component';
import { SingleImageComponent } from './media-actions/view/single-image/single-image.component';
import { FollowersComponent } from './profile/followers/followers.component';


const routes: Routes = [
  {path:"upload",component:SingleMediaComponent},
  {path:"mymedia",component:GalleryComponent},
  {path:"follow",component:FollowersComponent},
  {path:"register",component:RegisterComponent},
  {path:"media",component:GalleryComponent},
  {path:"login",component:LoginComponent},
  {path:"loginpage",component:LoginComponent},
  {path:"singlemedia",component:SingleMediaComponent},
  {path:"multiplemedia",component:MultipleMediaComponent},
  {path:"singleimage",component:SingleImageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
