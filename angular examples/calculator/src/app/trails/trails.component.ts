import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-trails',
  templateUrl: './trails.component.html',
  styleUrls: ['./trails.component.css']
})
export class TrailsComponent implements OnInit {
  value:number =0;
  value1 : number=3;
  value2 : number=3;
  result: number;
  method:string='add';
  games:string[]=['Volleyball', 'Cricket', 'BasketBall', 'Nogames da!'];
  play:string='volleyball';
  constructor() { 
    this.result=0;
  // console.log(this.result)
  }calAdd():void{

  
  this.result=this.value1+this.value2;
  }
  calMul():void{
    this.result=this.value1*this.value2;
 }
 calSub():void{
  this.result=this.value1-this.value2;
}
calDiv():void{
  this.result=this.value1/this.value2;
}
  ngOnInit() {
  }

}
/*changeValue():void{
    this.name="second";
  }

calAdd():number{
    this.result=this.value1+this.value2
return this.result;
  calDiv():number{
    this.result=this.value1/this.value2
return this.result;
  }*/