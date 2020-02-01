import { Component, OnInit } from '@angular/core';
import{FormGroup, FormControl, FormBuilder, Validators} from'@angular/forms';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  userSearch:string;
  myFormGroup:FormGroup;
  constructor(public auth : AuthenticationService, formBuilder: FormBuilder) {
    console.log("in form bilder of search");
    this.myFormGroup=formBuilder.group({
      "search":new FormControl("")
    });

  }
  search(){
    console.log("Search method");
    this.userSearch= this.myFormGroup.controls['search'].value;
    console.log("you have searched for : "+this.userSearch);
  }
  message():void{
    
    alert("Logged out!!!");
    this.auth.logout();
  }
  
  ngOnInit() {
  }

}
