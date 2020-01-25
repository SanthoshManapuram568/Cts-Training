import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form-model-one',
  templateUrl: './form-model-one.component.html',
  styleUrls: ['./form-model-one.component.css']
})
export class FormModelOneComponent implements OnInit {
name:string;
catageory:string;
cost:number;
  constructor() { 

  }

  ngOnInit() {
  }
saveProduct(frm:any){
  this.name=frm.pname;
  this.catageory=frm.pcat;
  this.cost=parseInt(frm.pcost);
}
}
