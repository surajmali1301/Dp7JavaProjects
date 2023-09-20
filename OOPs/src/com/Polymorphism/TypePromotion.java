package com.Polymorphism;


class Ambiguity{
	static void display(int n) {
		System.out.println("In int");
		System.out.println(n);
	}
	static void display(float n) {
		System.out.println("In float");
		System.out.println(n);
	}
	static void display(long n) {
		System.out.println("In long");
		System.out.println(n);
	}
}
public class TypePromotion {

	public static void main(String[] args) {
		Ambiguity.display(5);
		//here int got converted into float
		//display('A')
	}
}
