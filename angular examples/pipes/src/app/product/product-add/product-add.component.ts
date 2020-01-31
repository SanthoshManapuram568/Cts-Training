import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/models/product.model';
import { ProductDataService } from 'src/app/services/data/product-data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-add',
  templateUrl: './product-add.component.html',
  styleUrls: ['./product-add.component.css']
})
export class ProductAddComponent implements OnInit {

  constructor(public product : ProductDataService,public router:Router) { }

  ngOnInit() {
  
  }
  saveProduct(txtName:HTMLInputElement, txtCategory:HTMLInputElement, txtCost:HTMLInputElement):void{
    let product = new Product(txtName.value,txtCategory.value,parseInt(txtCost.value))
    this.product.addNewProducts(product).subscribe((response) => console.log(response));
   // alert(txtName.value+" product added");
    txtName.value = "";
    txtCategory.value = "";
    txtCost.value = "";
    this.router.navigate(['/product']);
}
 
}
