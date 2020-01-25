import { Component, OnInit } from '@angular/core';
import{FormGroup, FormControl, FormBuilder, Validators} from'@angular/forms';
@Component({
  selector: 'app-form-model-two',
  templateUrl: './form-model-two.component.html',
  styleUrls: ['./form-model-two.component.css']
})
export class FormModelTwoComponent implements OnInit {
  name:string;
  catageory:string;
  cost:number;
  myFormGroup: FormGroup;
 
  constructor(formBuilder: FormBuilder) {
      this.myFormGroup=formBuilder.group({

        "product_name":new FormControl("",Validators.compose( [Validators.required , this.nameCheck ])),
        "product_catageory": new FormControl("",Validators.compose( [Validators.required , Validators.maxLength(10)])),
        "product_cost": new FormControl("",Validators.compose([Validators.required ,this.rangeCheck]))
      });
   }
   saveProduct(){
    this.name= this.myFormGroup.controls['product_name'].value;
    this.catageory=this.myFormGroup.controls['product_catageory'].value;
    this.cost=parseInt(this.myFormGroup.controls['product_cost'].value);
   }
   nameCheck(txtControl: FormControl){
     if((txtControl.value)=="santhosh")
     {
       return{
         "text": true
       }
     }

   }
  rangeCheck(txtControl : FormControl){
    if(parseInt(txtControl.value) < 100 ||parseInt(txtControl.value) > 1000)
        return {
                  
                  "range" : true 
             
    
            }
        }
           
  ngOnInit() {
  }

}
