package com.main;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private int product_id;
	private String product_name;
	private int product_quant;
	private static List<Product> productList = new ArrayList<>();
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getProduct_quant() {
		return product_quant;
	}
	public void setProduct_quant(int product_quant) {
		this.product_quant = product_quant;
	}
	public static List<Product> getProductList() {
		return productList;
	}
	public static void setProductList(List<Product> productList) {
		Product.productList = productList;
	}
	
	public Product(int id, String name, int quant) {
		this.product_id = id;
		this.product_name = name;
		this.product_quant = quant;
	}
	

}
