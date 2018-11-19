import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-root",
  templateUrl: "./app.component.html",
  styles: ["./style.css"]
})
export class AppComponent {
  title = "Mis Cursos";
  cursos = [
    {
      id: 1,
      nombre: "Angular 2",
      descripcion: "Introducción al desarrollo avanzado en Js",
      duracion: 8,
      precio: 50.5,
      fecha: Date()
    },
    {
      id: 2,
      nombre: "NodeJS",
      descripcion: "Introducción al server en Js",
      duracion: 4,
      precio: 75.2,
      fecha: Date()
    },
    {
      id: 3,
      nombre: "Angular 6",
      descripcion: "Introducción a Angular",
      duracion: 120,
      precio: 1000000.99,
      fecha: new Date()
    }
  ];

  seleccionar(curso) {
    console.log(curso);
  }

  getCSSClasses(modo: string) {
    let cssClasses;
    if (modo === "noche") {
      cssClasses = {
        one: true,
        two: true
      };
    } else {
      cssClasses = {
        two: true,
        four: false
      };
    }
    return cssClasses;
  }
}
