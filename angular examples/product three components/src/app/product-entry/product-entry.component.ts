import { Component, OnInit ,EventEmitter, Output} from '@angular/core';
import { Product } from '../models/product.model';

@Component({
  selector: 'app-product-entry',
  templateUrl: './product-entry.component.html',
  styleUrls: ['./product-entry.component.css']
})
export class ProductEntryComponent implements OnInit {
 
 
 
  @Output()
    submit_info:EventEmitter<Product>
 
 
 
    constructor() { 
      this.submit_info = new EventEmitter();

  }
 
 
  saveItem(txtname:HTMLInputElement,txtcat:HTMLInputElement,txtcost:HTMLInputElement){
    let product=new Product(txtname.value,txtcat.value,parseInt(txtcost.value));
   
    this.submit_info.emit(product);

    txtname.value="";
    txtcat.value="";
    txtcost.value="";
  }

  ngOnInit() {
  }

}
