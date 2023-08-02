package com.example.Inheritance.app.app1.app2.app3;

public class SavingsAccount extends Bank{
	
	public double amount = 4567456;

	public SavingsAccount() 
	{
		System.out.println("Calling Constructor of Saving Account Class");
	}
	
	public void savingsAccMethod()
	{
		System.out.println("Amount : "+amount);
	}

}
