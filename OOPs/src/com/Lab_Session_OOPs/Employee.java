package com.Lab_Session_OOPs;

class Employee {
	int id;
	String name;
	String designation;
	float salary;
	

	 Employee(int id, String name, String designation, float salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		

	}
	 
	public String toString() {
		return "" + id + " " + name + " " + designation + " " + salary + " ";
	}




	public double getSal() {
		
	
		double totalSal = salary+(salary*0.1);
		
		
		return totalSal;
	}
}

