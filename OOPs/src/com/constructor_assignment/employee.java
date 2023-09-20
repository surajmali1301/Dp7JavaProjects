package com.constructor_assignment;
import java.util.*;
class employee {
	private int employeeId;
	private String employeeName;
	private float employeeSal;

	
	public void setEmpId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmpId() {
		return employeeId;
	}

	public void setEmpName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmpName() {
		return employeeName;
	}

	public void setEmpSal(float employeeSal) {
		this.employeeSal = employeeSal;
	}

	public float getEmpSal() {
		return employeeSal;
	}
	
	@Override
	public String toString() {
		return " Employee ID: "+getEmpId()+" Employee Name: "+getEmpName()+" Employee Salary: "+getEmpSal();
	}
}

