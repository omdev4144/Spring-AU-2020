package com.au;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		/*
		 * //Class Level Annotation Winner obj = new Winner("SRH",2017);
		 * 
		 * Class c = obj.getClass(); Annotation an = c.getAnnotation(IPL.class); IPL x =
		 * (IPL) an; System.out.println(x.team()); System.out.println(x.year());
		 */
		
		//Method Level Annotation
		String str1="Delhi";
		Location obj23 = new Location(str1);
		
		Class Locat = obj23.getClass();
		Method method;
		try {
			method = Locat.getMethod("Location_Method", String.class);
			Annotation[] annew = method.getAnnotations();
			stadium y = (stadium) annew[0];
			System.out.println(y.city());
		} catch (NoSuchMethodException  e) {
			// TODO Auto-generated catch block
			System.out.println("Exception");
		}		
	}
}
