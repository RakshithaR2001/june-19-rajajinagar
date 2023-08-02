package com.example.Inheritance.app.app1.app2.app3.app4.app5;

public class Employee extends Person {
	
public double salary=300000;
	
	public Employee()
	{
		System.out.println("Calling Default Constructor");
	}
	
	public void empMethod()
	{
		System.out.println("Salary : "+salary);
	}

}
