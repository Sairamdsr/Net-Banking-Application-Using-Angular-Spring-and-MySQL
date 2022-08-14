import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AccountService } from 'src/app/services/account.service';

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent implements OnInit {

  transferAmount:any="";
  transferType="";
  msgCode="";

  transactionData:any={
    "customerId":"",
    "currencyCode":"INR",
    "receiverBIC":"",
    "receiverAccountHolderNumber":"",
    "receiverAccountHolderName":"",
    "messageCode":"",
    "transferAmount":"",
    "transferType":"",
    "totalDebit":"",
    "transferDate":""
  }
  constructor(private router:Router,private accountService:AccountService) { }

  accObj={}
  bicObj={}
  accHolderName=""
  accNumber=""

  today = new Date();
  ngOnInit(): void {
  let accObj=(JSON.parse(localStorage.getItem('account') || '{}'))
  let bicObj=(JSON.parse(localStorage.getItem('bic') || '{}'))

  let accHolderName=(JSON.parse(localStorage.getItem('accHolderName') || '{}'))
  let accNumber=(JSON.parse(localStorage.getItem('accHolderNumber') || '{}'))

  this.transactionData.customerId=accObj.customerId;
  this.transactionData.receiverBIC=bicObj.bic;
  this.transactionData.receiverAccountHolderNumber=accNumber;
  this.transactionData.receiverAccountHolderName=accHolderName;
  this.transactionData.transferDate=this.today.getDate();
  console.log(this.transactionData)
  
  }

  transferBalance(){
    console.log(this.transferType);
    console.log(this.transferAmount);
    console.log(this.msgCode);

    this.transactionData.transferType=this.transferType;
    this.transactionData.messageCode=this.msgCode;
    this.transactionData.transferAmount=this.transferAmount;
    this.transactionData.totalDebit=(this.transferAmount*(0.0025))+this.transferAmount;
    console.log(this.transactionData);
    this.accountService.transferService(this.transferType,this.transferAmount,this.msgCode).subscribe(
      (data) => {

        console.log('LOGIN SUCCESS', data);
        this.accountService.createUserSession(data);
        this.router.navigate(['/'])
      },
      (error) => {
        console.log('LOGIN FAILURE', error);
      }
    );
    localStorage.clear();
  }

}
