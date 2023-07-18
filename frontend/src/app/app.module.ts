import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import{HttpClientModule } from '@angular/common/http'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SignupComponent } from './MyComponent/signup/signup.component';
import { DashboardComponent } from './MyComponent/dashboard/dashboard.component';
import { HeaderComponent } from './MyComponent/header/header.component';
import { HomeComponent } from './MyComponent/home/home.component';
import { EmployeeListComponent } from './MyComponent/employee-list/employee-list.component';
import { FormsModule } from '@angular/forms';
import { PersonalComponent } from './MyComponent/personal/personal.component';

@NgModule({
  declarations: [
    AppComponent,
    SignupComponent,
    DashboardComponent,
    HeaderComponent,
    HomeComponent,
    EmployeeListComponent,
    PersonalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
