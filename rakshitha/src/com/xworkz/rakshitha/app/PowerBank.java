package com.xworkz.rakshitha.app;

public class PowerBank 
{
	
	public  int range = 3000;
	public  String brandName ="anker" ;
	public Battery battery = new Battery();
	
	public void controlPower()
	{
		System.out.println("invoking control power in powerbank");
		this.battery.store();
	}
	
	public void charge()
	{
		System.out.println("invoking charge in powerank");
	}

}
 








