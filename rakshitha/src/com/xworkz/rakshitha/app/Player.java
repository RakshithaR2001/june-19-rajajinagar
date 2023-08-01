package com.xworkz.rakshitha.app;

public class Player {

	public Building building;
	public String name;
	public int  exp;
	public HomeTown town;
	
	public Player(Building building,String name,int exp,HomeTown town)
	{
		this.building = building;
		this.name = name;
		this.exp = exp;
		this.town = town;
	}
	
	public void printInfo()
	{
		System.out.println("building"+this.building);
		System.out.println("name:"+this.name);
		System.out.println("exp:"+this.exp);
		System.out.println("town:"+this.town);
	}
}
