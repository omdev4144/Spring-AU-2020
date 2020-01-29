package com.main;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Order;
import com.model.Product;
import com.model.ShoppinCart;
import com.model.User;

public class DriverMain {
	public static void main(String[] args) {
		//Class Calls
		Scanner scan = new Scanner(System.in);		
		
		//Declaration Arrays
		ArrayList<Product> productList = new ArrayList<>();
		ArrayList<ShoppinCart> cart12 = new ArrayList<>();
		ArrayList<Order> orderList = new ArrayList<>();
		
		//Integer String Declaration
		String uname;
		String password;
		int verifyToken;
		int temp = 0;
		int itemNo =0;
		int itemQuant=0;
		long oderid = 0;
		long totalBill = 0;
		
		//User Details
		System.out.println("Hello Welcome to the Shop\n\nEnter the Details");
		System.out.println("Enter the User Name :");		
		uname=scan.next();
		System.out.println("Enter the Password");
		password=scan.next();
		
		//Add Item to Product.java
		Product p1 = new Product(1, "Shoes", 10, 250);
		Product p2 = new Product(2, "T-Shirt", 25, 200);
		Product p3 = new Product(3, "Trouser", 15, 450);
		Product p4 = new Product(4, "Goggle", 20, 100);
		
		// add to array
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		
		//Product Session
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.getTransaction().commit();			
		
		
		//User Verification
		User userIn = new User();
		verifyToken = userIn.verifypassword(uname,password);
		
		if (verifyToken==1234) {
			//Allow User
			System.out.println("Enter the Product You want to buy");
			displayOption(productList);
			
			System.out.println("Enter The Product id to add to Cart");
			System.out.println("Choose The Item from here");
			System.out.println("100: To exit\n200: to add item");
			
			temp = scan.nextInt();
			
			do {
				System.out.println("Enter Item No. :");
				itemNo = scan.nextInt();
				
				System.out.println("Enter Quantity :");
				itemQuant = scan.nextInt();
				
				ShoppinCart itemAdd = new ShoppinCart(itemNo,uname, itemQuant, totalBill);
				cart12.add(itemAdd);
				
				session.beginTransaction();
				session.save(itemAdd);
				session.getTransaction().commit();
				
				System.out.println("100: To exit or enter 200 to add more item");
				temp  = scan.nextInt();						
			}while(temp!=100);
			//Input Product id, Product Quantity
			//Option of Action
			
			displayCart(cart12);
			
			System.out.println("Place the order");
			
			Order orderPlace = new Order(oderid,uname,totalBill);
			orderList.add(orderPlace);
			
			session.beginTransaction();
			session.save(orderPlace);
			session.getTransaction().commit();
			
		}
		else
		{
			System.out.println("Sorry UnAuthorised Access");
		}
		scan.close();
	}
	
	private static void displayOption(ArrayList<Product> product_list) {
		for(Product ob : product_list) {
			System.out.println("ProductId : " + ob.getProductId() + " Product Name : " + ob.getProductName() + " Product Available : " + ob.getProductQuant() + " Price Per Per Product : " + ob.getPricePerPiece());
		}
	}
	
	private static void displayCart(ArrayList<ShoppinCart> cart12) {
		for(ShoppinCart cart : cart12) {
			System.out.println("ProductId : " + cart.getItemno() + " Product Added : " + cart.getQuantity());
		}
	}

}
