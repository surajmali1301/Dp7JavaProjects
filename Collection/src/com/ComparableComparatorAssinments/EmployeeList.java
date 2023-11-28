package com.ComparableComparatorAssinments;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> el = new ArrayList<>();
		
		el.add(new Employee(1,"Suraj","Devloper",23,"India","Maharashtra"));
		el.add(new Employee(2,"Rahul","Analyst",24,"Dubai","Sharjah"));
		el.add(new Employee(3,"Vinay","DevOps",30,"USA","California"));
		el.add(new Employee(4,"Viraj","Devloper",25,"Germany","Berlin"));
		
		//8. Create and add 4 more Employee objects in ArrayList. Print ArrayList. Sort ArrayList using 
		//Collections.sort(list) based on name. If name are same then sort on id. Print arrayList.
		el.add(new Employee(5,"Amar","Trainee",21,"India","Hyderabad"));
		el.add(new Employee(6,"Kunal","BAnalyst",24,"England","London"));
		el.add(new Employee(7,"Shubham","DevOps",30,"USA","Texas"));
		el.add(new Employee(8,"Rohit","Devloper",25,"Germany","Hamburg"));
		
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
