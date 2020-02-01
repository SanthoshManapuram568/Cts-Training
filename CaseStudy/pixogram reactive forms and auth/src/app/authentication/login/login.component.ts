import { Component, OnInit } from '@angular/core';

import{FormGroup, FormControl, FormBuilder, Validators} from'@angular/forms';
import { AuthenticationService } from 'src/app/services/authentication.service';
import { Route } from '@angular/compiler/src/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username:string;
  password:string;
  errorMessage : string;
  autherized : boolean;
  myFormGroup : FormGroup;
  constructor(public auth :AuthenticationService,public router : Router, formBuilder: FormBuilder) {
    this.errorMessage = "Invalid Credentials!!!";
    this.autherized = true;
    console.log("in form bilder of login");
    this.myFormGroup=formBuilder.group({
     
    "username":new FormControl(""),
        "password": new FormControl("")
      
   });
  }
  checkLogin(txtLogin : HTMLInputElement, txtPass : HTMLInputElement){
    console.log("in check login");
    if(this.auth.authenticate(txtLogin.value, txtPass.value)){
        this.autherized = true;
        this.router.navigate(['/media']);
    }else{
        this.autherized = false;
    }
  }
  login(){
    console.log("login method");
    this.username= this.myFormGroup.controls['username'].value;
    this.password=this.myFormGroup.controls['password'].value;
   console.log("Username : "+this.username+"\n"+"Password : "+this.password);
   }

  ngOnInit() {
  }

}
