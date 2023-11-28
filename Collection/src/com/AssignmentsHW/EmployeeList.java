package com.AssignmentsHW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee(1,"Vishal",35000f));
		emp.add(new Employee(2,"Anuj",45000f));
		emp.add(new Employee(3,"Hrishikesh",50000f));
		emp.add(new Employee(4,"Aniket",60000f));
		
		System.out.println(emp.size());
//		Employee max = emp.get(0);
//		for (Employee e:emp) {
//			if(e.getSal()>max.getSal()) {
//				max=e;
//			}
//		}
//		System.out.println("Highest Salary: "+max);
		
		Collections.sort(emp,Collections.reverseOrder());
		
//		Iterator<Employee> itr= emp.iterator();
//		while(itr.hasNext()) {
//			
//			if(itr.next().getSal()>10000) {
//				itr.next();
//			}
//		}
//		
//		
//		for (Employee e : emp) {
//			System.out.println(e);
//		}
//		System.out.println("-----------------");
//		System.out.println(emp.contains("Sachin"));
//		
//		Collections.sort(emp);
//		for (Employee e : emp) {
//			System.out.println(e);
//		}
//		System.out.println("----------------------");
//		emp.remove(2);
//		for (Employee e : emp) {
//			System.out.println(e);
//		}
	}

}
