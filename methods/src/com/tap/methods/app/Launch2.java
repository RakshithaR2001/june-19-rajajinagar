// no parameter but return type

package com.tap.methods.app;

class Multiply
{
	float c;
	float mul()
	
	{   int a =10;
	    float b = 20;
		c =  a*b;
	
		return c;
	}
}
public class Launch2 {
	
	public static void main(String[] args) {
		
		Multiply multy = new Multiply();
		 float res = multy.mul();
		 System.out.println("res: "+res);
		}

}
