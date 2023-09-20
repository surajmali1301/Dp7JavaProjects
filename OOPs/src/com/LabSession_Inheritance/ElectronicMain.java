package com.LabSession_Inheritance;

class ElectronicDevice {
	String brandName;
	int price;

	ElectronicDevice() {

	}

	ElectronicDevice(String name, int price) {

		brandName = name;
		this.price = price;
	}

}

class Mobile extends ElectronicDevice {

	int launchYear;
	String modelName;
	int ram;
	int storage;

	Mobile(String brandName, int price, int launchYear,String modelName,int ram,int storage) {
		super(brandName, price);
		this.launchYear=launchYear;
		this.modelName=modelName;
		this.ram=ram;
		this.storage=storage;
		
	}
	
	void display() {
		System.out.println("\n-----Mobile Details------ "+"\nBrand Name: "+brandName+"\nRam: "+ram+"Gb"+"\nStorage: "
	+storage+"Gb"+"\nPrice: "+price+"\nLaunch Year: "+launchYear);
	}
}

class Laptop extends ElectronicDevice{
	int ram;
	int storage;
	
	Laptop(String brandName, int price,int ram,int storage){
		super(brandName,price);
		this.ram=ram;
		this.storage=storage;
	}
	
	void display() {
		System.out.println("\n-----Laptop Details----- "+"\nBrandName: "+brandName+"\nPrice: "+price+"\nRam: "+ram+"GB"+"\nStorage: "+storage+"TB");
	}
}

public class ElectronicMain {

	public static void main(String[] args) {


		Mobile m = new Mobile("Apple",70000,2023,"iphone15",6,512);
		m.display();
		Laptop l = new Laptop("HP",50000,8,1);
		l.display();

	}

}
