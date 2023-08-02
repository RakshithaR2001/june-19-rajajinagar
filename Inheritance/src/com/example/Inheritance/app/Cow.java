package com.example.Inheritance.app;

public class Cow extends Animal {
	
	public double milInLiters = 3;
	
	public Cow()
	{
		System.out.println("Calling default Constructor of Animal Class");

	}
	public void cowMethod()
	{
		System.out.println("Running in cow method");
		System.out.println("milk in liters:"+milInLiters);
	}

}
