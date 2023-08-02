package com.example.Inheritance.app;

public class Bear extends Animal{
	
	public String type = "polar bear";
	
	public Bear()
	{
		System.out.println("Calling default Constructor of Bear Class");

	}
	public void bearMethod()
	{
		System.out.println("Running the bear method");
		System.out.println("type of bear: "+type);
	}

}
