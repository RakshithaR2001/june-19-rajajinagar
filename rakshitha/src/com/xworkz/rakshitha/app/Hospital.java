package com.xworkz.rakshitha.app;

public class Hospital {
	
	
	public String hospitalName = "shankar eye hospital";
	public String location = "shivamogga";
	public Doctor doctor = new Doctor();
	
	
	public void healthCare()
	{
		System.out.println("invoking healthCare in hospital");
		this.doctor.treatment();
		
	}
	
	public void checkUp()
	{
		System.out.println("invoking checkUp in hospital");
	}

}
