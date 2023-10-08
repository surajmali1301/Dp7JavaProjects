package com.LabSession_Array;

public class Theatre {

	int id;
	String name;
	Movie m;

	Theatre(){
		
	}
	public Theatre(int id, String name, Movie m) {
		super();
		this.id = id;
		this.name = name;
		this.m = m;
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

	public Movie getM() {
		return m;
	}

	public void setM(Movie m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Theatre [id=" + id + ", name=" + name + ", m=" + m + "]";
	}

}
