import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { MultiplicadorPipe } from './multiplicador.pipe';
import { LoggerComponentComponent } from './logger-component/logger-component.component';
import { TracerComponent } from './tracer/tracer.component';
import { CategoriaComponent } from './categoria/categoria.component';

@NgModule({
  declarations: [
    AppComponent,
    MultiplicadorPipe,
    LoggerComponentComponent,
    TracerComponent,
    CategoriaComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
