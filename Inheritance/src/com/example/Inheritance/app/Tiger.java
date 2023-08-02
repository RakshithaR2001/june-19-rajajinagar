package com.example.Inheritance.app;

public class Tiger extends Animal {
	

	public String color = "brown";
	
	public Tiger()
	{
		System.out.println("Calling default Constructor of Cat Class");

	}
	public void tigerMethod()
	{
		System.out.println("Running in tiger method");
		System.out.println("color: " +color);
	}

}
