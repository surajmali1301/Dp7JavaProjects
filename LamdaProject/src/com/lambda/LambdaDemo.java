package com.lambda;

public class LambdaDemo {
	
	private static LambdaDemo ld = new LambdaDemo();
	String str;
	
	private LambdaDemo() {
		
	}
	public static LambdaDemo getObject() {
		
		return ld;
	}
	
//	public static void main(String[] args) {
//		
//		//Movable car=()->{};
//		
//		Movable car=()->{System.out.println("Car is moving");};
//		car.move();
//		
//		Movable ball=()->{
//			System.out.println("Ball is rolling");
//			};
//		ball.move();
//		
//	}

	public static void main(String[] args) {
		LambdaDemo l1 = LambdaDemo.getObject();
		l1.str="Java";
		LambdaDemo l2 = LambdaDemo.getObject();
		l2.str="Angular";
		LambdaDemo l3 = LambdaDemo.getObject();
		l3.str="JavaScript";
		System.out.println(l2.str);
	}
}
