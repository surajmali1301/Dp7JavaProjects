package com.Inheritance.Multilevel_Inheritance;

class Vehicle {
	private int id;
	private int model;
	protected float price;

	public Vehicle() {
		super();
	}

	public Vehicle(int id, int model, float price) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {
		return " id" + id + "\nModel: " + model + "\nPrice: " + price;
	}

}

class Car extends Vehicle {

	private String name;
	private int noOfGears;
	private String fuelType;

	Car() {

	}

	Car(int id, int model, float price, String name, int noOfGears, String fuelType) {
		super(id, model, price);// used to call base class constructor
		this.name = name;
		this.noOfGears = noOfGears;
		this.fuelType = fuelType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public String getNoOfGears() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public String toString() {
		return "Carname=" + name + ", noOfGears=" + noOfGears + ", fuelType=" + fuelType;
	}

}

class RacingCar extends Car {
	private float maxSpeed;
	private float mileage;

	public RacingCar() {

	}

	public RacingCar(int id, int model, float price, String name, int noOfgears, String fuelType, float maxSpeed,
			float mileage) {
		super(id, model, price, name, noOfgears, fuelType);
		this.maxSpeed = maxSpeed;
		this.mileage = mileage;
	}

	public float getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(float maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}

	public String toString() {
		return super.toString() + " ,MaxSpeed:" + maxSpeed + " ,Mileage:" + mileage;

	}

}

public class MultiLevelVehicle {

	public static void main(String[] args) {
		Car bmw= new Car(101,2022,4500000f,"BMWX1",6,"Petrol");
//		System.out.println(bmw);

		bmw.price=5500000f; // protected member of Vehicle
		
		System.out.println(bmw);
		
		RacingCar rc1= new RacingCar(102, 2023, 6700000, "Formula1", 6, "Diesel",400f ,30f);
		System.out.println(rc1);
		
		rc1.price=7700000f;
	}

}
