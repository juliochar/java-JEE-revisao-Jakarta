package br.juliok.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	private static Connection conn = null;
	
	
	public static Connection openConnection() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db","root", "admin123");
			
			return conn;
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
			
		}
				
	}
	
	public static boolean closeConnection() {
		
		
		try {
			conn.close();
			return true;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	public static void main(String[] args) {
		DbConnection dbcon = new DbConnection();
		System.out.println(dbcon.openConnection());
		
				
	}
	
	
	
}
