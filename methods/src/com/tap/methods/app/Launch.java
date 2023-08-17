// 1.no parameter no return type

package com.tap.methods.app;

class Calculator
{ 
	int c;
	 void add()
	{
		int a = 10;
		int b = 20;
		c = a+b;
		System.out.println("addition value of c: "+c);
	}
}

public class Launch {

	public static void main(String[] args) {
		
		 Calculator cal = new Calculator();
		 cal.add();

	}

}
