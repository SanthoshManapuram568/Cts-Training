import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  result: number;
  errorMessage: string;
  isValid : boolean;

  constructor() { 
    this.errorMessage = "Invalid data!!!";
    this.isValid = true;
  }

  ngOnInit() {
  }

  // calculate(val1 : HTMLInputElement, val2 : HTMLInputElement, resultTxt : HTMLInputElement){
    calculate(val1 : HTMLInputElement, 
              val2 : HTMLInputElement,
              optr : String){

    if(val1.value == "" || val2.value == ""){
      this.isValid = false;
      return;
    }            

    // HTML input values are in form of string
    let a = parseInt(val1.value); // converting to int
    let b = parseInt(val2.value);
    switch(optr){
      case '+' : this.result = a + b; break;
      case '-' : this.result = a - b; break;
      case '*' : this.result = a * b; break;
      case '/' : this.result = a / b; break;
    }
    this.isValid = true;
    
    // let result = a + b;
    // resultTxt.value = result + ""; // converting int to string
  }

}