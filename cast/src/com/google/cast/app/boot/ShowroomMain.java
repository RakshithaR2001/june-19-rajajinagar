package com.google.cast.app.boot;

import com.google.cast.app.MobileShowroom;
import com.google.cast.app.Showroom;
import com.google.cast.app.WatchShowroom;
import com.google.cast.util.ShowroomUtil;

public class ShowroomMain {

	public static void main(String[] args) {
      
		
		Showroom room = new Showroom();
		
		WatchShowroom room1 = new WatchShowroom();
		
		MobileShowroom room2 = new MobileShowroom();
		
		ShowroomUtil roomUtil = new ShowroomUtil();
		
		System.out.println("Calling run method with showroom ref");
		roomUtil.run(room);
		
		System.out.println("------------------------");
		
		System.out.println("Calling the run method with MobileShowroom");
		roomUtil.run(room2);
		
		System.out.println("------------------------");
		
		System.out.println("Calling the run method with WatchShowroom");
		roomUtil.run(room1);
		
	}

}
