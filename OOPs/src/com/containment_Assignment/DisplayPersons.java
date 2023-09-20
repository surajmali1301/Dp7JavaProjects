package com.containment_Assignment;

public class DisplayPersons {

	public static void main(String[] args) {


		Address a1 = new Address("Belgaon","Karnataka","India");
		Address a2 = new Address("Nasik","Maharashtra","India");
		Address a3 = new Address("Solapur","Maharashtra","India");

		Person p1 = new Person("Aniket","Male",23,a1);
		Person p2 = new Person("Hrishikesh","Male",23,a2);
		Person p3 = new Person("Vishal","Male",23,a2);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
