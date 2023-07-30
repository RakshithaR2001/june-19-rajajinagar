package com.xworkz.rakshitha.app.boot;

import com.xworkz.rakshitha.app.Battery;
import com.xworkz.rakshitha.app.PowerBank;

public class PowerBankRunner {

	public static void main(String[] args) {

		
		System.out.println("invoking main in powerBankRunner");
		
		PowerBank powerBank = new PowerBank();
		System.out.println( "range:"+powerBank.range);
		System.out.println("brandName:"+powerBank.brandName);
		Battery battery = powerBank.battery;
		System.out.println("storage:"+battery.storage);
		System.out.println("type:"+battery.type);
		powerBank.controlPower();
        powerBank.charge();
		
	}

}
