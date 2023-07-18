import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from 'src/app/employee';
import { EmployeeService } from 'src/app/employee.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {

  employee:Employee = new Employee();
  constructor(private employeeService: EmployeeService, 
    private router:Router) {}
  
  saveEmployee(){
    this.employeeService.createEmployee(this.employee).subscribe(data =>{
       console.log(data);
       this.goToHome();
    },
    error => console.log(error));
  }

  goToHome(){
      this.router.navigate(['/home']);
  }
  onSubmit(){
    console.log(this.employee);
    this.router.navigate(['/home']);
    this.saveEmployee(); 
  }

}
