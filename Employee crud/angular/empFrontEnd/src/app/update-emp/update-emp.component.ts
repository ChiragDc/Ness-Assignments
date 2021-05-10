import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import Swal from 'sweetalert2'

@Component({
  selector: 'app-update-emp',
  templateUrl: './update-emp.component.html',
  styleUrls: ['./update-emp.component.css']
})
export class UpdateEmpComponent implements OnInit {

  id:number;
  employee:Employee=new Employee();

  constructor(private employeeService:EmployeeService,private route:ActivatedRoute,
    private router:Router
    ) { }

    ngOnInit(): void {
      this.id = this.route.snapshot.params['id'];
  
      this.employeeService.getEmployeeById(this.id).subscribe(data => {
        this.employee = data;
      }, error => console.log(error));
    }

    onSubmit(firstName:string,lastName:string){

      Swal.fire({
        title: 'Are you sure?',
        html: "You will be making changes <strong>"+this.employee.firstName+" "+this.employee.lastName+ "</strong> details in the database",
        icon: 'warning',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: 'Yes'
      }).then((result) => {
        if (result.isConfirmed) {
          this.employeeService.updateEmployee(this.id, this.employee).subscribe( data =>{
            this.goToEmployeeList();
          }
          , error => console.log(error));
          Swal.fire(
            'Done!',
            'Employee Details has been updated',
            'success'
          )
        }
      })


      // this.employeeService.updateEmployee(this.id, this.employee).subscribe( data =>{
      //   this.goToEmployeeList();
      // }
      // , error => console.log(error));
    }

    goToEmployeeList(){
      this.router.navigate(['/home']);
    }

}
