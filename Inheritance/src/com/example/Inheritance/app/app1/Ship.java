package com.example.Inheritance.app.app1;

public class Ship  extends Vehicle{
	
	public int capacityOfPeople = 20000;

	public Ship() 
	{
		System.out.println("Invoking Default Contructer of Ship Class");
	}

	public void shipMethod() 
	{
		System.out.println("Calling Ship method");
		System.out.println("Capacity to carry people : " + capacityOfPeople);
	}

}
