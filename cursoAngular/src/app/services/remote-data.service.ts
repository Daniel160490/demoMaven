import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RemoteDataService {

  constructor(public httpClient: HttpClient) { }

  retornarData(){
    console.log(this.httpClient.get('http://localhost:8081/categoria'));
  }


}
