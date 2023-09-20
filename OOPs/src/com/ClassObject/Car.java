package com.ClassObject;

public class Car {

	int carId;
	String carName;
	float carPrice;

	void displayCar() {
		System.out.println("car id: " + carId);
		System.out.println("car name: " + carName);
		System.out.println("car Price: " + carPrice);
	}

	public static void main(String[] args) {

		Car c1 = new Car();

		c1.carId = 101;
		c1.carName = "Ferrari";
		c1.carPrice = 900000.0f;

		Car c2 = new Car();

		c2.carId = 102;
		c2.carName = "Supra";
		c2.carPrice = 800000.0f;
		c1.displayCar();
		c2.displayCar();

	}

}
