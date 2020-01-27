package com.main;

import java.util.Scanner;

public class Farmer implements Runnable{
	
	public Market Cur_Market;

	public Farmer(Market m1) {
		this.Cur_Market = m1;
	}
	
	public Market getCur_Market() {
		return Cur_Market;
	}

	public void setCur_Market(Market cur_Market) {
		this.Cur_Market = cur_Market;
	}
	
	//int[] MarketQuant = new int[] {0,0,0,0}; The below one can be done with the array
	int quant_apple=0,quant_watermaleon=0,quant_grapes=0,quant_oranges=0;
	int temp_quant_space=0;
	
	public void run() {
		
		synchronized (this.Cur_Market) {
			//System.out.println("I am Inside Farmer");
			
			Scanner sc=new Scanner(System.in);
			int runs=4;
			while(true) {
				
				System.out.println("Hello  "+Thread.currentThread().getName()+"...!!! ");
				//Checking if market is full
				
				if(this.Cur_Market.getMarketSize() == 120) {
					System.out.println("Dear "+Thread.currentThread().getName()+" Please Wait.. AS MARKET IS FULL");
					try {
						
						this.Cur_Market.wait();
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				else
				{
					//If apple Space is full
					if(this.Cur_Market.MarketFruitBuffer[0] < this.Cur_Market.max) {
						System.out.println("Enter the number of apple to send them to Market");
						quant_apple=sc.nextInt();
						//get cur_quant_space
						quant_apple = quant_apple + this.Cur_Market.MarketPendingReq[0];
						temp_quant_space = this.Cur_Market.max - this.Cur_Market.MarketFruitBuffer[0];
						
						//This if block is to handle request which is greater than space available for a particular fruit
						//temp_quant_space stores the space available for the fruit
						//quant_apple holds the value of request and add the buffer request if any
						//else handles the value that are equal to or less than availability
						//so buffer is empty and quant_apple remains the same which is overridden on next scan
					
						if(temp_quant_space < quant_apple) {
							this.Cur_Market.MarketPendingReq[0] = quant_apple - temp_quant_space;
							quant_apple = temp_quant_space;
						}else {
							this.Cur_Market.MarketPendingReq[0] = 0;
						}
						
						System.out.println("The apple waiting to be sent are " + this.Cur_Market.MarketPendingReq[0]);
						this.Cur_Market.marketaccept("apple",quant_apple);
						this.Cur_Market.displayMarket(this.Cur_Market.MarketFruitBuffer);
						this.Cur_Market.notify();
					}
					
					//If Orange space is full
					if(this.Cur_Market.MarketFruitBuffer[1] < this.Cur_Market.max) {
						System.out.println("Enter the number of oranges to send them to Market");
						quant_oranges=sc.nextInt();
						//get cur_quant_space
						quant_oranges = quant_oranges + this.Cur_Market.MarketPendingReq[1];
						temp_quant_space = this.Cur_Market.max - this.Cur_Market.MarketFruitBuffer[1];
					
						if(temp_quant_space < quant_oranges) {
							this.Cur_Market.MarketPendingReq[1] = quant_oranges - temp_quant_space;
							quant_oranges = temp_quant_space;
						}else {
							this.Cur_Market.MarketPendingReq[1] = 0;
						}
						
						System.out.println("The Oranges waiting to be sent are " + this.Cur_Market.MarketPendingReq[1]);
						this.Cur_Market.marketaccept("orange",quant_oranges);
						this.Cur_Market.displayMarket(this.Cur_Market.MarketFruitBuffer);
						this.Cur_Market.notify();
					}
					
					if(this.Cur_Market.MarketFruitBuffer[2] < this.Cur_Market.max) {
						System.out.println("Enter the number of Watermaleon to send them to Market");
						quant_watermaleon=sc.nextInt();
						//get cur_quant_space
						quant_watermaleon = quant_watermaleon + this.Cur_Market.MarketPendingReq[2];
						temp_quant_space = this.Cur_Market.max - this.Cur_Market.MarketFruitBuffer[2];
					
						if(temp_quant_space < quant_watermaleon) {
							this.Cur_Market.MarketPendingReq[2] = quant_watermaleon - temp_quant_space;
							quant_watermaleon = temp_quant_space;
						}else {
							this.Cur_Market.MarketPendingReq[2] = 0;
						}
						
						System.out.println("The WaterMelon waiting to be sent are " + this.Cur_Market.MarketPendingReq[2]);
						this.Cur_Market.marketaccept("watermelon",quant_watermaleon);
						this.Cur_Market.displayMarket(this.Cur_Market.MarketFruitBuffer);
						this.Cur_Market.notify();
					}
					
					if(this.Cur_Market.MarketFruitBuffer[3] < this.Cur_Market.max) {
						System.out.println("Enter the number of Grapes to send them to Market");
						quant_grapes=sc.nextInt();
						//get cur_quant_space
						quant_grapes = quant_grapes + this.Cur_Market.MarketPendingReq[3];
						temp_quant_space = this.Cur_Market.max - this.Cur_Market.MarketFruitBuffer[3];
					
						if(temp_quant_space < quant_grapes) {
							this.Cur_Market.MarketPendingReq[3] = quant_grapes - temp_quant_space;
							quant_grapes = temp_quant_space;
						}else {
							this.Cur_Market.MarketPendingReq[3] = 0;
						}
						
						System.out.println("The Grapes waiting to be sent are " + this.Cur_Market.MarketPendingReq[3]);
						this.Cur_Market.marketaccept("grapes",quant_grapes);
						this.Cur_Market.displayMarket(this.Cur_Market.MarketFruitBuffer);
						this.Cur_Market.notify();
					}
					System.out.println("Notifying All");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
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
					
				}//else ends				
			}//While Ends
		}
	}
}
