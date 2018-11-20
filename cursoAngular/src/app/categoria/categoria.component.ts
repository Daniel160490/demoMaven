import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { RemoteDataService } from '../services/remote-data.service';
import { Categoria } from '../models/categoria';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-categoria',
  templateUrl: './categoria.component.html',
  styles: []
})
export class CategoriaComponent implements OnInit {

  public data: Observable<Array<Categoria>>;

  constructor(public remote: RemoteDataService) { }

  ngOnInit() {

    this.data = this.remote.retornarData();

    this.data.subscribe(arrayData => {
      console.log(arrayData);
    });
  }

}
