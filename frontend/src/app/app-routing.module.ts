import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { SignupComponent } from './MyComponent/signup/signup.component';
import { DashboardComponent } from './MyComponent/dashboard/dashboard.component';
import { HomeComponent } from './MyComponent/home/home.component';
import { EmployeeListComponent } from './MyComponent/employee-list/employee-list.component';
import { PersonalComponent } from './MyComponent/personal/personal.component';

const routes: Routes = [
  {path: '',component:DashboardComponent},
  { path: 'signup',component: SignupComponent},
  {path: 'home',component:HomeComponent},
  {path: 'employee-list', component:EmployeeListComponent},
  {path: 'personal' , component:PersonalComponent}
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)], 
  exports: [RouterModule]
})
export class AppRoutingModule { }
