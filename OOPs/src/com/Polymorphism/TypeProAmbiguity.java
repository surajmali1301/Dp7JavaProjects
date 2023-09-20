package com.Polymorphism;

public class TypeProAmbiguity {
	
	static void add(int num1,double num2) {
		System.out.println("In method 1");
		System.out.println((num1+num2));
	}
	static void add(long num1,float num2) {
		System.out.println("In method 2");
		System.out.println((num1+num2));
	}

	public static void main(String[] args) {


//		add(9,3.14f);
		
//		9       int :asking double convert 7.8f into double
//		7.8: float : asking long convert 9 into  long

	}

}
