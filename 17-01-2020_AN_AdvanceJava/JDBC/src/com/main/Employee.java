package com.main;

import java.util.ArrayList;

public class Employee {

	private String Firstname;
	private String Lastname;
	
	ArrayList<Employee> Al = new ArrayList<Employee>();
	
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
	public Employee(String Firstname,String Lastname) {
		this.Firstname = Firstname;
		this.Lastname = Lastname;
	}
	
	public void addElement(String str1, String str2) {
		str1=Firstname;
		str2=Lastname;
		System.out.println("\n\n");
		System.out.println("This is from Class Employee");
		//System.out.println(str1 + " " + str2);
		Employee temp = new Employee(str1,str2);
		Al.add(temp);
		System.out.println(Al);
	}
}
