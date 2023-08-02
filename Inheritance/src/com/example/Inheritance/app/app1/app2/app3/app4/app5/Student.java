package com.example.Inheritance.app.app1.app2.app3.app4.app5;

public class Student extends Person {
	

	public boolean isStudying=true;
	
	public Student() {
		System.out.println("Calling Default Constructor");
	}
	
	public void studentMethod()
	{
		System.out.println("IS Studying : "+isStudying);
	}
			
			

}
