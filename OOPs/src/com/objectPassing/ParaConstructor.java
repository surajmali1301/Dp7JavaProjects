package com.objectPassing;

class Student{
	int id;
	String name;
	int age; 
	
	Student(){
		
	}
	
	Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	
	
	public String toString() {
		return " "+id+" "+name+" "+age;
	}
}

public class ParaConstructor {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Suraj",23);
		Student s2 = new Student(2,"Aniket",24);		
		Student s3 = new Student(3,"Hrishikesh",26);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	
}