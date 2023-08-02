package com.example.Inheritance.app.app1.app2.app3.app4;

public class FlipPhone extends Mobile{
	
	public String name="Nokia";
	
	public FlipPhone()
	{
		System.out.println("Calling default class of Fliphone Class");
	}
	
	public void flipPhoneMethod()
	{
		System.out.println("Name : "+name);
	}

}
