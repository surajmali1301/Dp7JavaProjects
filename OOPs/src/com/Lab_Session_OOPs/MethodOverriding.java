package com.Lab_Session_OOPs;

class Coffee {
	protected String name;
	private double price;

	public Coffee(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void show() {
		System.out.println("Serving " + name + " for Rs" + price);
	}
}

class Espresso extends Coffee {
	private int cContent;

	public Espresso(String name, double price, int cContent) {
		super(name, price);
		this.cContent = cContent;
	}

	public void show() {
		super.show();
		System.out.println(name + " contains " + cContent + "mg of caffeine.");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {

		Espresso esp = new Espresso("Cappuccino",250f,150);
		esp.show();
	}

}
