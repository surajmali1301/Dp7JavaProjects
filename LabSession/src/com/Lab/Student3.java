package com.Lab;

public class Student3 {

	private int id;
	private String name;
	private int feesPaid;
	Course2 c;
	
	public Student3(int id, String name, int feesPaid, Course2 c) {
		super();
		this.id = id;
		this.name = name;
		this.feesPaid = feesPaid;
		this.c = c;
	}

	public Student3() {
		// TODO Auto-generated constructor stub
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

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public Course2 getC() {
		return c;
	}

	public void setC(Course2 c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", feesPaid=" + feesPaid + ", c=" + c + "]";
	}
	

}
