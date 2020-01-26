package com.main;

public class Order {
	private int Orderid;
	private String Username;
	private int rate;
	
	public Order(int oderid, String uname, int bill_to) {
		this.Orderid = oderid;
		this.Username = uname;
		this.rate = bill_to;
	}
	public int getOrderid() {
		return Orderid;
	}
	public void setOrderid(int orderid) {
		Orderid = orderid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}

}
