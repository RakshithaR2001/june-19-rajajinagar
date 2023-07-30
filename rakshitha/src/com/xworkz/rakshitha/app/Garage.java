package com.xworkz.rakshitha.app;

public class Garage {
	
	public String name = "ganesha garage";
	public String location = "dvg";
	public Mechanic mechanic = new Mechanic();
	
	public void service()
	{
		System.out.println("invoking service in garage");
		
		this.mechanic.repair();
		
	}
	public void wash()
	{
		System.out.println("invoking  wash in garage");
	}
	
	

}
