package com.google.cast.util;

import com.google.cast.app.MobileShowroom;
import com.google.cast.app.Showroom;
import com.google.cast.app.WatchShowroom;

public class ShowroomUtil extends Showroom {
	
	public void run(Showroom room)
	{
		Showroom showRoom = new Showroom();
		showRoom.printLocation();
		
		if(room instanceof WatchShowroom)
		{
			Showroom watchRoom=new WatchShowroom();
			watchRoom.printLocation();
			
			WatchShowroom watchRoom2=(WatchShowroom)watchRoom;//casting
			watchRoom2.getNameOfShowroom();
			
		}
		if(room instanceof MobileShowroom)
		{
			
		   Showroom mobileRoom = new MobileShowroom();
		   mobileRoom.printLocation();
		   
		   MobileShowroom mobileRoom2 = (MobileShowroom)mobileRoom;
		   mobileRoom2.getGstNo();
			
		}
		
		
		
	}
	
	
	

}
