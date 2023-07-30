package com.xworkz.rakshitha.app;

public class Doctor {

	public String name = "shivraj";
	public double salary = 25000000d;
	public Nurse nurse  = new Nurse();
	
	
	public void treatment()
	{
		System.out.println("invoking treatment in Doctor");
		this.nurse.treatment();
	}
	public void operation()
	{
		System.out.println("invoking operation in Doctor");
	}
}
