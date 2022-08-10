import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AccountService } from 'src/app/services/account.service';

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent implements OnInit {

  transferAmount="";
  transferType="";
  msgCode="";

  constructor(private router:Router,private accountService:AccountService) { }

  ngOnInit(): void {
  }

  transferBalance(){
    console.log(this.transferType);
    console.log(this.transferAmount);
    console.log(this.msgCode);

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
