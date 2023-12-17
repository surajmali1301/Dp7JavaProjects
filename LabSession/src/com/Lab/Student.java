package com.Lab;

public class Student {

	private int id;
	private String name;
	private String subName;

	public Student(int id, String name, String subName) {
		super();
		this.id = id;
		this.name = name;
		this.subName = subName;
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

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", subName=" + subName + "]";
	}

}
