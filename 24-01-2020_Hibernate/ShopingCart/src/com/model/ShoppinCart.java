package com.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CartTable")
public class ShoppinCart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int token;
	
	int itemno;
	int quantity;
	@GeneratedValue(strategy=GenerationType.AUTO)
	int orderid;
	
	public ShoppinCart(int itemno, String productName, int quantno, long pricePerPiece) {
		this.itemno = itemno;
		this.quantity = quantno;
	}

	public int getItemno() {
		return itemno;
	}

	public void setItemno(int itemno) {
		this.itemno = itemno;
	}

	public int getQuantity() {
		return quantity;
	}
	
	@ElementCollection
	private Collection<ShoppinCart> cart = new ArrayList<ShoppinCart>();
	

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
