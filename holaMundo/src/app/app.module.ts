import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AppComponent1 } from './app.component1'; // nuevo componente

@NgModule({
  declarations: [
    AppComponent,
    AppComponent1
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent, AppComponent1]
})
export class AppModule { }
