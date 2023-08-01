package com.xworkz.rakshitha.app;

public class Company {
	
	public String companyName;
	public String ceo;
	public String originCountry;
	
	public Company(String companyName,String ceo,String originCountry)
	{
		this.companyName = companyName;
		this.ceo = ceo;
		this.originCountry = originCountry;
	}
	
	
	public void printInfo()
	{
		System.out.println("invoking printInfo statement");
		System.out.println("ceo:" +this.ceo);
		System.out.println("companyName:" +this.companyName);
		System.out.println("originCountry: "+this.originCountry);
		
		
	}

}
