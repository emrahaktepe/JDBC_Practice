package JDBC_Practice;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import Utility.DBUtility;

public class MetaData {
	
	public static void main(String[] args) throws SQLException{
		
		System.out.println(DBUtility.metadata.getUserName());
		System.out.println(DBUtility.metadata.getDriverVersion());
		System.out.println(DBUtility.metadata.getDriverName());
		
		
		ResultSet rs = DBUtility.getResult("select * from employees");
		ResultSetMetaData resultData = rs.getMetaData();
		
		System.out.println(resultData.getColumnCount());
		System.out.println(resultData.getColumnName(5));
		
		System.out.println("==========================");
		
		for (int i = 1; i<resultData.getColumnCount(); i++) {
			System.out.println(resultData.getColumnName(i));
			}
		
	}

}
