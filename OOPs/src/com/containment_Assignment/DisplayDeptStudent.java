package com.containment_Assignment;

public class DisplayDeptStudent {

	public static void main(String[] args) {

		Department d1 = new Department(211,"Computer Science");
		Department d2 = new Department(212,"Mechanical");
		Student s1 = new Student(121,"Suraj",d1);
		Student s2 = new Student(123,"Aniket",d2);
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
