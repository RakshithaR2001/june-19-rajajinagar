package com.tap.methods.app;

class Calender
{
	int c;
	int div(int a,int b)
	{
		c = a/b;
		return c;
	}
}
public class Launch4 {
	
	public static void main(String[] args) {
		
	Calender cale = new Calender();
	 int res = cale.div(20, 10);
	System.out.println("res: "+res);
	}

}
