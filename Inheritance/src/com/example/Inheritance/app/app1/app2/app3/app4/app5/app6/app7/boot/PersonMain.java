package com.example.Inheritance.app.app1.app2.app3.app4.app5.app6.app7.boot;

import com.example.Inheritance.app.app1.app2.app3.app4.app5.Employee;
import com.example.Inheritance.app.app1.app2.app3.app4.app5.Person;
import com.example.Inheritance.app.app1.app2.app3.app4.app5.Player;
import com.example.Inheritance.app.app1.app2.app3.app4.app5.Student;

public class PersonMain {

	public static void main(String[] args) {
		
		Person person=new Person();
		person.personMethod();
		System.out.println("-------------------");
		
		Employee employee=new Employee();
		Person employee1=new Employee();
		employee.empMethod();
		employee.personMethod();
		System.out.println("-------------------");
		
		Player player=new Player();
		Person player1=new Player();
		player.playerMethod();
		player.personMethod();
		System.out.println("-------------------");
		
		Student student=new Student();
		Person studenet1=new Student();
		student.studentMethod();
		student.personMethod();

	}

}
