package com.containment;

public class MyColleage {
	
	public static void main(String[] args) {
		
		Course c1= new Course(101,"Java",23000f);
		Course c2= new Course(102,"Python",25000f);
		Course c3= new Course(103,".net",34000f);
		
		Student s1= new Student(1,"Anuj",c1);
		Student s2= new Student(2,"Shahid",c3);
		Student s3= new Student(3,"Kailas",c2);
		Student s4= new Student(4,"Prajyot",c1);
		Student s5= new Student(5,"Hrishikesh",c2);
		Student s6= new Student(6,"Suraj",c1);
		
		System.out.println(s1);
		System.out.println("-------------------------------");
		System.out.println(s2);
		System.out.println("-------------------------------");
		System.out.println(s3);
		System.out.println("-------------------------------");
		System.out.println(s4);
		System.out.println("-------------------------------");
		System.out.println(s5);
		System.out.println("-------------------------------");
		System.out.println(s6);
		
		//2nd Way
		Student s7 = new Student();
		s7.setSid(1011);
		s7.setName("Pralay");
		s7.setCourse(new Course());
		s7.getCourse().setCid(111);
		s7.getCourse().setCname("FullStack");
		s7.getCourse().setFees(150000f);
		
		System.out.println(s7);
	}

}
