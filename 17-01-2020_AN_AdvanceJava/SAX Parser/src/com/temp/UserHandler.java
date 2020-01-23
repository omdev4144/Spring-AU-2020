package com.temp;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class UserHandler extends DefaultHandler {

	boolean bRegion=false,bCountry=false, bItemType=false, bSalesChannel=false, bOrderPriority=false, bOrderDate=false, bOrderID=false, bShipDate=false, bUnitSold=false, bUnitPrice=false, bUnitCost=false, bTotalRvenue=false, bTotalCost=false, bTotalProfit=false;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException{
		System.out.println("Start Element: " + qName);
		if(qName.equals("Region")) bRegion=true;
		if(qName.equals("Country")) bCountry=true;
		if(qName.equals("ItemType")) bItemType=true;
		if(qName.equals("SalesChannel")) bSalesChannel=true;
		if(qName.equals("OrderPriority")) bOrderPriority=true;
		if(qName.equals("OrderDate")) bOrderDate=true;
		if(qName.equals("OrderID")) bOrderID=true;
		if(qName.equals("ShipDate")) bShipDate=true;
		if(qName.equals("UnitSold")) bUnitSold=true;
		if(qName.equals("UnitPrice")) bUnitPrice=true;
		if(qName.equals("UnitCost")) bUnitCost=true;
		if(qName.equals("TotalRvenue")) bTotalRvenue=true;
		if(qName.equals("TotalCost")) bTotalCost=true;
		if(qName.equals("TotalProfit")) bTotalProfit=true;
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException 
	{
		System.out.println("Start Element: "+ qName);
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException
	{
		if(bRegion) {
			System.out.println("Region name: " + new String(ch, start, length));
			bRegion=false;
		}
		if(bCountry) {
			System.out.println("Country name: " + new String(ch, start, length));
			bCountry=false;
		}
		if(bItemType) {
			System.out.println("Item Type: " + new String(ch, start, length));
			bItemType=false;
		}
		if(bSalesChannel) {
			System.out.println("Sales Channel: " + new String(ch, start, length));
			bSalesChannel=false;
		}
		if(bOrderPriority) {
			System.out.println("Order Priority: " + new String(ch, start, length));
			bOrderPriority=false;
		}
		if(bOrderDate) {
			System.out.println("Order Date: " + new String(ch, start, length));
			bOrderDate=false;
		}
		if(bOrderID) {
			System.out.println("Order Id: " + new String(ch, start, length));
			bOrderID=false;
		}
		if(bShipDate) {
			System.out.println("Ship Date: " + new String(ch, start, length));
			bShipDate=false;
		}
		if(bUnitSold) {
			System.out.println("Unit Sold: " + new String(ch, start, length));
			bUnitSold=false;
		}
		if(bUnitPrice) {
			System.out.println("Unit Price: " + new String(ch, start, length));
			bUnitPrice=false;
		}
		if(bUnitCost) {
			System.out.println("Unit Cost: " + new String(ch, start, length));
			bUnitCost=false;
		}
		if(bTotalRvenue) {
			System.out.println("Total Revenue: " + new String(ch, start, length));
			bTotalRvenue=false;
		}
		if(bTotalCost) {
			System.out.println("Total Cost: " + new String(ch, start, length));
			bTotalCost=false;
		}
		if(bTotalProfit) {
			System.out.println("Total Profit: " + new String(ch, start, length));
			bTotalProfit=false;
		}
		
	}
}
