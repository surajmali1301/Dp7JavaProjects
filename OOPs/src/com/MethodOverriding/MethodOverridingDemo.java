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
		System.out.println("Display Class");
	}
}
	public class MethodOverridingDemo {


	public static void main(String[] args) {


		Person p = new Person();
		p.display();
		
		Employee e = new Employee();
		e.display();
		
		Celebrity c = new Celebrity();
		c.display();

	}

}
