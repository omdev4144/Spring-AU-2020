package com.di.model;

import java.util.Map;

public class Employee {
	private int departmentId;	
	private String deptName;
	private Map<String, String> Employees;
	
	public Employee(int departmentId, String deptName, Map<String, String> employee) {
		super();
		this.departmentId = departmentId;
		this.deptName = deptName;
		Employees = employee;
	}
	
	public void displayResult() {
		System.out.println("Department id is : "+departmentId);
		System.out.println("Department Name is : "+deptName);
		System.out.println("Employee Details....");
		for (Map.Entry val1 : Employees.entrySet()) {
			System.out.println("Employee Designation :"+val1.getKey() +", Name : "+ val1.getValue());
		}
	}

	public Map<String, String> getEmployee() {
		return Employees;
	}

	public void setEmployee(Map<String, String> employee) {
		Employees = employee;
	}
}
