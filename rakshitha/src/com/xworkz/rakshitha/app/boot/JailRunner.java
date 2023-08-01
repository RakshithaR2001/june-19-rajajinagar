package com.xworkz.rakshitha.app.boot;

import com.xworkz.rakshitha.app.Jail;

public class JailRunner {
	
	public static void main(String[] args) {
		
		System.out.println("invoking main in jailRunner");
		
		String name = "Harappana agrahara";
		
		
		String[] names = {"raghav","vaishnav","srujan","suman"};
		int[] lockups = {100,200,275,683};
		
		
		Jail jail = new Jail(name,names,lockups);
		jail.printInfo();
	}

}
