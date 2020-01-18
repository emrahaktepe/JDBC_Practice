package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnection {
	
	public static void main(String[] args) throws SQLException{
		
	
	
	String username = "hr";
	String password = "hr";
	String URL = "jdbc:oracle:thin:@54.161.195.143:1521:XE"; 
	
	Connection connection = DriverManager.getConnection(URL, username, password);
	
	System.out.println("Connected Successfully");
	
	}

}
