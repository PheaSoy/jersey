package org.sp.jersey.service;

import java.util.List;

import org.sp.jersey.model.Employee;

public interface EmployeeService {
	
	public  Employee getEmployeeById(int id);
	public  boolean deleteEmployeeById(int id);
	public  List<Employee> getAllEmployee();

}
