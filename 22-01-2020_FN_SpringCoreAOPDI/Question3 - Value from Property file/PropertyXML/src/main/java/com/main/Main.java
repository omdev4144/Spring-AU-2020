package com.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Point;


@Configuration
@PropertySource("file:src/main/resource/application.properties")
public class Main {
		
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Point pnt = (Point) context.getBean("Point");		
		
		pnt.displayPoint();
	}
}
