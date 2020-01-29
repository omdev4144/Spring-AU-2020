package com.leaf;

import com.interfacebuild.BuildingConstructService;

public class Floor implements BuildingConstructService{
	private String type;
	private long Area;
	private String color;
	
	public Floor(String type, long area, String color) {
		super();
		this.type = type;
		Area = area;
		this.color = color;
	}
	
	@Override
	public void showBuilding()
	{
		System.out.println("The Floor needs to constructed of type "+type+" with Color"+color+"of Area"+Area+"");
	}
	
	
}
