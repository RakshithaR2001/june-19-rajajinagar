package com.example.Inheritance.app.app1.app2;

public class Oval extends Shape{

	
	public String type = "Close-Curved-Shape";

	public Oval() 
	{
		System.out.println("Calling default Constructer of OVAL");
	}

	public void ovalMethod()
	{
		System.out.println("Type : "+type);
	}
}
