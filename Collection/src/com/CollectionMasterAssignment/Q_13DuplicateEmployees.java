package com.CollectionMasterAssignment;

import java.util.HashMap;

class Employee5 {
	private int empId;
	private String name;
	private int salary;

	public Employee5(int empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee5 [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class Q_13DuplicateEmployees {
	public static void main(String[] args) {
		HashMap<Employee5, String> employeeMap = new HashMap<>();

		Employee5 e1 = new Employee5(101, "Rahul", 50000);
		Employee5 e2 = new Employee5(102, "Rohan", 60000);
		Employee5 e3 = new Employee5(101, "Rahul", 50000); // Duplicate

		employeeMap.put(e1, "Entry 1");
		employeeMap.put(e2, "Entry 2");
		employeeMap.put(e3, "Entry 3"); // Not added due to duplicate key

		System.out.println(employeeMap);
	}

}