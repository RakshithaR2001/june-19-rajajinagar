package com.example.Inheritance.app.app1.app2.app3;

public class RecurringDeposit  extends  Bank{
	
	public double amount = 9876587;

	public RecurringDeposit()
	{
		System.out.println("Calling Constructor of RecurringDeposit Account Class");
	}
	
	public void recurAccMethod() 
	{
		System.out.println("Amount : "+amount);
	}

}
