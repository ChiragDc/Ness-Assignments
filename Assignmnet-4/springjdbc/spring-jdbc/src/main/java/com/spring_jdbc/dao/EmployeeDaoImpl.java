package com.spring_jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String query = "insert into employee (id, name, email) values (?,?,?)";
        int result =  jdbcTemplate.update(query,employee.getId(), employee.getName(), employee.getEmail());
        return result;
		
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployes() {
		// TODO Auto-generated method stub
		return null;
	}

}
