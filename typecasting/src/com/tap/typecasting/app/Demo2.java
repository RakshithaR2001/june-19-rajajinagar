package com.tap.typecasting.app;

import java.util.Scanner;

public class Demo2 {
	
	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		 int a = scn.nextInt();
		 float b = scn.nextFloat();
		 int c = scn.nextInt();
		 int d  = scn.nextInt();
		 
		 float res =  a+b;
		 float res1 =  b-c;
		 float res2 = c*d;
		 float res3 = a/d;
		 
		  System.out.println("res: "+res);
		  System.out.println("res1: "+res1);
		  System.out.println("res2: "+res2);
		  System.out.println("res3: "+res3);
		
	}

}
