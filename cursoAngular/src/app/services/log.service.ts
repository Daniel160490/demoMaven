import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root' // Este servicio esta disponible a nivel raiz
})
export class LogService {

  constructor() { }

  // Metodo que solo va a imprimir por consola
  // Con los tres puntos decimos que acepte mas parametros
  escribirTraza(...mensaje: string[]){

    console.log(mensaje[0], mensaje[1]);
  }
}
