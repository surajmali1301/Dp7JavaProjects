package com.ArrayObject;

public class StudentInfo {

	int id;
	String name;
	float marks;
	
	StudentInfo(){
		
	}
	public StudentInfo(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float f) {
		this.marks = f;
	}
	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
}
