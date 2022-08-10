import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  private _object: any = null;
  private _receiverObject: any = null;


  constructor(private httpClient:HttpClient) { }

  createUserSession(object:any){
    this._object = object;
    localStorage.setItem("account",JSON.stringify(object))
    // this.userSubject.next(this._user);
  }

  createReceiverSession(receiverObject:any){
    this._receiverObject = receiverObject;
    localStorage.setItem("bic",JSON.stringify(receiverObject))
  }
  checkBicService(bicNumber:String){
    const url =
    'http://localhost:8080/getBankDetails/' + bicNumber ;
  const data = {
    accNumber: bicNumber ,
  };
  return this.httpClient.get<any>(url);
  }

  transferService(transferType:String,transferAmount:String,msgCode:String){
    const url =
    'https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=';
  const data = {
    transferType: transferType,
    transferAmount: transferAmount,
    msgCode: msgCode,
  };
  return this.httpClient.post(url, data);
}


  activate(accountNo:Number){
    const url =
      'http://localhost:8080/getSenderData/' + accountNo ;
    const data = {
      accNumber: accountNo ,
    };
    return this.httpClient.get<any>(url);
  }

  sanctionService(accHolderName:String){
    const url =
    'http://localhost:8080/checkName/' + accHolderName ;
  const data = {
    accNumber: accHolderName ,
  };
  return this.httpClient.get<any>(url);
  }

}
