package com.xworkz.rakshitha.app;

public class Corporator {
	
	public String name;
	public Building[] buildings;
	
	
	public Corporator(String name,Building[] buildings)
	{
		this.name = name;
		this.buildings = buildings;
	}
	
	public void printInfo()
	{
		System.out.println("name:"+name);
		
		for(int i=0;i<this.buildings.length;i++)
		{
			Building ref = this.buildings[i];
			ref.printInfo();
		}
	}
	

}
