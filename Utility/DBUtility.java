package Utility;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtility {
	
	private final static String username = ConfigurationReader.getProperty("JDBC_Username"),
								password = ConfigurationReader.getProperty("JDBC_Password"),
								URL = ConfigurationReader.getProperty("JDBC_URL");
	
	private static Connection connection;
	private static Statement statement;

	public static DatabaseMetaData metadata;
	
	static	{
		try {
			connection = DriverManager.getConnection(URL, username, password);
			statement = connection.createStatement();
			metadata= connection.getMetaData();
		}	catch (Exception e) {
			
		}
	}
	
	public static ResultSet getResult(String SQL) {
		ResultSet result = null;
		try {
		 result = statement.executeQuery(SQL);
		}	catch (Exception e) {}
		return result;
	}
	
	public static void tearDown() {
		try {
			connection.close();
		}	catch	(Exception e) {}
		}
	
	public static void UpdateQuery(String sql) {
        // INSERT, UPDATE, , DELETE, ALTER, TRUNCATE, DROP 
    
try {
    statement.executeUpdate(sql);
} catch (SQLException e) {}
}
	
	}
	

