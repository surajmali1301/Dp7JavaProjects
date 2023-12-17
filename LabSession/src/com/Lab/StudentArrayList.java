package com.Lab;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentArrayList {

	public static void failPassStudent(HashMap<Student, Integer> hm) {

		ArrayList<Student> pass = new ArrayList<>();
		ArrayList<Student> fail = new ArrayList<>();

		for (Student s : hm.keySet()) {
			int marks = hm.get(s);

			if (marks >= 40) {
				pass.add(s);
			} else {
				fail.add(s);
			}
		}

		System.out.println("Pass Students List");
		for (Student s : pass) {
			System.out.println(s);
		}
		System.out.println("------------");

		System.out.println("Fail Students List");
		for (Student s : fail) {
			System.out.println(s);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Student, Integer> hmap = new HashMap<>();
		hmap.put(new Student(1,"Suraj","Java"),75);
		hmap.put(new Student(2,"Shivam","html"),80);
		hmap.put(new Student(3,"Ram","Java"),35);
		hmap.put(new Student(4,"Kailas","python"),80);
		hmap.put(new Student(5,"Pralay",".net"),59);
		
		failPassStudent(hmap);
	}

}
