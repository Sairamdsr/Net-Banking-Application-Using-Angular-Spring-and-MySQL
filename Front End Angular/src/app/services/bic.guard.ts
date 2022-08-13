import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BicGuard implements CanActivate {
  
  constructor(private router:Router) { 
  }
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
      const isReceiverAuthenticated=!!localStorage.getItem('bic');
      if(!isReceiverAuthenticated){
        this.router.navigate(['/receiver']);
      }
      return isReceiverAuthenticated;
  }
  
}
