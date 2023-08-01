package com.xworkz.rakshitha.app.boot;

import com.xworkz.rakshitha.app.Person;

public class PersonRunner {

	public static void main(String[] args) {
		
		System.out.println("Running main in PersonRunner.");
		
		
		String name = "rakshitha";
		String[] values = {"rakshitha@gmail.com","rakshu@gmail.com"};
		
		Person person = new Person(name,values);
		person.printInfo();
		

	}

}
