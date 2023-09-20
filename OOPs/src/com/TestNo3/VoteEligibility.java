package com.TestNo3;
import java.util.*;


class Person{
	private int id;
	private String name;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return " " + id + " " + name + " " + age + " ";
	}
	
	
	
}
public class VoteEligibility {
	
	static void checkVote(Person p) {
		if(p.getAge()>18) {
			System.out.println("id: "+p.getId()+" name: "+p.getName()+" age: "+p.getAge()+"\n"+" You can Vote");
		}
	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		Person p1 = new Person();
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		System.out.println("Enter the Name: ");
		
		System.out.println("Enter the age: ");
		p1.setAge(sc.nextInt());
		
		checkVote(p1);
		

	}

}
