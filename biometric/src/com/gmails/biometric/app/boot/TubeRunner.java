package com.gmails.biometric.app.boot;

import com.gmails.biometric.app.Paste;
import com.gmails.biometric.app.Tube;

public class TubeRunner {
	
	public static void main(String[] args) {
		
		
		System.out.println("Running main in TubeRunner:");
		
		Tube tube = new Tube();
         int ref = tube.length;
         System.out.println(ref);
         Paste paste = tube.paste;
         String ref1 = paste.color;
         System.out.println(ref1);
         
         
	}

}
