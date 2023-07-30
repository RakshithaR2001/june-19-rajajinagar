package com.xworkz.rakshitha.app;

public class Hotel {
	
	public String name = "taj";
	public int rating = 5;
	public Cook cook = new Cook();
	
	
	public void foodService()
	{
		System.out.println("invoking foodService in Hotel");
		this.cook.prepareFood();
	}
	
	public void eat()
	{
		System.out.println("invoking eat in hotel");
	}

}
