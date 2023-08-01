package com.xworkz.rakshitha.app;

public class Palace {
	
	public String location;
	public int yearOfConst;
	public King[] kings;
	
	
	public Palace(String location,int yearOfConst,King[] kings)
	{
		this.kings = kings;
		this.location = location;
		this.yearOfConst = yearOfConst;
	} 
	
	public void printInfo()
	{
		System.out.println("invoking the printInfo statements");
		System.out.println("location:"+this.location);
		System.out.println("yearOfConst:"+this.yearOfConst);
		
		for(int i=0;i<this.kings.length;i++)
		{
			King ref = this.kings[i];
		    ref.printInfo();
		}
	}

}
