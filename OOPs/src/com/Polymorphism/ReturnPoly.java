package com.Polymorphism;

class Shape2{
	
	
	int area(int side) {
		return (side*side);
	}
	int area(int length,int breath) {
		return (length*breath);
	}
	float area(float radius) {
		float pi=3.14f;
		return (pi*radius*radius);
	}
	
	void area() {
		
	}
}
public class ReturnPoly {

	public static void main(String[] args) {
		
		Shape2 sq = new Shape2();
		System.out.println(sq.area(5));
		Shape2 rectangle = new Shape2();
		System.out.println(rectangle.area(4, 7));
		Shape2 circle = new Shape2();
		System.out.println(circle.area(2.5f));

	}

}
