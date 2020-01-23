package com.main;

import java.sql.*;

public class Main {

	public static void main(String[] args) {		
		try {
			//
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","password");
			
			// Statement
			Statement myStmt = myConn.createStatement();
			 
			// Execute
			ResultSet myRs = myStmt.executeQuery("CALL JoinDepartmentId();");
			
			//Calling Employee Object
			
			
			// Evaluating
			while (myRs.next()) {
				String string1 = myRs.getString("firstNm");
				String string2 = myRs.getString("lastNm"); 
				System.out.println(string1 + ", " + string2);
				
				Employee obj = new Employee(string1,string2);
				obj.setFirstname(string1);
				obj.setLastname(string2);
				obj.addElement(string1, string2);
				
			}
			
			myConn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
