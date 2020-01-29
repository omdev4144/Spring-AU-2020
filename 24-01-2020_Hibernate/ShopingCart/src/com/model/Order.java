package com.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OrderTable")
public class Order {
	
	@Id
	@GeneratedValue()
	long Orderid;
	
	@OneToOne
	long TotalBill;
	
	@ManyToOne
	String User;
	
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public long getOrderid() {
		return Orderid;
	}
	public void setOrderid(long orderid) {
		Orderid = orderid;
	}
	public long getTotalBill() {
		return TotalBill;
	}
	public void setTotalBill(long totalBill) {
		TotalBill = totalBill;
	}
	
	@ElementCollection
	private Collection<Product> productList = new ArrayList<Product>();
	
	public Order(long orderid, String user, long totalBill) {
		super();
		User = user;
		Orderid = orderid;
		TotalBill = totalBill;
	}
	

}
