import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Categoria } from '../models/categoria';

@Injectable({
  providedIn: 'root'
})
export class RemoteDataService {

  constructor(public httpClient: HttpClient) { }

  /*
  * Retorna un Observable con un array de Categoria.
  */
  retornarData(){
    return this.httpClient.get<Array<Categoria>>('http://localhost:8081/categoria');
  }

  devolverCategoria(id: number){
    return this.httpClient.get<Categoria>('http://localhost:8081/categoria/'+ id);
  }


}
