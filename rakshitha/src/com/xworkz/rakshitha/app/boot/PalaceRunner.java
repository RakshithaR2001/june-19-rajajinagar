package com.xworkz.rakshitha.app.boot;

import com.xworkz.rakshitha.app.King;
import com.xworkz.rakshitha.app.Palace;

public class PalaceRunner {
	
	public static void main(String[] args) {
		
		
		System.out.println("invoking main in PalaceRunner");
		
		String location = "mysore";
		int yearOfConst = 1897;
		
		King king = new King("krishna raja wodeyar",1,2);
		King king1 = new King("chamaraja wodeyar",1,1);
		
		King[] kings = {king,king1};
		
		Palace palace = new Palace(location,yearOfConst,kings);
		palace.printInfo();
		
		
		
		
		
	}

}
