package com.temp;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Main{
	
	public static void main(String[] args) {
		File inputFile = new File("export1.xml");
		try
		{
			
			SAXParserFactory factor = SAXParserFactory.newInstance();
			SAXParser saxParser = factor.newSAXParser();
			
			UserHandler handle = new UserHandler();
			saxParser.parse(inputFile, handle);
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
	}
}