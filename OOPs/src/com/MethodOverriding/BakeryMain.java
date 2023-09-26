package com.MethodOverriding;

class Bakery {

	void bake() {
		System.out.println("Welcome to Bakery");
	}
}

class BreadBakery extends Bakery {
	int count=0;
	{
		count++;
	}
	void bake() {
		System.out.println("Baking bread ");
	}
}

class CakeBakery extends Bakery {

	void bake() {
		System.out.println("Baking cake");
	}
}

public class BakeryMain {

	public static void main(String[] args) {

		Bakery b;
		b = new Bakery();
		b.bake();
		b = new BreadBakery();
		b.bake();
		b = new CakeBakery();
		b.bake();

	}

}
