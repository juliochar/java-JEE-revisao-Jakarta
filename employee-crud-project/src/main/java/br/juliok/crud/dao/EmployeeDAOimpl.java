package br.juliok.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.juliok.crud.beans.Employee;
import employee.crud.db.DBConnection;

public class EmployeeDAOimpl implements EmployeeDAO {

	private static Connection connection = DBConnection.connection;
	
	@Override
	public boolean addEmployee(Employee employee) {
		try {
			
			String insertStatement = "INSERT INTO `employee_db`.`employee` (`NAME`, `email`, `phone`, `address`) VALUES (?,?,?,?);";
			PreparedStatement preparedstatement = connection.prepareStatement(insertStatement);
			preparedstatement.setString(1, employee.getName());
			preparedstatement.setString(2, employee.getEmail());
			preparedstatement.setString(3, employee.getPhone());
			preparedstatement.setString(4, employee.getAddress());
			
			int result = preparedstatement.executeUpdate();
			
			return result == 1 ? true:false;	
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean updateEmployee(Employee employee) {
			
		
		try {
			
			String updatestatement = "UPDATE employee_db.employee SET name = ?, email=?, phone=?,address = ? WHERE id=?;";
			
			PreparedStatement preparedstatement = connection.prepareStatement(updatestatement);
			preparedstatement.setString(1, employee.getName());
			preparedstatement.setString(2, employee.getEmail());
			preparedstatement.setString(3, employee.getPhone());
			preparedstatement.setString(4, employee.getAddress());
			preparedstatement.setInt(5, employee.getId());
			
			int result = preparedstatement.executeUpdate();
			
			return result == 1 ? true:false;	
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		
		try {
			
			String deletestatement = "DELETE FROM employee_db.employee WHERE id = ?;";
			
			PreparedStatement preparedstatement = connection.prepareStatement(deletestatement);
		
			preparedstatement.setInt(1, employeeId);
			
			int result = preparedstatement.executeUpdate();
			
			return result == 1 ? true:false;	
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		try {
			
			String selectstatement = "SELECT * FROM employee;";
			
			PreparedStatement preparedstatement = connection.prepareStatement(selectstatement);
			
			ResultSet rs = preparedstatement.executeQuery();
			
			List<Employee> employees = new ArrayList<Employee>();
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhone(rs.getString("phone"));
				emp.setAddress(rs.getString("address"));
				
				employees.add(emp);
				
				
			}
			
			return employees;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public Employee getEmployee(int employeeId) {
		try {
			
			String selectstatement = "SELECT * FROM employee where id=?;";
			
			PreparedStatement preparedstatement = connection.prepareStatement(selectstatement);
			preparedstatement.setInt(1, employeeId);
			
			ResultSet rs = preparedstatement.executeQuery();
			
			Employee emp = new Employee();
			
			while(rs.next()) {
				
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhone(rs.getString("phone"));
				emp.setAddress(rs.getString("address"));
				
			
				
				
			}
			
			return emp;
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
				
		/**
		Employee employee = new Employee();
		employee.setId(11);
		employee.setName("Karim2");
		employee.setEmail("karim2@gmail.com");
		employee.setAddress("Russia...");
		employee.setPhone("652178127");
		**/
		
		EmployeeDAOimpl emp = new EmployeeDAOimpl();
		//System.out.println(emp.addEmployee(employee));
		//System.out.println(emp.updateEmployee(employee));
		//System.out.println(emp.deleteEmployee(11));
		
		//System.out.println(emp.getAllEmployees());
		
		System.out.println(emp.getEmployee(10));
		
		
		
	}

}
