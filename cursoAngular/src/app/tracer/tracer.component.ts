import { Component, OnInit } from '@angular/core';
import { LogService } from '../services/log.service';

@Component({
  selector: 'app-tracer',
  templateUrl: './tracer.component.html',
  styles: []
})
export class TracerComponent implements OnInit {

  constructor(public servicio: LogService) {

    servicio.escribirTraza("Estoy en el constructor");
  }

  ngOnInit() {
    this.servicio.escribirTraza("En el onInit");
  }

}
