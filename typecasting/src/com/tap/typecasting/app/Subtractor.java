package com.tap.typecasting.app;

public class Subtractor {
	
	float res;
	
	void sub()
	{
	float num1 = 60.0f;
	int num2 = 20;
	res = num1-num2;
	
	System.out.println("res: "+res);

	}
	

	public static void main(String[] args) {
		
		Subtractor subt = new Subtractor();
		subt.sub();
		
		
	}

}
