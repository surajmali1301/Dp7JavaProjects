package com.MethodOverriding;

class MyBakery {

	int bId;
	String bName;
	static int count;
	static int amount;
	Cake c;

	MyBakery() {

	}

	MyBakery(int bId, String bName, Cake c) {

	}
}

class Cake {
	String flavour;
	int price;

	Cake(String flavour, int price) {
		this.flavour = flavour;
		this.price = price;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

}

public class CakeTracker {

	public static void main(String[] args) {

	}

}
