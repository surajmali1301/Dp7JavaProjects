package com.StaticKeyword;

public class StaticDemo {
	
	int x=10;
	static int y=10;
	
	void show() {
		x++;
		System.out.println("X: "+x);
		y++;
		System.out.println("Y: "+y);
	}
	
	void display() {
		int y =20;
		System.out.println("y: "+y);
		System.out.println(StaticDemo.y);
	}

	public static void main(String[] args) {


		StaticDemo s1 = new StaticDemo();
		
		s1.show();
		

		
	}

}
