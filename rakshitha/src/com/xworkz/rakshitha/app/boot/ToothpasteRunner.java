package com.xworkz.rakshitha.app.boot;

import com.xworkz.rakshitha.app.Company;
import com.xworkz.rakshitha.app.Ingredent;
import com.xworkz.rakshitha.app.Toothpaste;

public class ToothpasteRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking main in ToothpasteRunner ");
		
		String name = "colgate";
		String brand = "salt";
		
		Ingredent  item1 = new Ingredent("sugar", 2, 150);
		Ingredent  item2 = new Ingredent("jaggery", 4, 300);
		Ingredent  item3 = new Ingredent("oil", 4, 800);
		Ingredent  item4 = new Ingredent("fruits", 2, 300);
		Ingredent  item5 = new Ingredent("grocerys", 4, 500);
		
		Ingredent[] ingredents  = {item1,item2,item3,item4,item5};
		
		
		Toothpaste paste = new Toothpaste(name,brand,ingredents);
		Company company = paste.company;
		/*System.out.println("companyName: "+company.companyName);
		System.out.println("ceo: "+company.ceo);
		System.out.println("originCountry: "+company.originCountry);*/
		
		paste.printInfo();
		company.printInfo();

		
		
		

	}

}
