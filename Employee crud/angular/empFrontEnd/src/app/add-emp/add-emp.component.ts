import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import Swal from 'sweetalert2'

@Component({
  selector: 'app-add-emp',
  templateUrl: './add-emp.component.html',
  styleUrls: ['./add-emp.component.css']
})
export class AddEmpComponent implements OnInit {

  employee:Employee=new Employee();
  

  constructor(private employeeService:EmployeeService,private router:Router) { }

  ngOnInit(): void {
  } 
  saveEmployee(){
    this.employeeService.createEmployee(this.employee).subscribe( data =>{
      this.goToEmployeeList();
    },
    error => console.log(error));
  }
  goToEmployeeList(){
    this.router.navigate(['/home']);
  }
  onSubmit(){
    Swal.fire(
      'Done',
      'Employee Successfully added',
      'success'
    )
   this.saveEmployee();
  }

}
