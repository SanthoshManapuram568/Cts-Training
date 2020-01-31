import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Details } from '../model/details';
const API_URL="http://localhost:3000/details";
@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

  constructor(public http:HttpClient) {

   }

   addNewMedia(details : Details){
     return this.http.post(API_URL,details);
   }
   getMedia(){
     return this.http.get(API_URL);
   }
   getOneMedia(id:number){
    return this.http.get(API_URL+"/"+id);
   }
   updateDetails(id:number, detail : Details){
    return this.http.put(API_URL + "/" + id, detail);
  }
  deleteDetails(id:number){ 
    return this.http.delete(API_URL + "/" + id);

  }

}
