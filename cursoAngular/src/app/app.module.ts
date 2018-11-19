import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { Pipe } from '@angular/core';

import { AppComponent } from './app.component';
import { MultiplicadorPipe } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
