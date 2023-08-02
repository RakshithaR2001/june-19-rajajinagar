package com.example.Inheritance.app;

public class Cat extends Animal {
	
	public int noOfFingers = 4;
	
	public Cat()
	{
		System.out.println("Calling default Constructor of Cat Class");

	}
	public void catMethod()
	{
		System.out.println("Running in car method");
		System.out.println("no of fingers: " +noOfFingers);
	}

}
