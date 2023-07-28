package com.google.system.app.boot;

import com.google.system.app.Auditor;
import com.google.system.app.Company;
import com.google.system.app.Movie;
import com.google.system.app.Producer;

public class MovieRunner {



	public static void main(String[] args) {
		
		
		System.out.println("Running main in MovieRunner:");
		
		 Movie movie = new Movie();
		 String name = movie.name;
		 System.out.println("name:"+name);
		 String lang = movie.lang;
		 System.out.println("lang:"+lang);
		 Producer producer = movie.producer;
		 int budget = producer.budget;
		 System.out.println("budget:"+budget);
		 double mobileNo = producer.mobileNo;
		 System.out.println("mobileNo:"+mobileNo);
		 Auditor auditor = producer.auditor;
		 long adharNo = auditor.adharNo;
		 System.out.println("adharNo:"+adharNo);
		 Company company = auditor.company;
		 String companyName=  company.name;
		 System.out.println("companyname:"+companyName);
		 String location= company.location;
		 System.out.println("location:"+location);
	
	    
		

	}

}
