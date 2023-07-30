package com.xworkz.rakshitha.app.boot;

import com.xworkz.rakshitha.app.Garage;
import com.xworkz.rakshitha.app.Mechanic;

public class GarageRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking main in garageRunner:");
		
		Garage garage = new Garage();
		System.out.println(garage.name);
		System.out.println(garage.location);
		Mechanic mechanic =  garage.mechanic;
		System.out.println(mechanic.qualification);
		System.out.println(mechanic.experience);
		garage.service();
		garage.wash();
		
		
	}
}
