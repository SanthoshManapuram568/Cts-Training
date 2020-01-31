import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from 'src/app/models/product.model';

//url of server
const API_URL="http://localhost:3000/products";

@Injectable({
  providedIn: 'root'
})
//service to interact with rest server for product entity

export class ProductDataService {

  //http service injected
  constructor(public http:HttpClient) {

   }
   getAllProducts(){
    //send req to server : get all products
    //will send a req to url with http verb GET
    //method will wait for data to receive
    //return data back to component
    return this.http.get(API_URL);

   }
   addNewProducts(product:Product){
    return this.http.post(API_URL,product);

   }
   getOneProduct(id:number){
    return this.http.get(API_URL+"/"+id);
   }
   updateProduct(id:number, product : Product){
    // PUT http verb
    return this.http.put(API_URL + "/" + id, product);
  }

  // method to delete single record of given id
  deleteProduct(id:number){
    // DELETE http verb
    return this.http.delete(API_URL + "/" + id);

  }
  
}
