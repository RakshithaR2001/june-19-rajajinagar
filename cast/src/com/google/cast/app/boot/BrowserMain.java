package com.google.cast.app.boot;

import com.google.cast.app.app1.Browser;
import com.google.cast.app.app1.Chrome;
import com.google.cast.app.app1.FireFox;
import com.google.cast.app.app1.MicroSoftEdge;
import com.google.cast.app.app1.OPeraBrowser;
import com.google.cast.util.BrowserUtil;

public class BrowserMain {
	
	public static void main(String[] args)
	{
		
    System.out.println("Running in main class:");
	
	
	Browser browser=new Browser();
	
	Chrome chrome=new Chrome();
	
	MicroSoftEdge edge=new MicroSoftEdge();
	
	FireFox fireFox=new FireFox();
	
	OPeraBrowser opera=new OPeraBrowser();
	
	BrowserUtil browserUtil=new BrowserUtil();
	
	System.out.println("Calling run method with Browser ref");
	browserUtil.run(browser);
	System.out.println("--------------------------------------");
	
	BrowserUtil browserUtil2=new BrowserUtil();
	System.out.println("Calling run method with Chrome ref");
	browserUtil2.run(chrome);
	System.out.println("--------------------------------------");
	
	BrowserUtil browserUtil3=new BrowserUtil();
	System.out.println("Calling run method with Microsoft ref");
	browserUtil3.run(edge);
	System.out.println("--------------------------------------");
	
	BrowserUtil browserUtil4=new BrowserUtil();
	System.out.println("Calling run method with FireFox ref");
	browserUtil4.run(fireFox);
	System.out.println("--------------------------------------");
	
	BrowserUtil browserUtil5=new BrowserUtil();
	System.out.println("Calling run method with FireFox ref");
	browserUtil5.run(opera);
	
  }

}
