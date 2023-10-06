package com.MethodOverriding;
class Person{
	void display() {
		System.out.println("Person Class");
	}
}
class Employee extends Person{
	void display() {
		System.out.println("Employee class");
	}
}
class Celebrity extends Person
{
	void display() {
		System.out.println("Celebrity Class");
	}
}
	public class MethodOverridingDemo {


	public static void main(String[] args) {


		Person p ;
		p= new Person();
		p.display();
		p = new Employee();
		p.display();
		p =new Celebrity();
		p.display();
		
	

	}

}
