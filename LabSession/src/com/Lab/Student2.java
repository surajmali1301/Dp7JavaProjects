package com.Lab;

public class Student2 {

	private int id;
	private String name;
	private int marks;
	private int feesPaid;

	public Student2() {

	}

	public Student2(int id, String name, int marks, int feesPaid) {

		this.id = id;
		this.name = name;
		this.marks = marks;
		this.feesPaid = feesPaid;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public void updateMarks() {
		Course c = new Course();
		if (feesPaid >= c.getFees()) {
			if (marks < 30) {
			marks=35;
			}
		}
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", marks=" + marks + ", feesPaid=" + feesPaid + "]";
	}

}
