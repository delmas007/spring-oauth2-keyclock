  import { Routes } from '@angular/router';
  import {Customers} from './customers/customers';
  import {Products} from './products/products';
  import {AuthGuard} from './guards/auth-guard';

export const routes: Routes = [
  { path : "customers", component : Customers},
  { path : "products", component : Products, canActivate:[AuthGuard], data : { roles:['USER'] }}
];
