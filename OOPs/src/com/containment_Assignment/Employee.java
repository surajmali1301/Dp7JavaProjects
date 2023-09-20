package com.containment_Assignment;

public class Employee {

	public int id;
	public String name;
	public float salary;
	Dept d;
	MyDate md;
	
	static int empCount=0;
	
	{
		empCount++;
		if (empCount>10) {
			empCount=empCount-1;
			System.out.println(empCount);
		} 
	}
	
	Employee(){
		
	}
	Employee(int id,String name,float salary,Dept d,MyDate md){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.d=d;
		this.md=md;
	}
	Employee(int id,String name,float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.d=d;
		this.md=md;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	public MyDate getMd() {
		return md;
	}
	public void setMd(MyDate md) {
		this.md = md;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
