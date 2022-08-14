import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})

export class TransferServiceService {

  constructor(private httpClient:HttpClient) { }

  getProducts(){
    const url="https://raw.githubusercontent.com/mdmoin7/Random-Products-Json-Generator/master/products.json"
  
    return this.httpClient.get<any>(url)
  }

  doCheckout(data: any) {
    const url = 'https://my-app-2675f-default-rtdb.firebaseio.com/b6-data.json';
    return this.httpClient.post(url, data);
  }
}
