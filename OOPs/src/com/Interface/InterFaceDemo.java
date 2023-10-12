package com.Interface;

interface Bakery{
	
	String bName="LetsBake";
	
	 void bake();//public abstract
		
}

class Cake implements Bakery{
	
	public void bake() {
		System.out.println("We can Bake: ButterScotch, Pineapple, Truffle");
	}
	
	void minOrder() {
		System.out.println("Min packing is 250g");
	}
}

class Biscuit implements Bakery{
	
	public void bake() {
		System.out.println("We can Bake: CreamBiscuit, Choclate");
	}
	
	void minOrder() {
		System.out.println("Min packing is 5 Packges");
	}
}
public class InterFaceDemo {

	public static void main(String[] args) {


		System.out.println("Bakery Name: "+Bakery.bName);
//		Cake c = new Cake();
//		c.bake();
		
		Biscuit b = new Biscuit();
		b.minOrder();
		b.bake();
	}

}
