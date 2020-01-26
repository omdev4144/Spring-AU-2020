package com.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_Main {
	public static void main(String[] args) {
		
		//Declaration
		ArrayList<Product> product_list = new ArrayList<Product>();
		ArrayList<ShoppingCart> cart12 = new ArrayList<>();
		ArrayList<Order> order_list = new ArrayList<Order>();
		
		//User Details
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Your name: ");
		String uname = scan.next();
		System.out.println("Hello " + uname);
		
		//Add Item to Product.java
		Product p1 = new Product(1, "Shoes", 10);
		Product p2 = new Product(2, "T-Shirt", 25);
		Product p3 = new Product(3, "Trouser", 15);
		Product p4 = new Product(4, "Goggle", 20);
		
		// add to array
		product_list.add(p1);
		product_list.add(p2);
		product_list.add(p3);
		product_list.add(p4);
		
		//Option of Action
		displayCart();
		
		//Take Option as a Input
		int cust_choice = scan.nextInt();		
		System.out.println(cust_choice);
		
		int temp,item_no,item_quant,temp1;
		int i=0,j=0,oderid = 12;
		int order_no;
		Order order_place;
		ShoppingCart itemadd;
		
		do {
			switch(cust_choice) {
				case 1:
					displayOption(product_list);
					//Option To Customer
					
					System.out.println("Enter The Product id to add to Cart");
					System.out.println("Choose The Item from here");
					System.out.println("100: To exit\n200: to add item");
					
					temp  = scan.nextInt();
					
					do {
						System.out.println("Enter Item No. :");
						item_no = scan.nextInt();
						
						System.out.println("Enter Quantity :");
						item_quant = scan.nextInt();
						
						itemadd = new ShoppingCart(item_no,item_quant);
						cart12.add(itemadd);
					
						System.out.println("100: To exit or enter 200 to add more item");
						temp  = scan.nextInt();						
					}while(temp!=100);
					//Input Product id, Product Quantity
					//Option of Action
					displayCart();
					cust_choice = scan.nextInt();
					break;
					
				case 2:
					System.out.println("Enter the Product id to remove from Cart");
					item_no = scan.nextInt();
					
					for(ShoppingCart cart1 : cart12) {
						temp1 = cart1.getItemNo();
						if(temp1 == item_no) { break; }
						i += 1;
					}
					cart12.remove(i);
					i=0;
					
					//Option of Action
					displayCart();
					cust_choice = scan.nextInt();
					break;
					
				case 3:
					System.out.println("View Items In the Cart");
					displayCart(cart12);
					
					//Option of Action
					displayCart();
					cust_choice = scan.nextInt();
					break;
					
				case 4:
					System.out.println("Place the order");
					//Show Bill and Price Status
					int[] price = new int[] {200,300,450,50}; 
				
					int total_bill=0,k=1;
					
					for(ShoppingCart cart_bill : cart12) {
						if(cart_bill.getItemNo() == k) {
							
							total_bill = total_bill + (price[k]*cart_bill.getQuantity());
						}
						k = k + 1;
					}
					
					oderid = oderid+1;
					
					order_place = new Order(oderid,uname,total_bill);
					order_list.add(order_place);
					
					System.out.println("Thanks for placing order");
					displayOrder(order_list);
					
					//Option of Action
					displayCart();
					cust_choice = scan.nextInt();
					break;
					
				case 5:
					System.out.println("Cancelling the Order Are you Sure");
					//Remove Item From Cart
					order_no = scan.nextInt();
					
					for(Order order_can : order_list) {
						temp1 = order_can.getOrderid();
						if(temp1 == order_no) { break; }
						j += 1;
					}
					cart12.remove(j);
					j=0;
					
					//Option of Action
					displayCart();
					cust_choice = scan.nextInt();
					break;
			}
		}while(cust_choice != 9);
		
		System.out.println("Thanks for shoping...!!");
		scan.close();
	}
	
	private static void displayCart() {
		System.out.println("###############################################");
		System.out.println("Shop With US...List of Item");
		System.out.println("###############################################");
		System.out.println("1. Add a product to the cart");
		System.out.println("2. Remove a product from the cart");
		System.out.println("3. View the items in the cart");
		System.out.println("4. Place the order");
		System.out.println("5. Cancel the order");
		System.out.println("9. Exit");
		System.out.println("###############################################");	
	}
	
	private static void displayOption(ArrayList<Product> product_list) {
		for(Product ob : product_list) {
			System.out.println("Item No : " + ob.getProduct_id() + " Item Name : " + ob.getProduct_name() + " Item Available : " + ob.getProduct_quant());
		}
	}
	
	private static void displayCart(ArrayList<ShoppingCart> carts) {
		for(ShoppingCart ob : carts) {
			System.out.println("Item No : " + ob.getItemNo() + " Quantity : " + ob.getQuantity());
		}
	}
	
	private static void displayOrder(ArrayList<Order> orders) {
		for(Order ob : orders) {
			System.out.println("Order Id : " + ob.getOrderid() + " Order Placed : " + ob.getUsername() + " Rate : " + ob.getRate());
		}
	}
}
