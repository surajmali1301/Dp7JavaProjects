package com.containment_Assignment;
import java.util.*;
public class DisplayEmployee {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee id: ");
		int id = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String name = sc.next();
		System.out.println("Enter Employee Salary: ");
		float sal = sc.nextFloat();
		
		System.out.println("Enter Department id: ");
		int deptId = sc.nextInt();
		System.out.println("Enter Department Name: ");
		String deptName = sc.next();
		
		System.out.println("Enter day: ");
		int day = sc.nextInt();
		System.out.println("Enter month: ");
		String month = sc.next();
		System.out.println("Enter Year: ");
		int year = sc.nextInt();
		
//		Dept d1 = new Dept();
//		MyDate md2 = new MyDate();
		Employee emp  = new Employee();
		
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(sal);
		emp.setD(new Dept());
		emp.getD().setDeptId(deptId);
		emp.getD().setDeptName(deptName);
		emp.getD().setMd(new MyDate());
		emp.getD().getMd().setDay(day);
		emp.getD().getMd().setMonth(month);
		emp.getD().getMd().setYear(year);
		
		System.out.println("EmpId:    "+emp.getId());
		System.out.println("EmpName:  "+emp.getName());
		System.out.println("EmpSal:   "+emp.getSalary());
		System.out.println("DeptID:   "+emp.getD().getDeptId());
		System.out.println("DeptName: "+emp.getD().getDeptName());
		System.out.println("DeptName: "+emp.getD().getMd().getDay());
		System.out.println("DeptName: "+emp.getD().getMd().getMonth());
		System.out.println("DeptName: "+emp.getD().getMd().getYear());


		
		

	}

}
