package com.containment;

import java.util.*;

public class MyColleageUserInput {

	static Scanner sc = new Scanner(System.in);

	void enterStudentDetails(Student s) {
		System.out.println("Enter Student id: ");
		s.setSid(sc.nextInt());
		
		System.out.println("Enter student name: ");
		s.setName(sc.next());
		
		s.setCourse(new Course());
		System.out.println("Enter Course id: ");
		s.getCourse().setCid(sc.nextInt());

		System.out.println("Enter Course name: ");
		s.getCourse().setCname(sc.next());

		System.out.println("Enter Course fees: ");
		s.getCourse().setFees(sc.nextFloat());//Anom.
	}

	public static void main(String[] args) {
		MyColleageUserInput colleage = new MyColleageUserInput();
		Student s1 = new Student();
		Student s2 = new Student();
		colleage.enterStudentDetails(s1);
		colleage.enterStudentDetails(s2);

		System.out.println(s1);
		System.out.println(s2);
	}

}
