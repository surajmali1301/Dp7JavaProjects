package com.DynamicDispatch;

class Vehicle{
	
	void display() {
		System.out.println("Vehicle.....");
	}
	void show() {
		System.out.println("Show method in car Class");
	}
}
class Car extends Vehicle{
	
	void display() {
		System.out.println("Displaying Car");
	}
	
}
public class DynamicDispatchDemo {

	public static void main(String[] args) {
		
		Vehicle v;
		v = new Vehicle();
		v.display();
		v = new Car();
		v.display();
		v = new Car();
		v.show();
		v = new Vehicle();
		v.show();

	}

}
