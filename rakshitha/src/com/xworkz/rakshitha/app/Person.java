package com.xworkz.rakshitha.app;

public class Person {
	
	
	public String name;
	public String[] emails;
	
	public Person(String name,String[] emails)
	{
	   	this.name = name;
	   	this.emails = emails;
	}
	
	public void printInfo()
	{
		System.out.println("invoking printInfo of person");
		System.out.println(this.name);
		
		for(int index = 0;index<this.emails.length;index++)
		{
			String email = this.emails[index]; 
			System.out.println(" emails at index "+index+ " is " +email);
		}
	}

}
