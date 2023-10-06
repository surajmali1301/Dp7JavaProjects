package com.StaticFinal_Assignment;

class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	public static void printInfo() {
		System.out.println("This is an Animal.");
	}
}

class Dog extends Animal {
	String breed;

	public Dog(String name, String breed) {
		super(name);
		this.breed = breed;
	}

	public static void printInfo() {
		System.out.println("This is a Dog.");
	}

	public void printDetails() {
		System.out.println("Name: " + super.name);
		System.out.println("Breed: " + this.breed);
	}
}

public class StaticSuper {

	public static void main(String[] args) {
		Dog myDog = new Dog("Oscar", "Labrador");
		myDog.printDetails();

		Animal.printInfo(); // Calling static method from Animal class
		Dog.printInfo(); // Calling static method from Dog class
	}

}
