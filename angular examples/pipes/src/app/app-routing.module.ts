import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ContactComponent } from './contact/contact.component';
import { AboutComponent } from './about/about.component';
import { SearchResultComponent } from './search-result/search-result.component';

import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGuardService } from './services/auth-guard.service';
import { ErrorComponent } from './error/error.component';
import { ProductListComponent } from './product/product-list/product-list.component';
import { ProductAddComponent } from './product/product-add/product-add.component';
import { ProductUpdateComponent } from './product/product-update/product-update.component';
import { PipeCheckPipe } from './pipes/pipe-check.pipe';

const routes: Routes = [
    { path:"", redirectTo : "home", pathMatch: "full"},
    { path:"home", component: HomeComponent},
    { path:"contactus", component: ContactComponent},
    { path:"aboutus", component: AboutComponent},
    { path:"login", component: LoginComponent},
    { path:"product", component: ProductListComponent, canActivate : [AuthGuardService]},
    { path:"product-list", component: ProductAddComponent, canActivate : [AuthGuardService]},
    { path:"logout", component: LogoutComponent, canActivate : [AuthGuardService]},
    {path:"pipe",component:PipeCheckPipe},
    { path:"search/:searchText", component: SearchResultComponent},
    {path:"product-update/:productId",component:ProductUpdateComponent,canActivate : [AuthGuardService]},
    { path:"**", component: ErrorComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)], // registering routes
  exports: [RouterModule]
})
export class AppRoutingModule { }
