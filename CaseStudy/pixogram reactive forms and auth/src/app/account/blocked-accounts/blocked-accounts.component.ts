import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-blocked-accounts',
  templateUrl: './blocked-accounts.component.html',
  styleUrls: ['./blocked-accounts.component.css']
})
export class BlockedAccountsComponent implements OnInit {

  constructor(public auth:AuthenticationService) { }
  message():void{
    
    alert("Logged out!!!");
    this.auth.logout();
  }
  
  ngOnInit() {
  }

}
