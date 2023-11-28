package com.Collect;

public class Employee {

	private int id;
	private String name;
	private int salary;
//	DepartMent dept;

	public Employee() {

	}

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
//		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

//	public DepartMent getDept() {
//		return dept;
//	}
//
//	public void setDept(DepartMent dept) {
//		this.dept = dept;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
//	}

}