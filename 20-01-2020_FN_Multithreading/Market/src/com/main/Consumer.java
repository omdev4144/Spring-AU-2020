package com.main;

import java.util.Scanner;

public class Consumer implements Runnable{

	public Market Cur_Market;

	public Consumer(Market m1) {
		this.Cur_Market = m1;
	}

	public Market getCur_Market() {
		return Cur_Market;
	}

	public void setCur_Market(Market cur_Market) {
		this.Cur_Market = cur_Market;
	}
	
	int choice=0,quant=0;

	public void run() {	
		
		synchronized (this.Cur_Market) {
			
			//System.out.println("I am Inside Consumer");
			
			Scanner sc=new Scanner(System.in);
			int runs=2;
			while(true) {
				
				System.out.println("Hello  "+Thread.currentThread().getName()+"...!!! ");
				
				if(this.Cur_Market.getMarketSize() == 0) {
					
					System.out.println("Please "+Thread.currentThread().getName()+" , Wait For The supplies");
					
					try {
						this.Cur_Market.wait();
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				else {
					System.out.println("Choose a fruit\n1.Apple\n2.Orange\n3.Watermelon\n4.Grapes\n");
					choice=sc.nextInt();
					switch(choice) {
					case 1:
						if(this.Cur_Market.MarketFruitBuffer[0] == 0) {
							try {
								this.Cur_Market.wait();
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else {
							//ask for quant less than 30
							System.out.println("Enter the number of Apple to Buy");
							quant = sc.nextInt();
							
							if(quant <= this.Cur_Market.MarketFruitBuffer[0]) {
								this.Cur_Market.MarketFruitBuffer[0] -= quant;	
							}else {
								System.out.println("Only "+this.Cur_Market.MarketFruitBuffer[0]+" number of Aplle are available, Make Another Request");
							}
							this.Cur_Market.displayMarket(this.Cur_Market.MarketFruitBuffer);
							this.Cur_Market.notify();
							//reduce quant
						}
						//if apple ends
						break;
						
					case 2:
						if(this.Cur_Market.MarketFruitBuffer[1] == 0) {
							try {
								this.Cur_Market.wait();
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else {
							System.out.println("Enter the number of Orange to Buy");
							quant = sc.nextInt();
							
							if(quant <= this.Cur_Market.MarketFruitBuffer[1]) {
								this.Cur_Market.MarketFruitBuffer[1] -= quant;	
							}else {
								System.out.println("Only "+this.Cur_Market.MarketFruitBuffer[1]+" number of Orange are available, Make Another Request");
							}
							this.Cur_Market.displayMarket(this.Cur_Market.MarketFruitBuffer);
							this.Cur_Market.notify();
						}
						//if Orange Ends
						break;
						
					case 3:
						if(this.Cur_Market.MarketFruitBuffer[2] == 0) {
							try {
								this.Cur_Market.wait();
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else {
							System.out.println("Enter the number of Watermelon to Buy");
							quant = sc.nextInt();
							
							if(quant <= this.Cur_Market.MarketFruitBuffer[2]) {
								this.Cur_Market.MarketFruitBuffer[2] -= quant;	
							}else {
								System.out.println("Only "+this.Cur_Market.MarketFruitBuffer[2]+" number of WaterMelon are available, Make Another Request");
							}
							this.Cur_Market.displayMarket(this.Cur_Market.MarketFruitBuffer);
							this.Cur_Market.notify();
						}
						//if Watermelon ends
						break;
					
					case 4:
						if(this.Cur_Market.MarketFruitBuffer[3] == 0) {
							try {
								this.Cur_Market.wait();
								Thread.sleep(1000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}else {
							System.out.println("Enter the number of Grapes to Buy");
							quant = sc.nextInt();
							
							if(quant <= this.Cur_Market.MarketFruitBuffer[3]) {
								this.Cur_Market.MarketFruitBuffer[3] -= quant;	
							}else {
								System.out.println("Only "+this.Cur_Market.MarketFruitBuffer[3]+" number of Grapes are available, Make Another Request");
							}
							this.Cur_Market.displayMarket(this.Cur_Market.MarketFruitBuffer);
							this.Cur_Market.notify();
						}
						//if Grapes ends
						break;
						
					default:				
						System.out.println("Sorry You Entered Wrong Choice");
						break;
					}//switch ends
				}//else ends
				
				if(runs==1) {
					
					try {
						this.Cur_Market.wait();
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					runs=3;
				}
					
				runs--;
				this.Cur_Market.notifyAll();
			}
			//while ends
		}
		//sync ends
		
	}
	
}
