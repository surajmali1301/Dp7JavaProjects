package com.CollectionMasterAssignment;
//6. Output of Employee HashSet program
import java.util.HashSet;

class Employee2 {
	private int empId;
	String name;

	public Employee2() {
		super();
	}

	public Employee2(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

}

public class Q_6HashSet {

	public static void main(String args[]) {
		Employee2 employeeOne = new Employee2();
		Employee2 employeeTwo = new Employee2();
		employeeOne.name = "John";
		employeeTwo.name = "Martin";
		HashSet employeeSet = new HashSet();
		employeeSet.add(employeeOne);
		employeeSet.add(employeeTwo);
		System.out.println(employeeSet.size());

	}
}
