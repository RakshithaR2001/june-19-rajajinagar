package com.tap.typecasting.app;

public class Demo4 {
	
	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		
		b = a++ + ++a + ++a - a++ - --a + --a + a++;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
