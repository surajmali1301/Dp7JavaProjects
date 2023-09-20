package com.Polymorphism;

class Shape{
	
	
	void area(int side) {
		System.out.println("Area of square is: "+(side*side));
	}
	void area(int length,int breath) {
		System.out.println("Area of rectangle is"+(length*breath));
	}
	void area(float radius) {
		float pi=3.14f;
		System.out.println("Area of circle is: "+(pi*radius*radius));
	}
}
public class PolyDemo1 {

	public static void main(String[] args) {


		Shape s = new Shape();
		s.area(7);
		s.area(5,7);
		s.area(2.14f);

	}

}
