package br.juliok.crud.dao;

import java.util.List;

import br.juliok.crud.beans.Employee;

public interface EmployeeDAO {
	
	// 1 - insert
	public boolean addEmployee(Employee employee);
	
	// 2 - Update
	public boolean updateEmployee(Employee employee);
	
	//3 - Delete
	public boolean deleteEmployee(int employeeId);
	
	//4 - Get All
	public List<Employee> getAllEmployees();
	
	// 5 - Get
	public Employee getEmployee(int employeeId);

}
