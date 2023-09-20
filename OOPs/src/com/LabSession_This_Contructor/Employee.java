package com.LabSession_This_Contructor;


class EmpSal{
	int id;
	String name;
	float salary;
	
	EmpSal(){
		this(101,"Suraj",50000f);
	}
	EmpSal(int id,String name,float salary){
		this(0,"Unknown");//2  
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	EmpSal(int id,String name){//3
	  this.id=id;
	  this.name=name;
	}
	

	void showDetails() {//4
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("salary: "+salary);
	}
}
public class Employee {
	
	public static void main(String[] args) {
		EmpSal e1 = new EmpSal();
		e1.showDetails();
		System.out.println("---------------");
		EmpSal e2 = new EmpSal(1,"Vishal",40000f);//1 current parameters
		e2.showDetails();
	}
	

}
