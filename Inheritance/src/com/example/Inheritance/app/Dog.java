package com.example.Inheritance.app;

public class Dog  extends Animal{
	

	public int noOfLegs = 4;
	
	public Dog()
	{
		System.out.println("Calling default Constructor of Cat Class");

	}
	public void dogMethod()
	{
		System.out.println("Running in dog method");
		System.out.println("no of legs: " +noOfLegs);
	}

}
