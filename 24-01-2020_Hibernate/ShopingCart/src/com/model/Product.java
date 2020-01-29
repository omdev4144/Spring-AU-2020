package com.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ProductTable")
public class Product extends ShoppinCart{
	
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="ProductId")
	ArrayList<Order> orderList = new ArrayList<>();
	
	@Transient
	ArrayList<ShoppinCart> cart12 = new ArrayList<>();

	
	
	@Id
	int ProductId;
	String ProductName;
	int ProductQuant;
	long PricePerPiece;
	
	public Product(int productId, String productName, int productQuant, long pricePerPiece) {
		super(productId,productName,productQuant,pricePerPiece);
	}
	
	
	public int getProductId() {
		return ProductId;
	}


	public void setProductId(int productId) {
		ProductId = productId;
	}


	public String getProductName() {
		return ProductName;
	}


	public void setProductName(String productName) {
		ProductName = productName;
	}


	public int getProductQuant() {
		return ProductQuant;
	}


	public void setProductQuant(int productQuant) {
		ProductQuant = productQuant;
	}


	public long getPricePerPiece() {
		return PricePerPiece;
	}


	public void setPricePerPiece(long pricePerPiece) {
		PricePerPiece = pricePerPiece;
	}

	
}