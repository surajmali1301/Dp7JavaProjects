package com.LabSession_Polymorphism;
import java.util.*;

class Person{
	
	int activity(int calSal) {
		 int annumSal = calSal*12;
//		System.out.println("Person Annually salary is: "+annumSal);
		return annumSal;
	}
	String activity(String name,String role){
		System.out.println("Name of person is "+name);
		System.out.println("Role person playing is "+role);
		return name;
		
	}
	void activity(String game) {
		System.out.println("Person is playing "+game);
	}
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Salary to calculate annually salary: ");
		int sal = sc.nextInt();
		
		Person Salary = new Person();
		Salary.activity(sal);
		
		System.out.println("Enter the Person Name: ");
		String name = sc.next();
		System.out.println("Enter the Role ");
		String role = sc.next();
		Person nameRole = new Person();
		nameRole.activity(name, role);
//		
		System.out.println("Enter the game is playing: ");
		String game = sc.next();
		
		Person game1 = new Person();
		game1.activity(game);
		
	}

}
