package com.leaf;

import java.util.ArrayList;
import java.util.List;

import com.interfacebuild.BuildingConstructService;

public class Room implements BuildingConstructService{
	private List<BuildingConstructService> ListOfBuilding = new ArrayList<BuildingConstructService>();
	
	@Override
	public void showBuilding()
	{
		for(BuildingConstructService BuilConstruct: ListOfBuilding)
		{
			BuilConstruct.showBuilding();
		}
	}
	
	public void addBuilding(BuildingConstructService build)
	{
		ListOfBuilding.add(build);
	}
	
	public void removeBuilding(BuildingConstructService buildrem)
	{
		ListOfBuilding.remove(buildrem);
	}
}
