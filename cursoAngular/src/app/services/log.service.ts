import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root' // Este servicio esta disponible a nivel raiz
})
export class LogService {

  constructor() { }

  // Metodo que solo va a imprimir por consola
  // Con los tres puntos decimos que acepte mas parametros
  // Con el forEach va guardando el contenido de la variable mensaje en msg y lo imprime
  escribirTraza(...mensaje: string[]){

    mensaje.forEach(msg => {
      console.log(msg);
    });

  }

}
