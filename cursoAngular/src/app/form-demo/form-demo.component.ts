import { Component, OnInit } from '@angular/core';
import { Categoria } from '../models/categoria';
import { NgForm } from '@angular/forms';
import { RemoteDataService } from '../services/remote-data.service';

@Component({
  selector: 'app-form-demo',
  templateUrl: './form-demo.component.html',
  styles: []
})
export class FormDemoComponent implements OnInit {

  //Variable disponible para el HTML
  public cat: Categoria;
  public enviado = false;

  constructor(public remote:  RemoteDataService) {
    this.cat = new Categoria();

  }

  ngOnInit() {
  }

  /*
  * Función que recibe la informacion del formulario
  */
  onSubmit(f: NgForm) {
    this.enviado = true;
    this.remote.addCategoria(this.cat).subscribe(
      result => {
        console.log('Respuesta: ' + result);
      },
      error => {
          console.log(<any>error);
      }
  );
    //console.log(this.cat);
  }

  /*
  * Funcion para limpiar el formulario
  */
  limpiar(f: NgForm) {
    console.log("Limpiando....");
    f.resetForm();
    this.enviado = false;
  }

}
