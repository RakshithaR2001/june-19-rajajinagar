package com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.app7.boot;

import com.example.Inheritance.app.app1.app2.app3.app4.Android;
import com.example.Inheritance.app.app1.app2.app3.app4.FlipPhone;
import com.example.Inheritance.app.app1.app2.app3.app4.Mobile;
import com.example.Inheritance.app.app1.app2.app3.app4.SliderPhone;
import com.example.Inheritance.app.app1.app2.app3.app4.SmartPhone;

public class MobileMain {

	public static void main(String[] args) {
	
		Mobile mobile = new Mobile();
		mobile.mobileMethod();
		System.out.println("-------------------");

		SmartPhone smart = new SmartPhone();
		Mobile smart1 = new SmartPhone();
		smart.smartMetod();
		smart.mobileMethod();
		System.out.println("-------------------");

		Android android = new Android();
		Mobile android2 = new Android();
		android.androidMetod();
		android.mobileMethod();
		System.out.println("-------------------");

		FlipPhone flip = new FlipPhone();
		Mobile flip1 = new FlipPhone();
		flip.mobileMethod();
		flip.flipPhoneMethod();
		System.out.println("-------------------");

		SliderPhone phone = new SliderPhone();
		Mobile phone2 = new SliderPhone();
		phone.mobileMethod();
		phone.sliderPhoneMetod();
		System.out.println("-------------------");


	}

}
