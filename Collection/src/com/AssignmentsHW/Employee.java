package com.AssignmentsHW;

public class Employee implements Comparable<Employee>{

	private int id;
	private String name;
	private float sal;

	public Employee() {
	}

	public Employee(int id, String name, float sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
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

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employee e) {
	    if (this.sal == e.sal) {
	        return 0; // Salaries are equal
	    } else if (this.sal > e.sal) {
	        return -1; // Current employee has higher salary
	    } else {
	        return 1; // Compared employee has higher salary
	    }
	}


}
