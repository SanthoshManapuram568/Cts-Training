import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-newsfeeds',
  templateUrl: './newsfeeds.component.html',
  styleUrls: ['./newsfeeds.component.css']
})
export class NewsfeedsComponent implements OnInit {

  constructor(public auth : AuthenticationService) { }
  message():void{
    
    alert("Logged out!!!");
    this.auth.logout();
  }
  
  ngOnInit() {
   
  }

}
