package com.InterfaceAdvance;

interface Calculations{
	
	float pi=3.14f;
	
	void area();
	
	default void vloume() {
		System.out.println("In volume method");
	}
}

class Square implements Calculations{
	
	int side;
	
	public Square() {
		
	}
	public Square(int side) {
		super();
		this.side=side;
	}
	
	public void area() {
		System.out.println("Area of Square: "+(side*side));
	}
}

class Cube implements Calculations{
	int side;
	
	public Cube() {
		
	}
	public Cube(int side) {
		super();
	this.side=side;	
	}
	
	public void area() {
		System.out.println("Area of cube: "+(6*side*side));
	}
	
	static void info() {
		System.out.println("Geometric shape");
	}
}
public class InterfaceAdvanceDemo {

	public static void main(String[] args) {


		Calculations c;
		
		c = new Square(5);
		c.area();
		
		c = new Cube(6);
		c.area();
		

	}

}
