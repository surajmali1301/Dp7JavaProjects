package com.LabSession_Inheritance;

class Fish {
	String name;
	String breed;

	Fish() {
		System.out.println("Default const");
	}

	Fish(String name, String breed) {
		this.name = name;
		this.breed = breed;
		System.out.println("Param Parent const");
	}

	public String toString() {
		return "FishName: " + name + ", breed: " + breed;
	}

}

class GoldFish extends Fish {
	
	String gType;

	GoldFish(String name, String breed,String gType) {
		super(name, breed);
		this.gType=gType;
	}

	public  void display() {
		System.out.println("GoldFishName: " + name + ", GoldFishBreed " + breed + ", Type: " + gType);
	}

	public String toString() {
		return "GoldFish Name: "+name+", GoldFish Breed: "+breed+", GoldType";
	}
	
	

}

class Whale extends Fish {

	String type;

	Whale(String name, String breed, String type) {
		super(name, breed);
		this.type = type;
	}

	public  void display() {
		System.out.println("WhaleFishName: " + name + ", WhaleFishBreed " + breed + ", WhaleType: " + type);
	}

}

public class FishMain {

	public static void main(String[] args) {

		GoldFish g = new GoldFish("Nemo","ButterFlyTail","Gold");
		g.display();
		Whale w = new Whale("Abc","BlueWhale","XYZ");
		w.display();
	}

}
