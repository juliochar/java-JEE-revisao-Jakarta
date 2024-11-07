package employee.crud.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static final String dbURL = "jdbc:mariadb://localhost:3306/employee_db";
	public static final String username = "root";
	public static final String dbpassword = "admin123";
		
	public static Connection getConnection() {
		
		System.out.println("Começando o GetConnection()..."); // Logger: log4j
		
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("org.mariadb.jdbc.Driver");

			
			connection = DriverManager.getConnection(dbURL,username,dbpassword);
			
			if(connection != null) {
				System.out.println("Conectado...!");
				return connection;
			}
			else {
				System.out.println("Probelam em Conexão...");
				return null;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
			
		}
	}
	
	public static Connection connection = getConnection();
	
	
	
	public static void main(String[] args) {
		System.out.println(DBConnection.connection);
	} 
	

}
