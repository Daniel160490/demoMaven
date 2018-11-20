import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MultiplicadorPipe } from './multiplicador.pipe';
import { LoggerComponentComponent } from './logger-component/logger-component.component';
import { TracerComponent } from './tracer/tracer.component';

@NgModule({
  declarations: [
    AppComponent,
    MultiplicadorPipe,
    LoggerComponentComponent,
    TracerComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
