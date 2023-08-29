package com.Lab_Session;
import java.util.*;
public class Mickey_CalculateSalary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter daily hours");
		int dailyHr = sc.nextInt();		
		int sal = 100;

		System.out.println("Anually Salary "+((dailyHr*sal)*365)+" rs/ Year");
		
		
	}

}
