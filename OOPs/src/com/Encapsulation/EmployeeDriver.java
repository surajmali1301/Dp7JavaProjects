package com.Encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {


		Employee emp = new Employee();//objects are created in HEAP area
		emp.setEmployeeId(101);
		emp.setEmployeeName("J B");
		emp.setEmployeeSalary(1000000);
		
		System.out.println("Employee Id:"+emp.getEmployeeId()+" Employee Name: "+emp.getEmpName()+" Employee Salary: "+emp.getEmployeeSalary());

	}

}
