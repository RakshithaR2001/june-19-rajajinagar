package com.example.Inheritance.app.app1.app2.app3.app4.app5.app6;

public class Metro extends Train{
	
public int noOFStops;
	
	public Metro()
	{
		this.noOFStops=15;
		System.out.println("No Of Stops : "+this.noOFStops);
	}
	
	public String metroMethod()
	{
		return "GreenLine";
	}	

}
