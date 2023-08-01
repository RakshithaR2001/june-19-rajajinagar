package com.xworkz.rakshitha.app.boot;

import com.xworkz.rakshitha.app.Area;
import com.xworkz.rakshitha.app.Building;
import com.xworkz.rakshitha.app.Corporator;
import com.xworkz.rakshitha.app.Floor;
import com.xworkz.rakshitha.app.HomeTown;
import com.xworkz.rakshitha.app.Lift;
import com.xworkz.rakshitha.app.Player;
import com.xworkz.rakshitha.app.Sport;
 
public class SportRunner {

	public static void main(String[] args) 
	{
		
		System.out.println("running main in SportRunner");
		
		String name = "Cricket";
		
		Lift lift = new Lift(1);
		Lift lift1 = new Lift(2);
		Lift lift2 = new Lift(3);
		Lift lift3 = new Lift(4);
		Lift lift4 = new Lift(5);
		
		Lift[] lifts = {lift,lift1};
		
		Floor floor = new Floor(" first floor",1);
		Floor floor1 = new Floor("second floor",2);
		Floor floor2 = new Floor("second floor",3);
		Floor floor3 = new Floor("second floor",4);
		Floor floor4 = new Floor("second floor",5);
		
		Floor[] floors = {floor,floor1,floor2,floor3,floor4};
		
		Building building = new Building(floors,lifts);
		Building building1 = new Building(floors, lifts);
		
		Building[]  buildings =  {building,building1};
		
		Corporator corporator = new Corporator("shree",buildings);
		Corporator corporator1 = new Corporator("tejas",buildings);
		Corporator corporator2 = new Corporator("suhas",buildings);
		
		Area area = new Area("dvg",corporator);
		Area area1 = new Area("hasan",corporator1);
		Area area2 = new Area("malleshwaram",corporator1);
		Area area3 = new Area("jaynagar",corporator2);
		Area area4 = new Area("btm layout",corporator1);
		
		Area[] areas = {area,area1};
		
        HomeTown town=new HomeTown("Bangalore",678976,areas);
		                   
		Player player= new Player( building,"janavi",3,town);
		Player player1= new Player(building1,"sanvi",4,town);
		
		Player[] players= {player,player1};
		
		Sport sport=new Sport(name,players);
		sport.printInfo();
		building.printInfo();
		corporator.printInfo();
		area.printInfo();
		
	
	
	
		
	}

}
