package com.tap.academy.app;

public class Loop {
	
	public static void main(String[] args) {
		
		int x=001;
		int y=010;
		int z=100;
		

		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
		
		System.out.println("===========================");
		
		int i= --x + y++ - z-- - --z + ++y - --x;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
		System.out.println("i: "+i);
	}

}
