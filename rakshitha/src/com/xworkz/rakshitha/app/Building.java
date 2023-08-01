package com.xworkz.rakshitha.app;

public class Building {

	
	public Floor[] floors;
	public Lift[] lifts;
	
	public Building(Floor[] floors,Lift[] lifts)
	{
		
		this.floors = floors;
		this.lifts = lifts;
	}
	
	public void printInfo()
	{
		for(int i=0;i<this.floors.length;i++)
		{
			Floor floor = this.floors[i];
			floor.printInfo();
		}
		for(int i=0;i<lifts.length;i++)
		{
			Lift lifts = this.lifts[i];
			lifts.printInfo();
		}
	}
	
}
