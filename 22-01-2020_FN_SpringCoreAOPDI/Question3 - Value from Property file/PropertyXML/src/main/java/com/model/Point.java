package com.model;


public class Point {
	
	private int x,y;
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

	public void displayPoint() {
		System.out.println("The value of given x & y is :"+Integer.toString(getX())+" "+Integer.toString(getY()));
	}
}
