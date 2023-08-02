package com.example.Inheritance.app.app1.app2.app3.app4.app5;

public class Player extends Person {
	
public String gameName="Cricket";
	
	public Player() 
	{
		System.out.println("Calling Default Constructor");
	}
	
	public void playerMethod()
	{
		System.out.println("gameMethod : "+gameName);
	}

}
