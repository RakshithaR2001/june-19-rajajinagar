package com.example.Inheritance.app.app1.app2;

public class Circle extends Shape{
	
	public String area;

	public Circle() {
		System.out.println("Calling default Constructer of Circle");
	}

	public double circleMethod(double r) {
		return 3.14*r*r;
	}

}
