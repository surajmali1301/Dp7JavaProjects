package com.constructor_assignment;

import java.util.Scanner;

public class Employee1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		employee emp = new employee();
		System.out.println("Enter the Id: ");
		emp.setEmpId(sc.nextInt());
		System.out.println("Enter the Name: ");
		emp.setEmpName(sc.next());
		System.out.println("Enter the Sal: ");
		emp.setEmpSal(sc.nextFloat());

		System.out.println(emp);
	}

}
