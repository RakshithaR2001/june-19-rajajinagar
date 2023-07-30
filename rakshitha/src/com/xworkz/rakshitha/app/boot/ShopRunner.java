package com.xworkz.rakshitha.app.boot;

import com.xworkz.rakshitha.app.SalesMan;
import com.xworkz.rakshitha.app.Shop;

public class ShopRunner {
	

 public static void main(String[] args) {
	 
	 System.out.println("invoking main in ShopRunner");
	 
	 Shop shop = new Shop();
	 System.out.println("shopKeaper:"+shop.shopKeaper);
	 System.out.println("noOfItems:"+shop.noOfItems);
	 SalesMan salesMan = shop.man;
	 System.out.println("name:"+salesMan.name);
	 System.out.println("salary:"+salesMan.salary);
	 shop.calling();
	 shop.feedBack();
	 
	 
}	
		

	}


