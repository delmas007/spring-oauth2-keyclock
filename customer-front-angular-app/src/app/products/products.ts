import { Component } from '@angular/core';
import {NgForOf} from '@angular/common';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-products',
  imports: [
    NgForOf
  ],
  templateUrl: './products.html',
  styleUrl: './products.css'
})
export class Products {

  products : any;
  constructor(private http : HttpClient) {
  }
  ngOnInit() {
    this.http.get("http://localhost:8098/products")
      .subscribe({
        next : data => {
          this.products = data;
        },
        error : err => {
          console.log(err);
        }
      });
  }

}
