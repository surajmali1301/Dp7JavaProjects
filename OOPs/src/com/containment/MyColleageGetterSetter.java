package com.containment;

public class MyColleageGetterSetter {

	public static void main(String[] args) {

		// 1 hardcore values
		Course c1 = new Course(101, "Java", 23000f);
		c1.setCid(1);
		c1.setCname("Java");
		c1.setFees(40000f);

		Student s1 = new Student(1, "Anuj", c1);

		System.out.println(s1);
		// 2nd Way
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
