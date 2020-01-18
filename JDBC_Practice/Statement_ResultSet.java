package JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_ResultSet {

	public static void main(String[] args) throws SQLException{
		
		
		
		String username = "hr";
		String password = "hr";
		String URL = "jdbc:oracle:thin:@54.161.195.143:1521:XE"; 
		
		//	Connection is created
		Connection connection = DriverManager.getConnection(URL, username, password);
		System.out.println("Connected Successfully");

		//	statement runs the queries
		Statement statement = connection.createStatement();
		System.out.println("Statement created");

		//	ResultSet holds the results from the queries
		ResultSet result = statement.executeQuery("Select * From employees");
		System.out.println("Result set is completed");
		
		while(result.next()) {
//			String firstname = result.getString("first_name");
			String firstName = result.getString(2);
			String lastName = result.getString(3);
			int salary = result.getInt("salary");
			System.out.println(firstName + " " + lastName + " $" + salary);
		}
		
		String SQL = "Update employees set first_name = 'Emrah' where first_name = 'Abuzer'";
		
		statement.executeUpdate(SQL);
		
		}
	
}
