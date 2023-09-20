package com.containment_Assignment;

public class Person {

	private String name;
	private String gender;
	private int age;
	private Address a;
//	
//	Person(){
//		
//	}
	Person(String name,String gender,int age,Address a){
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.a=a;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAddress(Address a) {
		this.a = a;
	}
	public Address getAddress() {
		return a;
	}
	
	public String toString() {
		return "\nPersonDetails: "+"\nName: "+name+"\nGender: "+gender+"\nAge: "+age+"\n AddressDetails: "+a;
	}
}
