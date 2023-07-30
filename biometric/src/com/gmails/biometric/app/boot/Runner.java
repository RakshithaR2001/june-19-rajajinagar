package com.gmails.biometric.app.boot;

import com.gmails.biometric.app.Store;

public class Runner {
	
	
	//private static String[] emails;

	public static void main(String[] args) {
		
		System.out.println("Running main in emails:");
		
		 String[] emails = {"haish@gmail.com","anu@gmail.com","tanu@gmail.com",
					"suma@gmail.com","suman@gmail.com"};
		
       Store store  = new Store();
       store.email(emails);
       
       System.out.println("================================");
       System.out.println("Running main in groceryItems:");
		
       String[] grocerys = {"apple","banana","strawberry","eggs","butter","milk"};
       
       Store store1 = new Store();
        store1.groceryItems(grocerys);
		
        System.out.println("===================================");
        System.out.println("Running main in iplTeams:");
        
        String[] teams = {"Royal-challenges-bangalore","Chennai-super-kings","Delhi Capitals","Gujarat Titans","Kolkata Knight Riders"};
        Store store2 = new Store();
        store2.iplTeams(teams);
		
	}

}
