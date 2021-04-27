package com.dc.springjdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dc.springjdbc.dao.EmployeeDao;
import com.dc.springjdbc.entities.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);
		BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("1 for add");
			System.out.println("2 for getall");
			System.out.println("3 for getbyid");
			System.out.println("4 for del");
			System.out.println("5 for update");

			try {
				int input = Integer.parseInt(breader.readLine());

				switch (input) {
				case 1:
					System.out.println("id");
					int id= Integer.parseInt(breader.readLine());
					System.out.println("name");
					String name=breader.readLine();
					System.out.println("email");
					String email=breader.readLine();
					Employee emp1= new Employee();
					emp1.setId(id);
					emp1.setName(name);
					emp1.setEmail(email);
					dao.addEmployee(emp1);
					System.out.println("Insertion done");
					break;
				case 2:
					List<Employee> emp2 =dao.getAllEmployees();
					for(Employee employee:emp2) {
						System.out.println(employee);
					}
					break;
				case 3:
					System.out.println("id");
					int id3= Integer.parseInt(breader.readLine());
					Employee emp3 =new Employee();
					emp3.setId(id3);
					
					System.out.println(dao.getEmployeeByID(id3));
					break;
				case 4:
					System.out.println("id");
					int id4= Integer.parseInt(breader.readLine());
					Employee emp4 =new Employee();
					emp4.setId(id4);
					dao.deleteEmployee(id4);

					break;
				case 5:
					System.out.println("ent id");
					int id2= Integer.parseInt(breader.readLine());
					System.out.println("name");
					String name2=breader.readLine();
					System.out.println("email");
					String email2=breader.readLine();
					Employee emp5=new Employee();
					emp5.setId(id2);
					emp5.setEmail(email2);
					emp5.setName(name2);
					dao.updateEmployee(emp5);
					break;

				default:
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}
