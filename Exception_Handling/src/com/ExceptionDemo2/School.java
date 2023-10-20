package com.ExceptionDemo2;

import java.util.*;

class Student {
	
	static Scanner sc = new Scanner(System.in); 
	private int id;
	private String name;
	private double marks;

	public Student() {

	}

	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	void marks(int marks[]) {
		
		int sum[]=new int[marks.length];
		for (int i = 0; i < marks.length; i++) {


			try {
			if(marks[i]<0) {
				throw new InvalidMarksException("You enterd Negative Marks");
			}
			}
			catch(InvalidMarksException e) {
				System.out.println(e);
			}
		}
	}
//	void percentage(int percentage) {
//		
//		try {
//			if(percentage<0)
//				throw new InvalidMarksException("You entered Marks Less than 0");
//			System.out.println("You Passed with "+percentage);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}

}

public class School {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student s = new Student();
		System.out.println("How many Subjects you have?");
		int subCount = sc.nextInt();

		int sum=0;
		int marks[]=new int[5];
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter marks:");
			 marks[i] = sc.nextInt();
			
		}
		s.marks(marks);
//		s.percentage(sum/subCount);
	}

}
