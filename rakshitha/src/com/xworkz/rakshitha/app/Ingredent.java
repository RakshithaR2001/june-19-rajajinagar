package com.xworkz.rakshitha.app;

public class Ingredent {
	
	public String name;
	public int quantity;
	public double cost;
	
	public Ingredent(String name,int quantity,double cost)
	{
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
	}
	public void printInfo()
	{
		
		System.out.println("invoking the printInfo statements");
		System.out.println("name:"+this.name);
		System.out.println("quantity:"+this.quantity);
		System.out.println("cost:"+this.cost);
	 }
	
}



