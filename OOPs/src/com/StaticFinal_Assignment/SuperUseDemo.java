package com.StaticFinal_Assignment;



class Vehicle {
    String fuelType;

    Vehicle(String fuelType){
    	this.fuelType=fuelType;
    }
    void display() {
        System.out.println("Inside Parent class");
    }
}

class Bike extends Vehicle {
    int cc = 20;

    Bike(int cc,String fuelType){
    	super(fuelType);
    	this.cc=cc;
    }
    void display() {
        System.out.println("Car capacity: " + this.cc); // Child class variable
        System.out.println("Car Fuel Type: " + super.fuelType); // Parent class variable
        super.display();
    }
}

public class SuperUseDemo {

	
		public static void main(String[] args) {
			Bike obj = new Bike(1000,"Diesel");
			obj.display();
		}


}
