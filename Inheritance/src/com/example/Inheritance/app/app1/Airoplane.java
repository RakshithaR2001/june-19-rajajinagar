package com.example.Inheritance.app.app1;

public class Airoplane extends Vehicle {
	
	public String brand = "Quatar Airways";
	
	public  Airoplane() 
	{
		System.out.println("Invoking Default Contructer of Vehicle Class");
	}
	public void airoplaneMethod()
	{
		System.out.println("Calling AirPlane method");
		System.out.println("Brand : " + brand);
	}

	
}
