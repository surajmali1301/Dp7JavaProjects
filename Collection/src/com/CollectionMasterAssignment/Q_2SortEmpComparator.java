package com.CollectionMasterAssignment;
//2. Sorting Employee objects by name using Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1 {
	private int empId;
	private String name;

	public Employee1(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

}

public class Q_2SortEmpComparator {
	public static void main(String[] args) {
		ArrayList<Employee> alEmp = new ArrayList<Employee>();
		Employee e1 = new Employee(3, "Ajit");
		Employee e2 = new Employee(4, "Suman");
		alEmp.add(e1);
		alEmp.add(e2);

		Collections.sort(alEmp, new EmpNameComparator());

		for (Employee emp : alEmp) {
			System.out.println("EmpId: " + emp.getEmpId() + ", Name: " + emp.getName());
		}
	}
}
