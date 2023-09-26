package com.Revision_Codes;

class Shape {
	int b;
	int h;
	int l;
	int radius;
	
	Shape(){
		
	}
	Shape(int b,int l,int h){
		this.b=b;
		this.h=h;
		this.l=l;
	}
	Shape(int h){
		this.h=h;
	}
	
	 void check() {
		System.out.println("Height: "+h+"\nBreath: "+b+"\nLength: "+l);
	}

}

class Rectangle extends Shape{
		
	Rectangle(int b,int l,int h){
		super(b,l,h);
	}
	
	void check() {
		System.out.println("Volume of rectangle: "+(b*l*h));
	}
}

class Cylinder extends Shape{
	
	float pi=3.14f;
	int radius;
	Cylinder(int h,int radius){
		super(h);
		this.radius=radius;
	}
	
	void check() {
		System.out.println("Volume of Cylinder: "+(pi*(radius*radius)*h));
	}
}

public class ShapeMain2{
	
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(5,5,5);
		r.check();
		Cylinder c = new Cylinder(20,14);
		c.check();
	}
}
