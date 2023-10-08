package com.ArrayContainment;
import java.util.*;
public class StudentGetterSetter {

	static Scanner sc = new Scanner(System.in);
	
	static void enterDetails() {
		
		Student s = new Student();
		
		System.out.println("Enter the student id: ");
		s.setId(sc.nextInt());
		
		System.out.println("Enter the student Name: ");
		s.setName(sc.next());		
		
		System.out.println("Enter Course Id: ");
		s.getC().setId(sc.nextInt());
		
		System.out.println("Enter Course Name: ");
		s.getC().setName(sc.next());
		
		System.out.println("Enter Course Id: ");
		s.getC().setFees(sc.nextFloat());
	}
	
	static void printDetails(Student s[]) {
		
		for (Student stud : s) {
			System.out.println(stud);
		}
	}
	public static void main(String[] args) {

		enterDetails();
		

	}

}
