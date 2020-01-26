package com.main;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	int itemno;
	int quantity;
	private static List<ShoppingCart> cart12 = new ArrayList<>();
	
	public int getItemNo() {
		return itemno;
	}
	public void setItemNo(int itemno) {
		this.itemno = itemno;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setProductNo(int quantity) {
		this.quantity = quantity;
	}
	
	public ShoppingCart(int itemno, int quantno) {
		this.itemno = itemno;
		this.quantity = quantno;
	}

	public static List<ShoppingCart> getCart12() {
		return cart12;
	}

	public static void setCart12(List<ShoppingCart> cart12) {
		ShoppingCart.cart12 = cart12;
	}
	

}
