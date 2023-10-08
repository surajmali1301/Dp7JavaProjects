package com.ArrayContainment;

public class StudentConstructor3 {

	static void countStudent(Student[] st,Course c[]) {
		
		int count;
		
		for (Course c1 : c) {
			
			count=0;
			for (Student s : st) {
				if (s.getC().equals(c1)) {
					count++;
				}
			}
			System.out.println(c1+" "+count);
		}
	}
	public static void main(String[] args) {
		
		Course c[] = new Course[3];
		c[0] = new Course(101,"Java",34000);
		c[1] = new Course(101,".net",40000);
		c[2] = new Course(101,"Python",30000);
		
		Student stud[] = new Student[3];
		stud[0]=new Student(1,"Pratiksha",c[0]);
		stud[1]=new Student(2,"Dipti",c[1]);
		stud[2]=new Student(3,"Shivam",c[2]);
		
		countStudent(stud,c);
		
//		for (Student s : stud) {
//			System.out.println(s);
//		}
		
	}
}
