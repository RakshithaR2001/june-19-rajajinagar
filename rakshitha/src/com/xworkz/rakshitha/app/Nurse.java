package com.xworkz.rakshitha.app;

public class Nurse {

	public String sisterName = "suma";
	public double salary = 40000;
	public Patient  patient = new Patient();
	
	public void treatment()
	{
		System.out.println("invoking treatment in nurse");
	}
	public void caring()
	{
		System.out.println("invoking caring in nurse");
	}
}
