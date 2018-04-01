package org.sp.jersey.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.sp.jersey.exception.EmployeeException;
import org.sp.jersey.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private List<Employee> employeeList;

	public EmployeeServiceImpl() {
		employeeList = new ArrayList<>();
		employeeList.add(new Employee(10, "Phea", "Soy", 100.0));
		employeeList.add(new Employee(12, "Sopheaktra", "Yorn", 200.0));
		employeeList.add(new Employee(10, "John", "Sina", 100.0));
	}

	@Override
	public Employee getEmployeeById(int id) {

		Optional<Employee> myEmployeeSearch = this.employeeList.stream().filter(emp -> emp.getId() == id).findFirst();
		if (myEmployeeSearch.isPresent()) {
			return myEmployeeSearch.get();
		}
		throw new EmployeeException();

	}

	@Override
	public boolean deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		for (Employee emp : employeeList) {
			if (emp.getId() == id) {
				
				employeeList.remove(emp);
				System.out.println("emplo:"+employeeList);
				return true;
			}
		} 	
		throw new EmployeeException();
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeList;
	}

}
