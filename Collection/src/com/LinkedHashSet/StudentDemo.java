package com.LinkedHashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Student> ts = new HashSet<>();
		ts.add(new Student("Pralay",79));
		ts.add(new Student("Jay",49));
		ts.add(new Student("Jagdish",80));
		ts.add(new Student("Vishal",35));
		ts.add(new Student("Suraj",60));
		
		for (Student student : ts) {
			System.out.println(student);
		}
	}

}
