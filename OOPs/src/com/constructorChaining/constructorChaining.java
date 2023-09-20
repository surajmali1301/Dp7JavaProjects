package com.constructorChaining;

//calling one constructor from another constructor with respect object

//increase code readability
//duplicate code removal

class Demo {

	int a;
	int b;
	String name = "Unknown";

	Demo() {
//		a=10;
//		b=20;
		this(10, 20);
		System.out.println("Default Constructor");
	}

	Demo(int a, int b) {

		System.out.println("Param constructor1");
		this.a = a;
		this.b = b;
		this.name="unknown";
	}
	
	Demo(int a,int b,String name){
		System.out.println("Param constructor2");
		this.a=a;
		this.b=b;
		this.name=name;
	}

	public String toString() {
		return " a: " + a + " b: " + b+" "+name;
	}
}

//Why we need constructor chaining?
//-->to assgning the task that has done to be when object creation
public class constructorChaining {

	public static void main(String[] args) {

		Demo a3 = new Demo();
		System.out.println(a3);
		System.out.println("-----------------------");
		Demo a1 = new Demo(10,20);
		System.out.println(a1);
		
		System.out.println("-----------------------");
		Demo a2 = new Demo(30,40,"Suraj");
		System.out.println(a2);

	}

}
