package com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.app7.boot;

import com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.app7.Cherry;
import com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.app7.Fruit;
import com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.app7.Kiwi;

public class FruitMain {
	
	public static void main(String[] args) {
		
		Fruit fruit=new Fruit();
		fruit.name="Mango";
		System.out.println("Fruit Name : "+fruit.name);
		System.out.println("Quantity : "+fruit.fruitMethod(10));
		System.out.println("-------------------------");
		
		Cherry cherry=new Cherry();
		Fruit cherry1=new Cherry();
		System.out.println("Scientific Name of Cherry : "+cherry.scificName);
		System.out.println("Quantity : "+cherry.fruitMethod(20));
		System.out.println("-------------------------");
		
		Kiwi kiwi=new Kiwi();
		Fruit kiwi2=new Kiwi();
		System.out.println("Scientific Name of kiwi : "+kiwi.scificName);
		System.out.println("Quantity : "+kiwi.fruitMethod(30));
		System.out.println("-------------------------");
	}

}
