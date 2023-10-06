package com.ArrayObject;

public class School {

	public static void main(String[] args) {


		StudentInfo s[]=new StudentInfo[3];
		
//		System.out.println(s[0]);
		
		//Using Constructor
		
		s[0]=new StudentInfo(7,"Aniket",80);
		s[1]=new StudentInfo(13,"Suraj",75);
		s[2]=new StudentInfo(29,"Hrishikesh",80);
		
		
		for(StudentInfo i:s) {
			System.out.println(i);
		}
		
		System.out.println("---------------------------");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

	}

}
