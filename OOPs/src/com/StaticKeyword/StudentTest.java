package com.StaticKeyword;




class Student{
	private int id;
	String name;
	float marks;
	static String scName;
	
	Student(){
		scName="st Joseph";	
	}
	Student(int id,String name,float marks){
		this();
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getScName() {
		return scName;
	}
	public void setScName(String scName) {
		this.scName=scName;
	}
}
public class StudentTest {

	
	public static void main(String[] args) {


		Student s1 = new Student();
		System.out.println(s1.scName);
		
		Student s2  = new Student();
		System.out.println(s2.scName);
		s1.scName="st Mary";

	}

}
