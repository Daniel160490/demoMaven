import { Pipe } from '@angular/core';
@Pipe({ name: 'multiplicador' })
export class MultiplicadorPipe implements PipeTransform {
  transform(valorRecibido: number, factor: number): number {
  let fac = factor;
  let mult = (valorRecibido * fac);
  return mult;
  }
  }
