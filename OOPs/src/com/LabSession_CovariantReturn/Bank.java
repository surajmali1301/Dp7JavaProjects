package com.LabSession_CovariantReturn;

 class Person {

	int id;
	String name;
	float bal;

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

	public float getBal() {
		return bal;
	}

	public void setBal(float bal) {
		this.bal = bal;
	}

}

class Paytm {

	static Person display() {// using Person class as Object
		Person p = new Person();
		p.setId(1);
		p.setName("Suraj");
		p.setBal(10000f);
		return p;
	}
}

public class Bank {

	
	static float withdraw = 2000f;
	
	static Person display() {
		Person p = new Person();
		withdraw -= (p.getBal());
		p.setBal(p.getBal());
		return p;
	}
	public static void main(String[] args) {

		Person p = Paytm.display();////up-casting
		
		
		System.out.println(p.getId()+" "+p.getName()+" "+p.getBal());

	}

}
