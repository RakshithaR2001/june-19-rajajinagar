package com.tap.patterns.app;

public class Stars14 {

	
	public static void main(String[] args) {
		
		int count=1;
		
		for(int i=1;i<=4;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(count );
				count++;
			}
			System.out.println();
		}
	}
}
