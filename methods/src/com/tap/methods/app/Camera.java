package com.tap.methods.app;

class Company
{
	double c;
	int h;
	int a = 'A';
	char name;
	boolean married  = false;
	
	boolean cost(double a,double b)
	{
		c = a+b;
		return true;
	}
	int price(float d,float e,float f)
	{
		h = (int) (d+e+f);
		return h;
	}
	 
}
public class Camera {
	
        public static void main(String[] args) {
			
        Company comp = new Company();
        
       boolean res = comp.cost(5677.97, 45677.90);
       System.out.println("res: "+res);
       System.out.println( "A:" +comp.a);
       System.out.println("married: "+ comp.married);
       
       Company comp1 = new Company();
       int res1 =  comp1.price(20.6f, 40.8f, 27.8f);
       System.out.println("res1: "+res1);
       
      
		}

}
