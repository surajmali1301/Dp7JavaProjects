package com.ArrayContainment;

public class StudentConstructor {

	public static void main(String[] args) {
		
		
		Course c1 = new Course(101,"Java",50000);		
		Course c2 = new Course(102,".net",45000);
		
		Student stud[] = new Student[4];
		
		stud[0]=new Student(1,"Pratiksha",c1);
		stud[1]=new Student(2,"Dipti",c2);
		stud[2]=new Student(3,"Shivam",c2);
//		stud[3]=new Student(4,"Suraj",c1);
		
		//Hard code getter setter
		
		stud[3] = new Student();
		stud[3].setId(4);
		stud[3].setName("Suraj");
		stud[3].setC(c1);
		
		for (Student s : stud) {
			System.out.println(s);
		}
	}

}
