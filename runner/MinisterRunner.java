package com.google.system.app.boot;

import com.google.system.app.Constituency;
import com.google.system.app.IndiraCanteen;
import com.google.system.app.Minister;


public class MinisterRunner {

	public static void main(String[] args) {

		
		System.out.println("Running main in MinisterRunner:");
		
		Minister minister = new Minister();
		String ref = minister.name;
		System.out.println("name:"+ref);
		int ref1 = minister.exp;
		System.out.println("exp:"+ref1);
	    Constituency constituency =	minister.Constituency;
	    int ref2 = constituency.number;
	    System.out.println("number:"+ref2);
	    double ref3  = constituency.population;
	    System.out.println("population:"+ref3);
	    IndiraCanteen indiraCanteen = constituency.indiracanteen;
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	     
	    
	    
	    
		
		
	}

}
