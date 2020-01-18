package JDBC_Practice;

import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;

import Utility.DBUtility;

public class ResultSet_Map {

	public static void main(String[] args) throws Exception{
		
		ResultSet result = DBUtility.getResult("select * from employees"); 
		
		Map<String, Integer> EmployeeInfo = new LinkedHashMap<>();
		
		while(result.next()) {
			String firstName = result.getString("first_name");
			String lastName = result.getString("last_name");
			String fullName = firstName + " "+lastName;
			Integer salary = result.getInt("salary");
			
//			System.out.println(fullName +" $"+ salary);
			
			EmployeeInfo.put(fullName, salary);
		}
		System.out.println(EmployeeInfo);
		
		System.out.println(EmployeeInfo.get("Steven King") == 24000);
		System.out.println(EmployeeInfo.get("Emrah Aktepe"));
	}
	
}
