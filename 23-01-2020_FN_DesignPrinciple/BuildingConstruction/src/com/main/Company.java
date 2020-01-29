package com.main;

import com.leaf.Floor;
import com.leaf.Room;
import com.leaf.Wall;

public class Company {
	public static void main(String[] args) {
		Wall wall1 = new Wall("Furnished",500,"Purple");
		Wall wall2 = new Wall("Normal",1000,"White");
		Room roomWall = new Room();
		roomWall.addBuilding(wall1);
		roomWall.addBuilding(wall2);
		
		Floor floor1 = new Floor("Granito",10000,"Italian");
		Floor floor2 = new Floor("Marble",5000,"Porcean");
		Room roomFloor = new Room();
		roomFloor.addBuilding(floor1);
		roomFloor.addBuilding(floor2);
		
		Room completeRoom = new Room();
		completeRoom.addBuilding(roomFloor);
		completeRoom.addBuilding(roomWall);
		completeRoom.showBuilding();
	}
}
