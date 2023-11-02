package com.HashMap;

public class Course {

	private int id;
	private String cName;
	private float fees;

	public Course(int id, String cName, float fees) {
		this.id = id;
		this.cName = cName;
		this.fees = fees;
	}

	public Course(int id2, String cName2, int fees2) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", cName=" + cName + ", fees=" + fees + "]";
	}

}
