package com.xworkz.rakshitha.app.boot;

import com.xworkz.rakshitha.app.Cook;
import com.xworkz.rakshitha.app.Hotel;

public class HotelRunner 
{

   public static void main(String[] args) 
	{

		System.out.println("invoking main in HotelRunner");
		
		Hotel hotel = new Hotel();
		System.out.println("name:"+hotel.name);
		System.out.println("ratings:"+hotel.rating);
		
		Cook cook = hotel.cook;
		System.out.println("name:"+cook.name);
		System.out.println("item:"+cook.item);
		
		hotel.foodService();
		hotel.eat();
		
		
		
		
	}

}
