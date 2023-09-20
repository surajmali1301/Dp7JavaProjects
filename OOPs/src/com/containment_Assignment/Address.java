package com.containment_Assignment;

public class Address {

	String city;
	String state;
	String country;
	
	Address(){
		
	}
	Address(String city,String state,String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public static void main(String[] args) {
		
	}
	
	public String toString() {
		return "\ncity: " + city + "\nstate: " + state + "\ncountry: " + country ;
	}
	
	
}
