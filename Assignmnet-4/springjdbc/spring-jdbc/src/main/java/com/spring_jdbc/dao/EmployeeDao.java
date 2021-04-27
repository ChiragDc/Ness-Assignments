package com.spring_jdbc.dao;

import java.util.List;

import entities.Employee;

public interface EmployeeDao {
	public int addEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int id);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployes();
}
