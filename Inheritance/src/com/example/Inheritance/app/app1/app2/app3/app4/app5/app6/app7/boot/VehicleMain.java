package com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.app7.boot;

import com.example.Inheritance.app.app1.Airoplane;
import com.example.Inheritance.app.app1.Auto;
import com.example.Inheritance.app.app1.Bicycle;
import com.example.Inheritance.app.app1.Bike;
import com.example.Inheritance.app.app1.Car;
import com.example.Inheritance.app.app1.Scooty;
import com.example.Inheritance.app.app1.Ship;
import com.example.Inheritance.app.app1.Vehicle;

public class VehicleMain {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.vehicleMethod();
		System.out.println("----------------------");

		Car car = new Car();
		Vehicle vehicle1 = new Car();
		car.vehicleMethod();
		car.carMethod();
		System.out.println("----------------------");

		Bike bike = new Bike();
		Vehicle vehicle2 = new Bike();
		bike.vehicleMethod();
		bike.bikeMethod();
		System.out.println("----------------------");

		Bicycle bicycle = new Bicycle();
		Vehicle vehicle3 = new Bicycle();
		bicycle.vehicleMethod();
		bicycle.bicycleMethod();
		System.out.println("----------------------");

		Airoplane airplane = new Airoplane();
		Vehicle vehicle4 = new Airoplane();
		airplane.vehicleMethod();
		airplane.airoplaneMethod();
		System.out.println("----------------------");

		Ship ship = new Ship();
		Vehicle vehicle5 = new Ship();
		ship.vehicleMethod();
		ship.vehicleMethod();
		System.out.println("----------------------");

		Scooty scooty = new Scooty();
		Vehicle vehicle6 = new Scooty();
		scooty.vehicleMethod();
		scooty.scootyMethod();
		System.out.println("----------------------");

		Auto auto = new Auto();
		Vehicle vehicle7 = new Auto();
		auto.autoMethod();
		auto.vehicleMethod();
		
		
	}

}
