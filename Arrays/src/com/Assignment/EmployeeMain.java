package com.Assignment;
import java.util.*;
public class EmployeeMain {
	
	static Scanner sc = new Scanner(System.in);
	
	static void displayCount(Employee e1[],Department []dept) {
		
		int count;
		for (Department d2 : dept) {
			count=0;
			for (Employee e2 : e1) {
				if(e2.getD().equals(d2)) {
					count++;
					System.out.println(e2.getEName());
				}
			}
			System.out.println("Count Of DepartMent: "+count);
		}
	}
	
	static void enterDetails(Employee emp1) {
	
		System.out.println("Employee Id");
		emp1.setEId(sc.nextInt());
		
		System.out.println("Employee Name");
		emp1.setEName(sc.next());
		
		System.out.println("Employee Salary");
		emp1.setESalary(sc.nextFloat());
		
		emp1.setD(new Department());
		
		System.out.println("Department Id");
		emp1.getD().setdId(sc.nextInt());
		
	}
	
	static void printDetails(Employee e[]) {
		
		for (Employee emp : e) {
			System.out.println(emp);
		}
	}

	public static void main(String[] args) {


		Department d[] = new Department[3];
		
		d[0] = new Department(1,"Testing");
		d[1] = new Department(2,"Development");
		d[2] = new Department(3,"HR");
		
		Employee e[] = new Employee[6];
		
		e[0] = new Employee(1,"Suarj",40000,d[0]);
		e[1] = new Employee(2,"Aniket",40000,d[1]);
		e[2] = new Employee(3,"Vishal",40000,d[2]);
		e[3] = new Employee(4,"Kailas",40000,d[2]);
		e[4] = new Employee(5,"Anuj",40000,d[1]);
		e[5] = new Employee(6,"Hrishikesh",40000,d[0]);
		
		displayCount(e,d);
		
		Employee e2[] = new Employee[2];
//		for (int i = 0; i < e2.length; i++) {
//			 e2[i] = new Employee();
//			 enterDetails(e[i]);
//		}
//		System.out.println("------------------------------");
//		printDetails(e2);
	
	}

	
}
