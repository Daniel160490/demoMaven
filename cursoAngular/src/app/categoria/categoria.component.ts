import { Component, OnInit } from '@angular/core';
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
  public cat: Observable<Categoria>;
  public response;

  constructor(public remote: RemoteDataService) { }

  ngOnInit() {

    this.data = this.remote.retornarData();

    this.data.subscribe(arrayData => {

      this.response = arrayData;
      //console.log(arrayData);
    });
  }

  retornarUnaCategoria(id:number){
    this.cat = this.remote.devolverCategoria(id);
    this.cat.subscribe(arrayData =>{
      console.log(arrayData.id);
      console.log(arrayData.nombre);
    })
  }



}
