package com.constructorChaining;

public class Testify {

	String name;
	
	Testify(){
		
	}
	
	Testify(String name){
		this.name=name;
	}
	
	void display() {
		System.out.println("Hi "+name);
		this.show();
	}
	void show() {
		System.out.println("Welcome to thinkQuotient "+name);
	}
	
	Testify changeName() {
		name=name+" ThinkQ";
		return this;
	}
	public static void main(String[] args) {


		Testify tf = new Testify("Suraj");
		tf.display();
		
		Testify dummy;
		dummy = tf.changeName();

	}

}
