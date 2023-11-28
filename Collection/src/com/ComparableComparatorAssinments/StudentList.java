package com.ComparableComparatorAssinments;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> sList = new ArrayList<>();

		sList.add(new Student(19, "Viraj", 23));
		sList.add(new Student(27, "Kiran", 22));
		sList.add(new Student(1, "Utkarsh", 24));
		sList.add(new Student(28, "Ram", 25));

		Collections.sort(sList, new RollNoComparator());
		System.out.println("-----Roll-No-----");
		for (Student stu : sList) {
			System.out.println(stu);
		}
		Collections.sort(sList, new NameComparator());
		System.out.println("-----Name-----");
		for (Student stu : sList) {
			System.out.println(stu);
		}
		Collections.sort(sList, new AgeComparator());
		System.out.println("-----Age-----");
		for (Student stu : sList) {
			System.out.println(stu);
		}

		System.out.println("-----Name-Age-----");
		for (Student stu : sList) {
			System.out.println(stu);
		}
	}

}
