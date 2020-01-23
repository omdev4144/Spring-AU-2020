package com.au;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//ElementType.TYPE here TYPE is class level Target
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface IPL
{
	String team() default "CSK";
	int year() default 2018;
}

@IPL(team="MI", year=2019)
class Winner
{
	String winningteam;
	int winningyear;
	
	public Winner(String winnningteam, int winningyear) {
		this.winningteam = winnningteam;
		this.winningyear = winningyear;
	}
	
	
}
