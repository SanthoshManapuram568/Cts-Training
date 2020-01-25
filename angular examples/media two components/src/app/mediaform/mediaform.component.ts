import { Component, OnInit } from '@angular/core';
import { Media } from '../model/media.model';

@Component({
  selector: 'app-mediaform',
  templateUrl: './mediaform.component.html',
  styleUrls: ['./mediaform.component.css']
})
export class MediaformComponent implements OnInit {
  multimedia: Media[]; 

  constructor() { 
    
    this.multimedia=[];
    
    

  }
  saveItem(txtfile:HTMLInputElement,txttitle:HTMLInputElement,txtmedia:HTMLInputElement,txtdes:HTMLInputElement,txttag:HTMLInputElement){
   
    let media=new Media(txtfile.value,txttitle.value,txtmedia.value,txtdes.value,txttag.value);
    this.multimedia.push(media);
    txtfile.value="";
    txttitle.value="";
    txtmedia.value="";
    txtdes.value="";
    txttag.value="";
  }
  ngOnInit() {
  }

}
