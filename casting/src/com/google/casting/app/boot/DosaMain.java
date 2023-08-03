package com.google.casting.app.boot;

import com.google.casting.app.ButterDosa;
import com.google.casting.app.Dosa;
import com.google.casting.app.SetDosa;

public class DosaMain {
	
	public static void main(String[] args) {
		
		System.out.println("invoking main in dosamain:-");
		
		Dosa dosa = new Dosa();
		System.out.println(dosa.hotelName);
		System.out.println(dosa.price);
		dosa.taste();
		
		Dosa dosa1 = new ButterDosa();
		
		ButterDosa dosa2 = new ButterDosa();
		

	
		
		
		
	}

}
