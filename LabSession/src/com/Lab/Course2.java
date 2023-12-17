package com.Lab;

public class Course2 {

	private int cId;
	private String cName;
	private int fees;

	public Course2() {

	}

	public Course2(int cId, String cName, int fees) {

		this.cId = cId;
		this.cName = cName;
		this.fees = fees;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", fees=" + fees + "]";
	}

}
