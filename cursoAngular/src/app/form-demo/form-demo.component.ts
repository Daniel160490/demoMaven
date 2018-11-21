import { Component, OnInit } from '@angular/core';
import { Categoria } from '../models/categoria';
import { NgForm } from '@angular/forms';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-form-demo',
  templateUrl: './form-demo.component.html',
  styles: []
})
export class FormDemoComponent implements OnInit {

  //Variable disponible para el HTML
  public cat: Categoria;
  public enviado = false;

  constructor() {
    this.cat = new Categoria();
  }

  ngOnInit() {
  }

  /*
  * Función que recibe la informacion del formulario
  */
  onSubmit(f: NgForm) {
    this.enviado = true;
    console.log(this.cat);
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
