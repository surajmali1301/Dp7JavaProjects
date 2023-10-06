package com.Interface;

interface Movable{
	
	 int a=10;
	void move();
}

interface printable extends Movable
{
	void printMe(String name);
}

class Car implements printable{
	
	public void move() {
		
	}
	
	public void printMe(String name) {
		System.out.println("My car name is: "+name);
	}
}
public class ExtendInterFace {

	public static void main(String[] args) {


		Movable m ;
		m = new Car();
//		m.printMe();
		
		Car c;
		c = new Car();
		c.move();
		c.printMe("Ferrari");
		
		

	}

}
