package com.Day4_Part2;

class Employee{
	int empId;
	String name;
	float basicSal;
	int hra;
	int da;
	
	Employee(){
		this(1,"Suraj",20000f);
		System.out.println("Default Constructor");
	}
	Employee(int empId,String name,float basicSal){
		this.empId=empId;
		this.name=name;
		this.basicSal=basicSal;
		this.hra=20;
		this.da=35;
	}
	
	void showDetails() {
		float grossSalary = ((basicSal * hra)/100)+((basicSal * da)/100)+basicSal;
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Basic Salary: "+basicSal);
		System.out.println("Employee Gross Salary: "+grossSalary);
	}
}
public class EmployeeConstructor {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		System.out.println(e1);
		e1.showDetails();
		
	}
}
