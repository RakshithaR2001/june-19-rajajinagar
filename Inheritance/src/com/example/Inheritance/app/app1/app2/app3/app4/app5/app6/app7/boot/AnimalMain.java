package com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.app7.boot;

import com.example.Inheritance.app.Animal;
import com.example.Inheritance.app.Bear;
import com.example.Inheritance.app.Cat;
import com.example.Inheritance.app.Cheeta;
import com.example.Inheritance.app.Cow;
import com.example.Inheritance.app.Deer;
import com.example.Inheritance.app.Dog;
import com.example.Inheritance.app.Lion;
import com.example.Inheritance.app.Tiger;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.animalMethod();
		System.out.println("--------------------------");

		Animal dog2=new Dog();
		Dog dog=new Dog();
		dog.animalMethod();
		dog.dogMethod();
		
		System.out.println("--------------------------");
		Animal cat1=new Cat();
		Cat cat = new Cat();
		cat.animalMethod();
		cat.catMethod();
		
		System.out.println("--------------------------");
		Animal lion1=new Lion();
		Lion lion=new Lion();
		lion.animalMethod();
		lion.lionMethod();
		
		System.out.println("--------------------------");
		Animal tiger1=new Tiger();
		Tiger tiger = new Tiger();
		tiger.tigerMethod();
		tiger.animalMethod();
		
		System.out.println("--------------------------");
		Animal cow1=new Animal();
		Cow cow=new Cow();
		cow.animalMethod();
		cow.cowMethod();
		
		System.out.println("--------------------------");
		Animal cheeta1=new Cheeta();
		Cheeta cheeta=new Cheeta();
		cheeta.animalMethod();
		cheeta.cheetaMethod();
		
		System.out.println("--------------------------");
		Animal deer=new Deer();
		Deer deer1 = new Deer();
		deer1.animalMethod();
		deer1.deerMethod();
		
		System.out.println("--------------------------");
		Animal bear1=new Bear();
		Bear bear = new Bear();
		bear.bearMethod();
		bear.animalMethod();
		
	}

}
