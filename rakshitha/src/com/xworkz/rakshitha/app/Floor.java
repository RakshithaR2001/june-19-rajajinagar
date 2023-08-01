package com.xworkz.rakshitha.app;

public class Floor {
	
	public String name;
	public int number;
	
	public Floor(String name,int number)
	{
		this.name = name;
		this.number = number;
	}
	
	public void printInfo()
	{
		System.out.println("name:"+this.name);
		System.out.println("number:"+this.number);
	}

}
