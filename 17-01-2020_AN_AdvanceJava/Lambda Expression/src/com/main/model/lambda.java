package com.main.model;


public class lambda {
   public static void main(String args[]) {
	   String a1 = "Mumbai Indians";
	   String b2 = "Rohit Sharma";
	   String c3 = "Wankhade Stadium, Mumbai";
	   
	   TriConsumer abc = (a,b,c) -> {
		   String str = a + " " + b + " " + c ;
		   System.out.println(str);
	   };
	
	   abc.consume(a1, b2, c3);

   }
}

@FunctionalInterface
interface TriConsumer{
	void consume(String a,String b, String c);
	
}