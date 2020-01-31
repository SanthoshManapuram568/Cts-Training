import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductDataService } from 'src/app/services/data/product-data.service';
import { Product } from 'src/app/models/product.model';

@Component({
  selector: 'app-product-update',
  templateUrl: './product-update.component.html',
  styleUrls: ['./product-update.component.css']
})
export class ProductUpdateComponent implements OnInit {
  
  productId:number;
  product : Product;

  constructor(public activatedRoute : ActivatedRoute,public router :Router,public productService : ProductDataService) {
    this.activatedRoute.params.subscribe((parameter) => this.productId = parameter["productId"]);
   }

  ngOnInit() {
    this.productService.getOneProduct(this.productId).subscribe((response:any)=>this.product=response);
  }

  updateProduct(txtName:HTMLInputElement, txtCategory:HTMLInputElement, txtCost:HTMLInputElement):void{
    
    
    let product = new Product(txtName.value, txtCategory.value, parseInt(txtCost.value));

    
    this.productService.updateProduct(this.productId, product).subscribe((response) => {
        console.log(response);
        
        this.router.navigate(['/product']);
      });


    // reset the form
    txtName.value = "";
    txtCategory.value = "";
    txtCost.value = "";

    
}
 
}
