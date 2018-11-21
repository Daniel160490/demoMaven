import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
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

  addProducto(categoria: Categoria): Observable<any>{
    let json = JSON.stringify(categoria);

    //El backend recogerá un parametro json
    let params = "json="+json;

    //Establecemos cabeceras
    let headers = new HttpHeaders().set('Content-Type','application/x-www-form-urlencoded');

    return this.httpClient.post(' http://localhost:8081/categoria/ '+'categoria', params, {headers: headers});
  }

}
