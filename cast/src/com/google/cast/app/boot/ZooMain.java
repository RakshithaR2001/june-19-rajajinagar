package com.google.cast.app.boot;

import com.google.cast.app.app1.app2.app3.NationalZoo;
import com.google.cast.app.app1.app2.app3.StateZoo;
import com.google.cast.app.app1.app2.app3.Zoo;
import com.google.cast.util.ZooUtil;

public class ZooMain {
	
	public static void main(String[] args)
	{
		
		Zoo zoo=new Zoo();
		
		StateZoo stateZoo=new StateZoo();
		
		NationalZoo nationalZoo=new NationalZoo();
		
		ZooUtil util=new ZooUtil();
		System.out.println("Calling run method with zoo ref");
		util.run(zoo);
		System.out.println("---------------------------------");
		
		ZooUtil util2=new ZooUtil();
		System.out.println("Calling run method with State zoo ref");
		util2.run(stateZoo);
		System.out.println("---------------------------------");
		
		ZooUtil util3=new ZooUtil();
		System.out.println("Calling run method with National zoo ref");
		util3.run(nationalZoo);
		System.out.println("---------------------------------");

	}

}
