import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ContactFormComponent } from './component/contact-form/contact-form.component';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { DisplayComponent } from './component/display/display.component';

@NgModule({
  declarations: [
    AppComponent,
    ContactFormComponent,
    DisplayComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
