import { Component, OnInit } from '@angular/core';
import{FormGroup, FormControl, FormBuilder, Validators} from'@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  user:string;
  pass:string;
  repass:string;
  mail:string;
  myFormGroup : FormGroup;
  constructor(public route : Router, formBuilder: FormBuilder) {
    console.log("in form bilder of reg");
    this.myFormGroup=formBuilder.group({
      "username":new FormControl(""),
      "password": new FormControl(""),
      "repassword":new FormControl(""),
      "email":new FormControl("")

    });

  }
  reg(){
    console.log("Registration method");
    this.user= this.myFormGroup.controls['username'].value;
    this.pass=this.myFormGroup.controls['password'].value;
    this.repass=this.myFormGroup.controls['repassword'].value;
    this.mail=this.myFormGroup.controls['email'].value;
   console.log("Username : "+this.user+"\n"+"Password : "+this.pass+"\n"+"Re-password : "+this.repass+"\n"+"Email : "+this.mail);
  }
  message(){
    if(this.user.length==0){
      alert("fill");
        }
    else{
    alert("user registered\nRedireacting to login page")
    this.route.navigate(['/login']);
    }
}
  ngOnInit() {
  }

}
