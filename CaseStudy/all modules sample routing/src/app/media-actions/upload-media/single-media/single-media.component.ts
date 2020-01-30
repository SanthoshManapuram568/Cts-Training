import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-single-media',
  templateUrl: './single-media.component.html',
  styleUrls: ['./single-media.component.css']
})
export class SingleMediaComponent implements OnInit {

  constructor() { }
message(){
  alert("you have uploaded the media & redirecting you to gallery")
}
  ngOnInit() {
  }

}
