import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { MultiplicadorPipe } from './multiplicador.pipe';
import { LoggerComponentComponent } from './logger-component/logger-component.component';
import { TracerComponent } from './tracer/tracer.component';
import { CategoriaComponent } from './categoria/categoria.component';
import { FormDemoComponent } from './form-demo/form-demo.component';

@NgModule({
  declarations: [
    AppComponent,
    MultiplicadorPipe,
    LoggerComponentComponent,
    TracerComponent,
    CategoriaComponent,
    FormDemoComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
