package com.tap.typecasting.app;

public class Demo1 {
	
	public static void main(String[] args) {
		
	    short b = 127;
		 b++;
		 b++;
		System.out.println("b: "+b);
		System.out.println("------------------------");
		
		double a = 128;
		byte b1;
		b1 = (byte)a;              //explicit type casting
		System.out.println("b1: "+b1);
		
		double a1 = 256;
		byte b2;
		b2 = (byte)a1;              //explicit type casting
		System.out.println("b2: "+b2);
		

		double a2 = 259;
		byte b3;
		b3 = (byte)a2;              //explicit type casting
		System.out.println("b3: "+b3);
		
		System.out.println("------------------------------");
		
		
		int c =5;
		int d;
		d = ++c + ++c + c-- + c++ + --c;
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		
		System.out.println("-------------------------------");
		
		
		int m =10;
		int  n=10;
		
		int res = m++/(++n * n--)/--m;
		System.out.println("res: "+res);
		
		System.out.println("-------------------");
		
		int x = 001, y=010, z=100;
		
		int i = --x + y++ - z-- - --z + ++y - --x;
		
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		System.out.println("z: "+z);
		System.out.println("i: "+i);
		
		System.out.println("-------------------------");
		
		int ch = 'A';
		System.out.println(++ch);//66
		System.out.println(ch);//66
		System.out.println((char)ch);//B
		
		System.out.println("-----------------");
		
		int ch1 = 'a';
		System.out.println(ch1++);//97
		System.out.println(++ch1);//99
		System.out.println((char)ch1);//c
		System.out.println((char)ch1++);//c
		
		System.out.println("-------------------------");
		
		int d1 = 'A';
		int D = 'a';
	    System.out.println(d1++ + ++D);
	   
	   System.out.println("--------------------------");
	   
	   short x1 = 10;
	   x1 = (short)(x1 *5);
	   System.out.println("x1: "+x1);
	   
	   System.out.println("-----------------------");
	   
	   byte p=1;
	   byte q=1;
	   byte r = (byte)(p+q);
	   System.out.println("r: "+r);
	   
	   System.out.println("----------------------------");
	   
	   byte g=6;
	   g = (byte) (g+8);
	   System.out.println("g: "+g);
	   
	   System.out.println("----------------------------");
	   
	   float f = (1/4) * 10;
	   System.out.println("f: "+f);
	   
	   System.out.println("------------------------------");
	   
	   int i1 = 010;
	   int j2 = 07;
	   int j3 = 06;
	   int j4 = 05;
	   int j5 = 04;
	   int j6 = 03;
	   int j7 = 02;
	   int j8 = 01;
	   int j9 = 00;

       System.out.println("i1: "+i1);
	   System.out.println("j2: "+j2);
	   System.out.println("j3: "+j3);
	   System.out.println("j4: "+j4);
	   System.out.println("j5: "+j5);
	   System.out.println("j6: "+j6);
	   System.out.println("j7: "+j7);
	   System.out.println("j8: "+j8);
	   System.out.println("j9: "+j9);
	   
	   System.out.println("------------------------------");
	   
	   byte l = (byte) 128;
	   System.out.println("l: "+l);//error
	   
	   System.out.println("--------------------------------");
	   
	   byte l1 = (byte) 130;
	   System.out.println("l1: "+l1);
	   
	   System.out.println("-------------------------------");
	   
	   short l3 = 256;
	   byte b4 = (byte) l3;
	   System.out.println("l3: "+l3);
	   System.out.println("b4: "+b4);
	   
	   System.out.println("--------------------------------");
	   
	   byte b6;
	   int i2 = 258;
	   double d2 = 325.77;
	   
	   b6 = (byte) i2;
	   System.out.println("b6: "+b6);//2
	   
	   i2 = (int) d2;
	   System.out.println("i2: "+i2);//325
	   
	   System.out.println("------------------------");
	   
	   int t = 100;
	   t = t++;
	   System.out.println("t: "+t);//100
	   
	   System.out.println("-------------------------");
	   

	   int t1 = 100;
	     t1++;
	   System.out.println("t1: "+t1);//101
	   
	   System.out.println("---------------------------");
	   
	   int t2 = 100;
	   t2 = ++t2;
	   System.out.println("t2: "+t2);//101
	   
	   System.out.println("--------------------------");
	   
	   char o = '0';
	   int O = o;
	   System.out.println("o: "+o);//0
	   System.out.println("O: "+O);//48
	   
	   System.out.println("-----------------------------");
	   
	   int s1 = '0';
	   int s2 = '1';
	   int s3 = '2';
	   int s4 = '3';
	   int s5 = '4';
	   int s6 = '5';
	   int s7 = '6';
	   int s8 = '7';
	   int s9 = '8';
	   int s10 = '9';
	   
	   System.out.println("s1: "+s1);
	   System.out.println("s2: "+s2);
	   System.out.println("s3: "+s3);
	   System.out.println("s4: "+s4);
	   System.out.println("s5: "+s5);
	   System.out.println("s6: "+s6);
	   System.out.println("s7: "+s7);
	   System.out.println("s8: "+s8);
	   System.out.println("s9: "+s9);
	   System.out.println("s10: "+s10);
	   
	   System.out.println("----------------------");
	   
	   
	   int h1 = '0';
	   System.out.println("h1 as 0 value is : "+h1);
	   
	   int h = '9';
	   System.out.println("h as 9 value is : "+h);
	   
	   
	   
	}

}
