package com.LabSession_CovariantReturn;

class Employee {
	int id;
	String name;
	int salary;

	Employee() {

	}

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	static Employee display() {
		Employee e1 = new Employee(1, "Suraj", 40000);
		return e1;
	}

	public String toString() {
		return "Id: " + id + "\nName: " + name + "\nSalary: " + salary;
	}
}

public class EmployeeMain {

	public static void main(String[] args) {

		
		System.out.print(Employee.display());

	}

}
