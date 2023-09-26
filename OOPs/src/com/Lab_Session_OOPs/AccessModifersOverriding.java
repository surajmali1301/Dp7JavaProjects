package com.Lab_Session_OOPs;

class Vehicle {
	String name;
	int wheels;

	Vehicle() {

	}

	Vehicle(String name, int wheels) {
		this.name = name;
		this.wheels = wheels;
	}

	void show() {
		System.out.println("Information of vehicle");
	}
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Wheels: " + wheels);
	}
}

class Bike extends Vehicle {

	int maxSpeed;

	Bike() {

	}

	Bike(String name, int wheels, int maxSpeed) {
		super(name,wheels);
		this.maxSpeed=maxSpeed;
	}
	
	public void show() {
		super.show();
		System.out.println("Showing Bike Details....");
	}
	
	protected void display() {
		super.display();
		System.out.println("MaxSpeed: "+maxSpeed);		
	}
}

public class AccessModifersOverriding {

	public static void main(String[] args) {


		Bike b = new Bike("Pulsar",2,100);
		b.show();
		b.display();

	}

}
