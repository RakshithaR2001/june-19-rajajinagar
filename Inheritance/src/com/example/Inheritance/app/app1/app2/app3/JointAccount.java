package com.example.Inheritance.app.app1.app2.app3;

public class JointAccount  extends Bank{
	
	public double amount = 34567;

	public JointAccount() 
	{
		System.out.println("Calling Constructor of Joint Account Class");
	}
	
	public void jointAccMethod() 
	{
		System.out.println("Amount : "+amount);
	}

}
