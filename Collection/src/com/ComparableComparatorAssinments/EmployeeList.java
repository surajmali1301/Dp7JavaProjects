package com.ComparableComparatorAssinments;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> el = new ArrayList<>();
		
		el.add(new Employee(1,"Devloper",30));
		el.add(new Employee(3,null,28));
		el.add(new Employee(2,"DevOps",34));
		el.add(new Employee(1,"Devloper",24));
		
		
		for (Employee e : el) {
			System.out.println(e);
		}
		System.out.println("------------");
		Collections.sort(el);
		
		for (Employee e : el) {
			System.out.println(e);
		}
	}

}
