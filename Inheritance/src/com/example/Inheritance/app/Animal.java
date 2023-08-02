package com.example.Inheritance.app;

public class Animal {
	
     int noOfLegs = 2;
	
	public Animal()
	{
		System.out.println("Calling default Constructor of Animal Class");
	}
    public void animalMethod() 
    {
    	System.out.println("Running Parent Class");
    	System.out.println("No of Legs Animal have : "+noOfLegs);
    }

}
