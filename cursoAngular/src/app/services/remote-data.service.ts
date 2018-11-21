import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Categoria } from '../models/categoria';
import { Observable } from 'rxjs/Observable';



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

  addCategoria(categoria: Categoria): Observable<any>{

    //Establecemos cabeceras
    let headers = new HttpHeaders().set('Content-Type','application/json');

    return this.httpClient.post(' http://localhost:8081/categoria/ ', categoria, {headers: headers});
  }

}
