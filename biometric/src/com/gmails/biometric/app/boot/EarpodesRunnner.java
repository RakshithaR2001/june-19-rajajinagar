package com.gmails.biometric.app.boot;

import com.gmails.biometric.app.Battery;
import com.gmails.biometric.app.Earpodes;
import com.gmails.biometric.app.Speaker;

public class EarpodesRunnner {

	public static void main(String[] args) {
		
		System.out.println("Running main in EarpodesRunner:");
		
		Earpodes podes = new Earpodes();
		String  earpodes =podes.brand;
		System.out.println(earpodes);
		Speaker speaker = podes.speaker;
		double speakers  =  speaker.frequency;
		System.out.println(speakers);
		Battery battery = speaker.battery;
		String ref =battery.color;
		System.out.println(ref);
		
 
		
		
				
		
		
		
		



	}

}
