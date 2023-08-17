package com.tap.typecasting.app;

public class Calculator {
	
	
	int c; //instane variable
	void add() //method
	{
		int a =10;   // local variable
		int b = 20;
	     c = a+b;
	     
	     System.out.println("c:"+c);
		
	}
	
	public static void main(String[] args) 
	{
		
		 Calculator cal  = new Calculator(); //create the object
		 cal.add(); //calling the method add.
	}

}
