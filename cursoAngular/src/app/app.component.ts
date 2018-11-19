import { Component } from "@angular/core";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styles: []
})
export class AppComponent {
  title = "MisCursos";
  cursos = [
    {
      id: 1,
      nombre: "Angular 2",
      descripcion: "Introducción al desarrollo avanzado en Js",
      duracion: 8
    },
    {
      id: 2,
      nombre: "NodeJS",
      descripcion: "Introducción al server en Js",
      duracion: 4
    },
    {
      id: 3,
      nombre: "Angular 6",
      descripcion: "Introducción a Angular",
      duracion: 120
    }
  ];

  seleccionar(curso) {
    console.log(curso);
  }
}
