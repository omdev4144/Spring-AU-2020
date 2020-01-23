package com.main;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.Duration;
import java.time.ZoneOffset;
import java.util.TimeZone;

public class DateDifferentExample {
	public static void main(String[] args) {
		String dateParent = "07/01/1976 03:50:58";
		String dateChild = "11/07/1998 23:45:58";
		
		caldiffer(dateParent,dateChild);
		timezonediffer(dateParent,dateChild);
	}
	
	public static void caldiffer(String d1,String d2) {
		
		LocalDate d1_date = null;
		LocalDate d2_date = null;
		try {
			d1_date = LocalDate.parse(d1);
			d2_date = LocalDate.parse(d2);
			
			Duration duration = Duration.between(d1_date.atStartOfDay().toInstant(ZoneOffset.UTC), d2_date.atStartOfDay().toInstant(ZoneOffset.UTC));
			Double sec = (duration.getSeconds() * Math.pow(10,9)) + duration.getNano();
	        System.out.println("diff: " + sec + " ns");
		}catch(Exception e) {
			System.out.println(e);
		}		
	}
	
	public static void timezonediffer(String d1, String d2) {
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		LocalDate d1_date = null;
		LocalDate d2_date = null;
		try {			
			format.setTimeZone(TimeZone.getTimeZone("UTC"));
			d1_date = LocalDate.parse(d1);
			
			format.setTimeZone(TimeZone.getTimeZone("Asia/Culcutta"));
			d2_date = LocalDate.parse(d2);
			
			
			long zduration = Duration.between(d1_date, d2_date).toDays();
	        System.out.println("diff: " + zduration + " days");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
