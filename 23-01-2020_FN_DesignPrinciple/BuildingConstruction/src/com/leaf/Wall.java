package com.leaf;

import com.interfacebuild.BuildingConstructService;

public class Wall implements BuildingConstructService{
	private String type;
	private long Area;
	private String color;
	
	public Wall(String type, long area, String color) {
		super();
		this.type = type;
		Area = area;
		this.color = color;
	}
	
	@Override
	public void showBuilding()
	{
		System.out.println("The type of wall is "+type+" with Color "+color+" of Area "+Area+"");
	}
}
