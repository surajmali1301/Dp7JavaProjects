package com.CollectionMasterAssignment;
//7. Output of Employee HashSet program 
//(with overridden equals and hashCode)
import java.util.HashSet;

class Employee3 {
	private int empId;
	String name;

	public Employee3() {
		super();
	}

	public Employee3(int empId, String name) {
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

	@Override
	public int hashCode() {
		return 31;
	}

	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

public class Q_7HashSetEqual {
	public static void main(String args[]) {
		Employee3 employeeOne = new Employee3();
		Employee3 employeeTwo = new Employee3();
		employeeOne.name = "Anuj";
		employeeTwo.name = "Pralay";
		HashSet employeeSet = new HashSet();
		employeeSet.add(employeeOne);
		employeeSet.add(employeeTwo);
		System.out.println(employeeSet.size());
	}
}
