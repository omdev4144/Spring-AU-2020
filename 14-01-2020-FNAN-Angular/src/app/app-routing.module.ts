import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContactFormComponent } from './component/contact-form/contact-form.component';
import { DisplayComponent } from './component/display/display.component';


const routes: Routes = [
  {path: 'home', component: ContactFormComponent},
  {path: 'dataDisplay', component: DisplayComponent},
  {path: '', redirectTo:"/home", pathMatch:'full'},
  {path: "**", component:ContactFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
