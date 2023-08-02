package com.example.Inheritance.app;

public class Cheeta extends Animal{
	
	public double speed =190;
	
	public Cheeta()
	{
		System.out.println("Calling default Constructor of Animal Class");

	}
	
	public void cheetaMethod()
	{
		System.out.println("Running in cheeta method");
		System.out.println("speed per hour: " +speed);
	}

}
