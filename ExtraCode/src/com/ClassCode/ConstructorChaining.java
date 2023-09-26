package com.ClassCode;

class Emp{
	int id;
	String name;
	
	Emp(){
		this(1,"Abc");
	}
	Emp(int id,String name){
		this.id=id;
		this.name=name;
	}
	void showEmp() {
		System.out.println("From Parent Class");
	}
}
class Manager extends Emp{
	String role;
	
	Manager(int id,String name,String role){
		super(id,name);
		this.role=role;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRole() {
		return role;
	}
	
	void show() {
		super.showEmp();
		System.out.println("ID: "+id+"\nName: "+name+"\nRole: "+role);
	}
	
}
public class ConstructorChaining {

	public static void main(String[] args) {

		Manager m = new Manager(17,"Suraj","ProjectManager");
		m.show();

		

	}

}
