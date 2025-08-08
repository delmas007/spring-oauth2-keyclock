  import { Routes } from '@angular/router';
  import {Customers} from './customers/customers';
  import {Products} from './products/products';

export const routes: Routes = [
  { path : "customers", component : Customers},
  { path : "products", component : Products}
];
