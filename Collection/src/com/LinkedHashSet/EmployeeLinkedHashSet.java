package com.LinkedHashSet;

import java.util.LinkedHashSet;

public class EmployeeLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Employee> ll = new LinkedHashSet<>();
		
		ll.add(new Employee(1,"Kailas",35000));
		ll.add(new Employee(2,"Pralay",30000));
		ll.add(new Employee(3,"Pratiksha",45000));
		ll.add(new Employee(4,"Dipti",60000));
		ll.add(new Employee(2,"Pralay",30000));
		
		for (Employee e : ll) {
			System.out.println(e);
		}
	}

}
