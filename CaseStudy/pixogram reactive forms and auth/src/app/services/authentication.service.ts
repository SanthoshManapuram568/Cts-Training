import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor() { }

  authenticate(userid : string, password : string): boolean{
    if(userid === "first" && password === "abc"){
      sessionStorage.setItem("user", userid);
      return true;
    }else{
      return false;
    }
  }

  isUserLoggedIn(): boolean{
    let user = sessionStorage.getItem('user');
    if(user == null)
      return false;
    return true;  
  }

  
  logout(){
    sessionStorage.removeItem('user');
  }

  getUserDetails():string{
    let user = sessionStorage.getItem('user');
    return user;
  }
}
