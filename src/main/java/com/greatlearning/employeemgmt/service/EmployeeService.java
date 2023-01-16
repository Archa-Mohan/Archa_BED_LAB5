package com.greatlearning.employeemgmt.service;

import java.util.List;

import com.greatlearning.employeemgmt.model.Employee;

public interface EmployeeService {

	// For viewing all the employee
	public List<Employee> getAllEmployees();

	// Save or Update employee details to DB
	public void saveOrUpdate(Employee emp);

	// Delete employee details using emp_id
	public void deleteEmployeeById(int id);

	// Read employee details from DB using emp_Id
	public Employee getEmployeeById(int id);

}
