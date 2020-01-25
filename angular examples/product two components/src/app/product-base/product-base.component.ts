import { Component, OnInit } from '@angular/core';
import { Product } from '../models/product.model';

@Component({
  selector: 'app-product-base',
  templateUrl: './product-base.component.html',
  styleUrls: ['./product-base.component.css']
})
export class ProductBaseComponent implements OnInit {

  //collection of produt type ; an array of products

  products: Product[]; 

  constructor() { 
    
    //intialize with dummy data
    
    this.products=[
    new Product("First","Books",100),
    new Product("Second","Electronic",200),
    new Product("Third","Games",300)
    ];

  }
  saveItem(txtname:HTMLInputElement,txtcat:HTMLInputElement,txtcost:HTMLInputElement){
    let product=new Product(txtname.value,txtcat.value,parseInt(txtcost.value));
    this.products.push(product);
    txtname.value="";
    txtcat.value="";
    txtcost.value="";
  }

  ngOnInit() {
  }

}
