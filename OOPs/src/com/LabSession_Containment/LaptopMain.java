package com.LabSession_Containment;

public class LaptopMain {
	public static void main(String[] args) {

		Printer p1 = new Printer("HP", "Color", 30000);
		Laptop l1 = new Laptop("8GbRam1TbSsd", "Hp", 40000, p1);
		System.out.println(l1);

	}

}
