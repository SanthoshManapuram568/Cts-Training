import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'route-base-app';
  constructor(private route: Router){

  }
  searchCall(srch:HTMLInputElement){
    if(srch.value!="")
    this.route.navigate(['/search/'+srch.value]);
    else
    this.route.navigate(['/about'])
  }
}
