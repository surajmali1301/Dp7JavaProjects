package com.Day5_part1_Containment;

public class Address {

	int sNo;
	String socityName,city;
	
	Address(int sNo,String sName,String city){
		this.sNo=sNo;
		socityName=sName;
		this.city=city;
	}
	
	
	public int getsNo() {
		return sNo;
	}


	public void setsNo(int sNo) {
		this.sNo = sNo;
	}


	public String getSocityName() {
		return socityName;
	}


	public void setSocityName(String socityName) {
		this.socityName = socityName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	void showAddress() {
		System.out.println("Society No: "+sNo);
		System.out.println("Society Name: "+socityName);
		System.out.println("City Name: "+city);
	}
}
