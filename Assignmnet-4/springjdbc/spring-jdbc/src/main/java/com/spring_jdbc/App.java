package com.spring_jdbc;
import entities.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_jdbc.dao.EmployeeDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
     EmployeeDaoImpl daoImpl =context.getBean("empDao",EmployeeDaoImpl.class);
     Employee employee = new Employee();
     employee.setEmail("z@gmail.com");
     employee.setName("Zad");
     employee.setId(8);
     int result = daoImpl.addEmployee(employee);
     System.out.println("("+result+") rows inserted..");
     
    	
    }
}
