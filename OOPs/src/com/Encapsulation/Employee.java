package com.Encapsulation;

public class Employee {

	private int employeeId;
	private String empName;
	private float empSalary;
	
	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeName(String empName) {
		this.empName=empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmployeeSalary(int empSalary) {
		this.empSalary=empSalary;
	}
	public float getEmployeeSalary() {
		return empSalary;
	}	
		/*Via toString*/
	
	public String toString() 
		{
			return "Emp Id"+employeeId+" Emp Name"+empName+" Sal"+empSalary;
		}
	}

