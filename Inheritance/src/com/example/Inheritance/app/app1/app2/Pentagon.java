package com.example.Inheritance.app.app1.app2;

public class Pentagon extends Shape {
	
	public int noOfSides = 5;

	public Pentagon() {
		System.out.println("Calling default Constructer of Pentagon");
	}

	public void pentagonMethod() {
		System.out.println("sides : "+noOfSides);
	}

}
