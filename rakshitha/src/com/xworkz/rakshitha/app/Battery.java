package com.xworkz.rakshitha.app;

public class Battery {
	
	public int storage = 100;
	public String type = "nickel";

	
	public void store()
	{
		System.out.println("invoking store in battery ");
	}
	public void charging()
	{
		System.out.println("invoking  charging in battery");
	}
	
}
