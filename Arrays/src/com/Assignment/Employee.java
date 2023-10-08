package com.Assignment;

public class Employee {

	private int eId;
	private String eName;
	private float eSalary;
	Department d;

	Employee() {

	}

	Employee(int eId, String eName, float eSalary, Department d) {
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.d=d;
	}

	public int getEId() {
		return eId;
	}

	public void setEId(int eId) {
		this.eId = eId;
	}

	public String getEName() {
		return eName;
	}

	public void setEName(String eName) {
		this.eName = eName;
	}

	public float getESalary() {
		return eSalary;
	}

	public void setESalary(float eSalary) {
		this.eSalary = eSalary;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", d=" + d + "]";
	}
	
	
}
