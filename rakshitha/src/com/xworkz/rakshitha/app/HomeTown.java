package com.xworkz.rakshitha.app;

public class HomeTown {

	public String name;
	public int pinCode;
	public Area[] areas;
	
	public HomeTown(String name,int pinCode,Area[] areas)
	{
		this.name = name;
		this.pinCode = pinCode;
		this.areas = areas;
		
	}
	
	public void printInfo()
	{
		System.out.println("name:"+this.name);
		System.out.println("pinCode:"+this.pinCode);
		
		for(int i=0;i<this.areas.length;i++)
		{
			Area ref = this.areas[i];
			ref.printInfo();
			
		}
		
	}
	
	
}
