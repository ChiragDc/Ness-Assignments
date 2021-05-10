import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import Swal from 'sweetalert2';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  employees:Employee[];
  

  constructor(private employeeService:EmployeeService,private router:Router) { }

  ngOnInit(): void {
    this.getEmployees();
    
    
  }
  private getEmployees(){
    this.employeeService.getEmployeesList().subscribe(data => {
      this.employees = data;
    });
  }
  
  updateEmployee(id: number){
    this.router.navigate(['update-emp', id]);
  }
  deleteEmployee(id: number){
    this.employeeService.deleteEmployee(id).subscribe( data => {
      console.log(data);
      this.getEmployees();
    })
  }
  confirm(id: number,firstName:string,lastName:string){
    Swal.fire({
      title: 'Are you sure?',
      html:'This will delete <strong>'+firstName+' '+lastName+'</strong> from the Datbase',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Yes'
    }).then((result) => {
      if (result.isConfirmed) {
        this.deleteEmployee(id);
        Swal.fire(
          'Deleted!',
          firstName+' '+lastName+' has been removed from Database.',
          'success'
        )
      }
    })
  }
  
    

    
    
  


}
