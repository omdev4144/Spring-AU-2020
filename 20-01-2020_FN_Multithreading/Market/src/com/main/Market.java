package com.main;

public class Market {
	int[] MarketFruitBuffer = new int[]{ 0,0,0,0 };
	int[] MarketPendingReq = new int[] {0,0,0,0};
	int max=30;
	int temp_pend_req=0;
	
	
	public int getMarketSize() {
		int totMarketSize=0;
		for(int i=0;i<4;i++) {
			totMarketSize += MarketFruitBuffer[i];
		}
		return totMarketSize;
	}
	
	public void marketaccept(String str_req, int quant) {
		//get current market availability
		if (str_req == "apple") {
			MarketFruitBuffer[0] += quant;
		}
		
		if (str_req == "orange") {
			MarketFruitBuffer[1] += quant;
		}
		
		if (str_req == "watermelon") {
			MarketFruitBuffer[2] += quant;
		}
		
		if (str_req == "grapes") {
			MarketFruitBuffer[3] += quant;
		}
		//notify farmer;
		
	}

	public void displayMarket(int[] marketFruitBuffer) {
		this.MarketFruitBuffer = marketFruitBuffer;
		
		for(int i=0;i<4;i++) {
			temp_pend_req = (MarketFruitBuffer[i]<30 && MarketPendingReq[i]>0) ? MarketPendingReq[i] : 0; //Checking if Buffer has space also provided we have req pending
			if(temp_pend_req!=0) {
				temp_pend_req=checkbuffer(MarketFruitBuffer, MarketPendingReq, i, temp_pend_req); //Checking if the pending sale is accomodable or not
			}
			MarketFruitBuffer[i] += temp_pend_req;
		}	
		
		System.out.println("Fruits in the Market :");
		System.out.println("[ "+marketFruitBuffer[0]+" , "+marketFruitBuffer[1]+" , "+marketFruitBuffer[2]+" , "+marketFruitBuffer[3]+" ]");
		System.out.println();
		System.out.println("Pending Farmer Request to Market :");
		System.out.println("[ "+MarketPendingReq[0]+" , "+MarketPendingReq[1]+" , "+MarketPendingReq[2]+" , "+MarketPendingReq[3]+" ]");
		
	}
	
	public int checkbuffer(int[] MarketFruitBuffer,int[] MarketPendingReq,int i,int temp_pend_req) {
		this.MarketFruitBuffer = MarketFruitBuffer;
		this.MarketPendingReq = MarketPendingReq;
		
		if((30 - MarketFruitBuffer[i]) > MarketPendingReq[i]) {
			MarketPendingReq[i]=0;
		}
		else {
			temp_pend_req = 30 - MarketFruitBuffer[i];
			MarketPendingReq[i] -= temp_pend_req;
		}
		return temp_pend_req;
	}
	
	
}
