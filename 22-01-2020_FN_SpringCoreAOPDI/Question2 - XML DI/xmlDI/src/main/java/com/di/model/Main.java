package com.di.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
        Employee employeeDetails = (Employee)context.getBean("Employee");
        employeeDetails.displayResult();
	}
}
