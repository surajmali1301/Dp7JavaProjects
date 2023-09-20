package com.Inheritance.Hierarichical;

public class Car {
		
	static String model="BMW X1";
	
	public static void main(String[] args) {
		
		//static int totalCarSold;
		//Cannot create static variable in main()
		 
		Car.model="BMW X3";//2
		System.out.println(model);

	}

}
