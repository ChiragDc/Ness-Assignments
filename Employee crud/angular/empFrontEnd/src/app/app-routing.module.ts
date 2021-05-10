import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmpComponent } from './add-emp/add-emp.component';
import { HomeComponent } from './home/home.component';
import { UpdateEmpComponent } from './update-emp/update-emp.component';


const routes:Routes=[
    {path:'home',component:HomeComponent},
    {path:'add-emp',component:AddEmpComponent},
    {path:'update-emp/:id',component:UpdateEmpComponent},
    {path:'',redirectTo:'home',pathMatch:'full'},

];

@NgModule({
    imports: [RouterModule.forRoot(routes)],                                                                                                                                                                                                                                                                                                          
    exports: [RouterModule]
  })

export class AppRoutingModule{}