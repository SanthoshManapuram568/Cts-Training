import { Component, OnInit, Input } from '@angular/core';
import { Media } from '../model/media.model';

@Component({
  selector: 'app-medialist',
  templateUrl: './medialist.component.html',
  styleUrls: ['./medialist.component.css']
})
export class MedialistComponent implements OnInit {
  @Input()
  multimediaList : Media[]; 
  constructor() { }

  ngOnInit() {
  }

}
