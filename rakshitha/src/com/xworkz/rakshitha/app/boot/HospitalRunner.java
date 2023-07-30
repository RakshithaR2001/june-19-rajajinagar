package com.xworkz.rakshitha.app.boot;

import com.xworkz.rakshitha.app.Doctor;
import com.xworkz.rakshitha.app.Hospital;
import com.xworkz.rakshitha.app.Nurse;
import com.xworkz.rakshitha.app.Patient;

public class HospitalRunner {

	public static void main(String[] args) {

		System.out.println("invoking  main in HospitalRunner");
		
		Hospital hospital = new Hospital();
		
		System.out.println(hospital.hospitalName);
		System.out.println(hospital.location);
		
		hospital.healthCare();
		hospital.checkUp();
		
		Doctor doctor = hospital.doctor;
		doctor.operation();
		System.out.println("name:"+doctor.name);
		System.out.println("salary:"+doctor.salary);
		
	    Nurse nurse = doctor.nurse;
	    nurse.caring();
	    System.out.println("sisterName:"+nurse.sisterName);
	    System.out.println("salary:"+nurse.salary);
	    
	    Patient patient = nurse.patient;
	    patient.bedRest();
	    patient.recovery();
	    System.out.println("diseases:"+patient.disease);
	    System.out.println("checkUpBill:"+patient.checkUpBill);
	    
	}

}
