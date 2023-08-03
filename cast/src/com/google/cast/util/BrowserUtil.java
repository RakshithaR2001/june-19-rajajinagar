package com.google.cast.util;

import com.google.cast.app.app1.Browser;
import com.google.cast.app.app1.Chrome;
import com.google.cast.app.app1.FireFox;
import com.google.cast.app.app1.MicroSoftEdge;
import com.google.cast.app.app1.OPeraBrowser;

public class BrowserUtil  extends Browser
{
	
	public void run(Browser browser)
	{
		
		Browser browser1 = new Browser();
		browser1.getTypeOfBrowser();
		
		
        if(browser instanceof Chrome)
		{
			Browser chrome = new Chrome();
			chrome.getTypeOfBrowser();
			
			Chrome chrome2=(Chrome)chrome;//Converting (parent class)Browser of browser type to (sub class)Chrome
			chrome2.getCompanyName();
		}
        if(browser instanceof FireFox)
		{
			Browser fireFox=new FireFox();
			fireFox.getTypeOfBrowser();
			
			FireFox fireFox2=(FireFox)fireFox;
			fireFox2.getCompanyName();
		}
		
		if(browser instanceof OPeraBrowser)
		{
			Browser opera=new Browser();
			opera.getTypeOfBrowser();
			
			OPeraBrowser opera2=new OPeraBrowser();
			opera2.getCompanyName();
		}
		
		if(browser instanceof MicroSoftEdge)
		{
			Browser micro=new Browser();
			micro.getTypeOfBrowser();
			
			MicroSoftEdge micro2=new MicroSoftEdge();
			micro2.getCompanyName();
		}
		
			
	}
}
