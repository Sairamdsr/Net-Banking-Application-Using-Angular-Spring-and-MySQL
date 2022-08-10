import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ErrorComponent } from './components/error/error.component';
import { ReceiverDetailsComponent } from './components/receiver-details/receiver-details.component';
import { SenderDetailsComponent } from './components/sender-details/sender-details.component';
import { TransactionComponent } from './components/transaction/transaction.component';
import { AuthGuard } from './services/auth.guard';
import { BicGuard } from './services/bic.guard';

const routes: Routes = [
  
  {path:'',component:SenderDetailsComponent},

  {path:'receiver',component:ReceiverDetailsComponent,canActivate: [AuthGuard],},

  {path:'transaction',component:TransactionComponent,canActivate: [BicGuard],},
  {path:'**',component:ErrorComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
