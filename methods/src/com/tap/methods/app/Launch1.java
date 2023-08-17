//parameter / no return type

package com.tap.methods.app;

class Subtractor
{
	int c;
	void sub(int a,int b)
	{
		c = a+b;
		System.out.println("  subtractor value of c: "+c);
		
	}
}
public class Launch1 {
	
	public static void main(String[] args) {
		
		 Subtractor subt = new  Subtractor();
		 subt.sub(10, 20);
		
		
	}

}
