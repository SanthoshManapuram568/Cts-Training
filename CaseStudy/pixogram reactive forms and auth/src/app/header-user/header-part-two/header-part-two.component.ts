import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-header-part-two',
  templateUrl: './header-part-two.component.html',
  styleUrls: ['./header-part-two.component.css']
})
export class HeaderPartTwoComponent implements OnInit {

  constructor(public auth : AuthenticationService) { }

  ngOnInit() {
  }

}
