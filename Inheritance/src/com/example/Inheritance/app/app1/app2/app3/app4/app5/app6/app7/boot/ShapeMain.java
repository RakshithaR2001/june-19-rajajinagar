package com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.app7.boot;

import com.example.Inheritance.app.app1.app2.Circle;
import com.example.Inheritance.app.app1.app2.Oval;
import com.example.Inheritance.app.app1.app2.Pentagon;
import com.example.Inheritance.app.app1.app2.Rectangle;
import com.example.Inheritance.app.app1.app2.Rhombus;
import com.example.Inheritance.app.app1.app2.Shape;
import com.example.Inheritance.app.app1.app2.Square;

public class ShapeMain {
	
	public static void main(String[] args) {
		
		Shape shape =new Shape();
		shape.shapeMethod();
		System.out.println("----------------------");
		
		Circle circle=new Circle();
		Shape circle1 =new Circle();
		System.out.println(circle.circleMethod(6));
		circle.shapeMethod();
		System.out.println("----------------------");
		
		Rectangle rectangle=new Rectangle();
		Shape rectangle1 =new Rectangle();
		rectangle.shapeMethod();
		System.out.println(rectangle.rectangleMethod(5, 6));
		System.out.println("----------------------");
		
		Square square=new Square();
		Shape square1 =new Shape();
		square.shapeMethod();
		System.out.println(square.squareMethod(5));
		System.out.println("----------------------");
		
		Pentagon pentagon=new Pentagon();
		Shape pentagon1 =new Pentagon();
		pentagon.shapeMethod();
		pentagon.pentagonMethod();
		System.out.println("----------------------");
		
		Oval oval=new Oval();
		Shape oval2 =new Oval();
		oval.ovalMethod();
		oval.shapeMethod();
		System.out.println("----------------------");
		
		Rhombus rhombus=new Rhombus();
		Shape rombus2 =new Rhombus();
		rhombus.rhombusMethod();
		rhombus.shapeMethod();
	}

}
