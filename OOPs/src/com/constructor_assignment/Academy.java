package com.constructor_assignment;

public class Academy {

	private String academyName;
	private String acadmicLocation;
	
	Academy(String academyName,String acadmicLocation){
		this.academyName=academyName;
		this.acadmicLocation=acadmicLocation;
	}
	
	public void setAname(String academyName) {
		this.academyName=academyName;
	}
	public String getAname() {
		return academyName;
	}
	
	public void setAlocation(String academyName) {
		this.acadmicLocation=acadmicLocation;
	}
	public String getAlocation() {
		return acadmicLocation;
	}
	
	public String toString() {
		return "Academy Name: "+academyName+" Academy Location: "+acadmicLocation;
	}
	
}
