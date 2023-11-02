package com.ArrayList;

public class Student {

	private int id;
	private String name;
	private String cName;
	
	public Student(int id, String name, String cName) {
		super();
		this.id = id;
		this.name = name;
		this.cName = cName;
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

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cName=" + cName + "]";
	}
	
	
}
