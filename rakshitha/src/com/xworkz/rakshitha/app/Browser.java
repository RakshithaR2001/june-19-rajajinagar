package com.xworkz.rakshitha.app;

public class Browser {

	public String name ="google";
	public  String address = "web";
	public Internet internet = new Internet();
	
	public void search()
	{
		System.out.println("invoking search in browser");
		this.internet.search();
	}
	public void retrieve()
	{
	   System.out.println("invoking retrieve in browser");
	}
	
	
}
