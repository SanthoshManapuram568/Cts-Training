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
  
    ];

  }
//using $event parameter
  addNewProduct(product : Product):void{
    //new product from another component
    this.products.push(product);
  }
 

  ngOnInit() {
  }

}
