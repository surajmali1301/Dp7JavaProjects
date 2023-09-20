package com.ClassObject;
import java.util.*;
import com.AccessModifier.*;
public class Student {

	int stuId;
	String name;
	float marks1;//instance variables
	float marks2;
	float marks3;
	float per;
	char grade;

	void display() {
		System.out.println("Student Id: " + stuId + " " + "Name: " + name + " " + "Percentage " + per+" Grade: "+grade);
	}

	void calGrade() {
		if (per >= 90)
			grade = 'A';
		else if (per >= 75)
			grade = 'B';
		else if (per >= 50)
			grade = 'C';
		else if (per >= 40)
			grade = 'D';
	}

	void calPercentage() {
		per = ((marks1 + marks2 + marks3) / 300) * 100;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter the Id: ");
		s1.stuId=sc.nextInt();//object is physical entity , instance of class
		
		System.out.println("Enter the name: ");
		s1.name=sc.next();
		System.out.println("Enter the Marks 1: ");
		s1.marks1=sc.nextInt();
		System.out.println("Enter the Marks 2: ");
		s1.marks2=sc.nextInt();
		System.out.println("Enter the Marks 3: ");
		s1.marks3=sc.nextInt();
		
		s1.calGrade();
		s1.calPercentage();
		System.out.println("---------------------------------------");
		s1.display();
		
		
		/*
		 * Accessing modifiers from outside package*/
		
		AccessModifiers am = new AccessModifiers();
		
//		am.a=90;
//		am.b=80;------>Cannot Access Default and Private access modifiers outside Packeage
		am.c=56;
		
		
		
		
		
		
		//

	}
}
