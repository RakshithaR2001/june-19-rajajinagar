package com.example.Inheritance.app.app1.app2;

public class Rhombus extends Shape {

	
	public int noOfDiagonlasDraw;

	public Rhombus() {
		System.out.println("Calling default Constructer of Rhombus");
	}

	public void rhombusMethod() {
		System.out.println("noOfDiogonals Can be Draw : "+noOfDiagonlasDraw);
	}
}
