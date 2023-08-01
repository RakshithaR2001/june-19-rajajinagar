package com.xworkz.rakshitha.app;

public class Jail {
	
	public String name;
	public String[] criminalNames;
	public int[] noOfLockUp;
	
	public Jail(String name,String[] criminalNames,int[] noOfLockUp)
	{
		this.name = name;
		this.criminalNames = criminalNames;
		this.noOfLockUp = noOfLockUp;
	}
	
	public void printInfo()
	{
		System.out.println("invoking the printInfo statements");
		System.out.println("name: "+this.name);
        
		for(int i=0;i<this.criminalNames.length;i++)
		{
			String ref = this.criminalNames[i];
			System.out.println("criminalNames:"+ref);
		}
		for(int i=0;i<this.noOfLockUp.length;i++)
		{
			int ref1 = this.noOfLockUp[i];
			System.out.println("noOfLockUp:"+ref1);
		}
	}

}
