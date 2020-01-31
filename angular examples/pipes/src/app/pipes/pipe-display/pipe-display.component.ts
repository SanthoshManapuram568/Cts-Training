import { Component, OnInit } from '@angular/core';
import { tick } from '@angular/core/testing';
import { timer } from 'rxjs';

@Component({
  selector: 'app-pipe-display',
  templateUrl: './pipe-display.component.html',
  styleUrls: ['./pipe-display.component.css']
})
export class PipeDisplayComponent implements OnInit {
size:string;

  constructor() {

   }
   msg():void{
    setTimeout( function ( ) { alert( "moo" ); }, 0 );
   
   }
change(ip:HTMLInputElement){
this.size=ip.value;
ip.value="";
}

  ngOnInit() {
  }

}
