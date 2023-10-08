package com.ArrayContainment;

import java.util.Arrays;

public class StudentConstructor2 {

public static void main(String[] args) {
		
		Student stud[]= new Student[4];
		
		stud[0]= new Student(1,"Suraj",new Course(101,"Java",34000));
		stud[1]= new Student(2,"Shivam", new Course(102,".net",35000));
		stud[2]= new Student(3,"Aniket", new Course(102,".net",35000));
		
		// hard code getter setter
		
		stud[3]= new Student();
		stud[3].setId(0);
		stud[3].setName("Hrishikesh");
		stud[3].setC(new Course(101,"Java",34000));
		
		for(Student s:stud)
		{
			System.out.println(s);
		}
		
		System.out.println(Arrays.toString(stud));
		
		
	}
}
