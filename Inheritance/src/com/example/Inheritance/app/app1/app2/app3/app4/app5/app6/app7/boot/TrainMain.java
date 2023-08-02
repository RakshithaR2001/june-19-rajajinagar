package com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.app7.boot;

import com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.Metro;
import com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.Train;

public class TrainMain {
	
	public static void main(String[] args) {
		
		System.out.println("Calling Main Class");
		Train train=new Train();
		System.out.println("Train Name : "+train.trainMethod());
		System.out.println("------------------------");
		
		Metro metro=new Metro();
		Train train1=new Metro();
		System.out.println("Train Name : "+metro.trainMethod());
		System.out.println("Metro Line : "+metro.metroMethod());
		System.out.println("------------------------");
	}

}
