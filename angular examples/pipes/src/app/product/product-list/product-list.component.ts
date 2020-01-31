import { Component, OnInit } from '@angular/core';
import { ProductDataService } from 'src/app/services/data/product-data.service';
import { Product } from 'src/app/models/product.model';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products : Array<Product>; 
  constructor(private productService : ProductDataService,public router : Router) { 

  }
  add(){
this.router.navigate(['/product-list']);
  }
 update(id:number){
   this.router.navigate(['/product-update/'+id]);
 }
 delete(id:number){ 
  this.productService.deleteProduct(id).subscribe((response) => {
      console.log(response);
      this.productService.getAllProducts().subscribe((response:any) => this.products = response);
  });
}
  ngOnInit() {
   
    this.productService.getAllProducts().subscribe((response:any) => this.products = response);
  }

}