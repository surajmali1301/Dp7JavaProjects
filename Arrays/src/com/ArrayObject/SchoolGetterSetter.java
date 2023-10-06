package com.ArrayObject;
import java.util.*;
public class SchoolGetterSetter {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		StudentInfo s[] = new StudentInfo[3];
		
		for (int i = 0; i < s.length; i++) {
			
			s[i]=new StudentInfo();
			
			System.out.println("Enter the Id: ");
			s[i].setId(sc.nextInt());
			
			System.out.println("Enter the Name");
			s[i].setName(sc.next());
			
			System.out.println("Enter the Marks: ");
			s[i].setMarks(sc.nextInt());
		}
		
		for(StudentInfo i: s) {
			
			System.out.println(i);
		}

	}

}
