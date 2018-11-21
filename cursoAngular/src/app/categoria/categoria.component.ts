import { Component, OnInit } from '@angular/core';
import { RemoteDataService } from '../services/remote-data.service';
import { Categoria } from '../models/categoria';
import { Observable } from 'rxjs';
import { interval } from 'rxjs';


@Component({
  selector: 'app-categoria',
  templateUrl: './categoria.component.html',
  styles: []
})

export class CategoriaComponent implements OnInit {

  public data: Observable<Array<Categoria>>;
  public cat: Observable<Categoria>;
  public response;

  public contador = interval(1000);

  constructor(public remote: RemoteDataService) { }

  ngOnInit() {

    this.data = this.remote.retornarData();

    this.data.subscribe(arrayData => {

      this.response = arrayData;
      //console.log(arrayData);
    });


    //Contador de segundos.
    /*this.contador.subscribe(segundo =>{
      console.log(`Estamos en el segundo ${segundo} del interval.`);
    });*/


  }

  retornarUnaCategoria(id:number){

    this.cat = this.remote.devolverCategoria(id);

    /*
    * En console.log se puede pasar tambien arrayData
    * y de ese modo imprime el objeto entero
    * Con err se manejan errores.
    */
    this.cat.subscribe(arrayData =>{
      console.log(arrayData.id);
      console.log(arrayData.nombre);
    },
    err => {
      console.log("Ha ocurrido un error."+ err)
    });
  }



}
