package com.example.Inheritance.app.app1.app2;

public class Rectangle extends Shape{
	
	public String area;

	public Rectangle()
	{
		System.out.println("Calling default Constructer of Rectangle");
	}

	public double rectangleMethod(double h,double b)
	{
		return h*b;
	}

}
