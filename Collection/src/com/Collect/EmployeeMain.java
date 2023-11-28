package com.Collect;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Employee, DepartMent> hMap = new HashMap<>();

		hMap.put(new Employee(1, "Aniket", 50000), new DepartMent(1, "BackEnd"));
		hMap.put(new Employee(2, "Anuj", 30000), new DepartMent(1, "FrontEnd"));
		hMap.put(new Employee(3, "Hrishikesh", 35000), new DepartMent(1, "Analyst"));
		hMap.put(new Employee(4, "Ram", 30000), new DepartMent(1, "HR"));

		for (Employee emp : hMap.keySet()) {
			System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
		}

		System.out.println("-------------");

		for (Map.Entry<Employee, DepartMent> e : hMap.entrySet()) {
			Employee emp = e.getKey();
			DepartMent dept = e.getValue();
			System.out.println(emp.getId() + "--" + emp.getName() + "--" + emp.getSalary() + "----->" + dept.getId()
					+ dept.getDeptName());
		}

		System.out.println("--------------------");

		Set<Map.Entry<Employee, DepartMent>> e=hMap.entrySet();
		for(Map.Entry<Employee, DepartMent> e1 : e) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
		}
		System.out.println("--------------------");
	}

}
