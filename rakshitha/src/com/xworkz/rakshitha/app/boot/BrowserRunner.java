package com.xworkz.rakshitha.app.boot;

import com.xworkz.rakshitha.app.Browser;
import com.xworkz.rakshitha.app.Internet;

public class BrowserRunner {
	
	public static void main(String[] args) {
		
		System.out.println("running main in BrowserRunner");
		
		Browser browser = new Browser();
		browser.retrieve();
		System.out.println("name:"+browser.name);
		System.out.println("address:"+browser.address);
		
		
		Internet internet = browser.internet;
		System.out.println("internetName:"+internet.internetName);
		System.out.println("speed:"+internet.speed);
		internet.search();
		internet.connect();
	
		
		
		
	}

}
