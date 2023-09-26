package com.Day5_part1_Containment;
import java.util.*;
public class EmpAddr_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter EmpID: ");
		int id = sc.nextInt();
		System.out.println("Enter EmpName: ");
		String name = sc.next();
		
		System.out.println("Enter society No: ");
		int sNo = sc.nextInt();
		System.out.println("Enter socityName: ");
		String sName = sc.next();
		System.out.println("Enter City Name: ");
		String cName = sc.next();
	
		Address a1 = new Address(sNo,sName,cName);
		Employee e = new Employee(id,name,a1);

	
		e.setAddress(a1);
		e.showDetails();
	}

}
