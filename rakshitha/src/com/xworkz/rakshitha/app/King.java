package com.xworkz.rakshitha.app;

public class King {
	
	public String name;
	public int noOfWifes;
	public int noOfchildren;

	
	public King(String name,int noOfWifes,int noOfChildren)
	{
		this.name = name;
		this.noOfchildren =noOfChildren;
		this.noOfWifes = noOfWifes;
	
	}
	
	public void printInfo()
	{
		System.out.println("invoking printInfo statement ");
		System.out.println("name: "+this.name);
		System.out.println("noOfWifes: "+this.noOfWifes);
		System.out.println("noOfChildren: "+this.noOfchildren);
		
			}
	
	

}
