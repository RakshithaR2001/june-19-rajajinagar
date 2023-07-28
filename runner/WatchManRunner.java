package com.google.system.app.boot;

import com.google.system.app.WatchMan;

public class WatchManRunner {
	
	public static void main(String[] args) {
		
		System.out.println("running main in WatchManrunner:");
		
		
		WatchMan watchMan = new WatchMan();
		watchMan.secure();
		
	}

}
