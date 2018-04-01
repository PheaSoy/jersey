package org.sp.jersey.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.sp.jersey.model.Employee;
import org.sp.jersey.service.EmployeeServiceImpl;

@Path("/employees")
public class EmployeeResource {
	
	EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

	@GET
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON) // Accept Request
	@Produces(MediaType.APPLICATION_JSON) // Accept Response
	public Employee getEmployeeById(@PathParam("id") int id) {
		return employeeService.getEmployeeById(id);
	}
	
		
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON) // Accept Request
	@Produces(MediaType.APPLICATION_JSON) // Accept Response
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	
}
