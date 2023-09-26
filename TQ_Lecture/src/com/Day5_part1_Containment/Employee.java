package com.Day5_part1_Containment;

public class Employee {

	int empId;
	String name;
	Address addr;
	
//	Employee(int id,String name){
//		empId=id;
//		this.name=name;
//		
//		}
	Employee(int id,String name,Address addr){
		empId = id;
		this.name=name;
		this.addr=addr;
	}
	
	void showDetails() {
		System.out.println("EmpID: "+empId);
		System.out.println("EmpName: "+name);
		addr.showAddress();
	}
	
	public void setAddress(Address addr) {
		this.addr=addr;
	}
}
