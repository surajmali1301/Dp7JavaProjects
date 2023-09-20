package com.containment_Assignment;

public class Student {

	private int rollNo;
	private String name;
	private Department dept;
	
	Student(){
		
	}
	Student(int rollNo,String name,Department dept){
		this.rollNo=rollNo;
		this.name=name;
		this.dept=dept;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(Department dept) {
		this.dept=dept;
	}
	public Department getDept() {
		return dept;
	}
	public String toString() {
		return "\nStudent Details: \nRollNo: " + rollNo + "\nName: " + name+"\nDeprtmentDetails: "+dept;
	}
	
	
}
