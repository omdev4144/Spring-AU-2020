package com.au;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface stadium{
	String city() default "Banglore";
}

class Location
{
	String string;
	public Location(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
		System.out.println("I am the Value Passed");
		//System.out.println(string);
	}

	@stadium(city="Small delhi")
	public void Location_Method(String string2) {
		this.string = string2;
		System.out.println("I am in Method Level Annotation");
		System.out.println(string2);
		
	}
}
