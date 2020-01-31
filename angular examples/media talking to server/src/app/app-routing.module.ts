import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MediaDisplayComponent } from './mediabase/media-display/media-display.component';
import { MediaUploadComponent } from './mediabase/media-upload/media-upload.component';
import { MediaUpdateComponent } from './mediabase/media-update/media-update.component';


const routes: Routes = [
  {path:"details",component:MediaDisplayComponent},
  {path:"details1",component:MediaUploadComponent},
  {path:"media",component:MediaDisplayComponent},
  {path:"details-update/:detailId",component:MediaUpdateComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
