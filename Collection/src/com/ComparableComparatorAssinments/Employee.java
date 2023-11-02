package com.ComparableComparatorAssinments;

public class Employee implements Comparable<Employee>{

	private int id;
	private String designation;
	private int age;

	public Employee(int id, String designation, int age) {
		super();
		this.id = id;
		this.designation = designation;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", designation=" + designation + ", age=" + age + "]";
	}

	
	//4
//	@Override
//	public int compareTo(Employee e) {
//		// TODO Auto-generated method stub
//		if(this.id==e.id)
//			return this.designation.compareTo(e.designation);
//		else if(this.id<e.id)
//				return 1;//if true
//			else
//					return -1;	
//	}
	
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
			if(this.designation!=null)
				return 1;
			else 
				return this.designation.compareTo(e.designation);
	}

}
