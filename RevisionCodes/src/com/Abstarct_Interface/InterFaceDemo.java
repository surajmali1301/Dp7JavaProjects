package com.Abstarct_Interface;

interface Machine{
	
	String fuelType="Diesel";//public static final
	void display();//Backward Compatibility: without disturbing 
	 static void show() {
		 System.out.println("Machine InterFace");
	 }
	 
	
}

class Car implements Machine{
	
	public void display() {
		System.out.println("Car Fuel Type is: "+Machine.fuelType);
	}
}
public class InterFaceDemo {

	public static void main(String[] args) {


		Car a = new Car();
		a.display();     

	}

}
