package com.Lab_Session_OOPs;

//import com.Inheritance.Employee;

class CalculateSalary1{


	public static void main(String[] args) {

		Employee e1 = new Employee(1, "Vishal", "DevOps", 40000);
		Employee e2 = new Employee(6, "Aniket", "JavaDev", 35500);
		Employee e3 = new Employee(11, "Hrishi", "WebDev", 30000);
		Employee e4 = new Employee(13, "Suraj", "FSDev  ", 40000);
		
		double netSal = e1.getSal();
		double netSal1 = e2.getSal();
		double netSal2 = e3.getSal();
		double netSal3 = e4.getSal();
		
		System.out.println(e1+"-->NetSalary: " +netSal);
		System.out.println(e2 +"-->NetSalary: "+netSal1);
		System.out.println(e3+"-->NetSalary: "+netSal2);
		System.out.println(e4+"-->NetSalary: "+netSal3);

	}

}
