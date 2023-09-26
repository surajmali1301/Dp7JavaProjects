package com.ClassCode;

class Vehicle{
	String gearType;
	int wheels;
	float price;
	
	Vehicle(String gearType,int wheels,float price){
		this.gearType=gearType;
		this.wheels=wheels;
		this.price=price;
	}
	
	void showVehicle() {
		System.out.println(" "+gearType+" "+wheels);
	}
}

class Car extends Vehicle{
	String cName;
	int gears;
	
	Car(String gearType,int wheels,float price,String cName,int gears){
		super(gearType,wheels,price);
		this.cName=cName;
		this.gears=gears;
	}
	
	void showCar() {
//		super.showVehicle();
		System.out.println("CarName: "+cName+"\nGearType: "+gearType+"\nGears: "+gears+"\nWheels: "+wheels+"\nPrice: "+price);
	}
}

class RacingCar extends Car{
	int speedKmh;
	
	RacingCar(String gearType,int wheels,float price,String cName,int gears,int speedKmh){
		super(gearType,wheels,price,cName, gears);
			this.speedKmh=speedKmh;
	}
	
	public int getSpeed() {
		return speedKmh;
	}
	void showRacingCar() {
		super.showCar();
	}
}
public class Multilevel {

	public static void main(String[] args) {
		
		RacingCar rc = new RacingCar("Manual/Automatic",4,5000000f,"BMW",6,200);
		rc.showRacingCar();
	}

}
