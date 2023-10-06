package com.ArrayObject2;
import java.util.*;
public class StudentUserInput {

	static Scanner sc = new Scanner(System.in);
	
	static void enterDetails(Student s) {
	
		System.out.println("Enter id");
		s.setId(sc.nextInt());
		
		System.out.println("Enter Name");
		s.setName(sc.next());
		
		float m[] = new float[3];
		for (int i = 0; i < m.length; i++) {
		
			System.out.println("Subject "+(i+1)+":");
			m[i]=sc.nextFloat();
		}
		for (float f : m) {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s[] = new Student[3];
		
		for (int i = 0; i < s.length; i++) {
			s[i]=new Student();
			
			enterDetails(s[i]);
		}

	}

}
