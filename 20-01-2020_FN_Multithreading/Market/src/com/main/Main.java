package com.main;

public class Main {
	
	public static void main(String[] args) {
		Market m1 = new Market();
		System.out.println("Welcome to the Market");
		System.out.println("Maximum fruit per market is 30");
		System.out.println("Total Fruits inside market are collectively 120");
		
		Thread t1 = new Thread(new Consumer(m1), "Consumer 1");
		Thread t2 = new Thread(new Farmer(m1), "Farmer 1");
		
		Thread t3 = new Thread(new Consumer(m1), "Consumer 2");
		Thread t4 = new Thread(new Farmer(m1), "Farmer 2");
		
		Thread t5 = new Thread(new Consumer(m1), "Consumer 3");
		Thread t6 = new Thread(new Farmer(m1), "Farmer 3");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		

	}
	

}
