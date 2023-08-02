package com.example.Inheritance.app;

public class Lion extends Animal {
	

	public int weight = 2;
	
	public Lion()
	{
		System.out.println("Calling default Constructor of Cat Class");

	}
	public void lionMethod()
	{
		System.out.println("Running in lion method");
		System.out.println("weight:" +weight);
	}

}
