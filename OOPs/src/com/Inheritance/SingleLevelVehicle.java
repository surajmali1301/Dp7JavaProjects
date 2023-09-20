package com.Inheritance;

class Vehicle{
	private int noOfSeats;
	private int wheels;
	private String type;
	
	
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
class Car extends Vehicle{

}
public class SingleLevelVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
