package com.Polymorphism;

class Calculate{
	void calculate(int num1,int num2) {
		System.out.println("Additipn: "+(num1+num2));
	}
	void calculate(float num1,float num2) {
		System.out.println("Multiplication: "+(num1*num2));
	}
}
public class Calculator {

	public static void main(String[] args) {


		Calculate c = new Calculate();
		c.calculate(2.5f, 5.2f);
		c.calculate(55, 45);

	}

}
