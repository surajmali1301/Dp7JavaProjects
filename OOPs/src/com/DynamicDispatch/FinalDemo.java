package com.DynamicDispatch;

class Person {
	int id;
	String name;

	Person(int id,String name){
		this.id=id;
		this.name=name;
	}

//	final void dispaly() {
//		System.out.println("Hii");
//	}

}

class Student extends Person {// Cannot extends final class because class cannot modify/ final class is
								// constant
	final String panNum;// blank variable
	static int adhrNum;

	Student(int id, String name, int adhrNum) {
		super(id, name);
		this.adhrNum = adhrNum;
		panNum = "Abc";
	}

	void dispaly() {// If parent class display() is final give error cannot override final method
//		this.panNum=null;
		System.out.println("From display method: " + panNum);
	}

//	public void setPan(String PanNum) {
//		this.panNum=panNum;			//Cannot re-initialize /modify
//	}

	public String getPan() {
		return panNum;
	}
}

public class FinalDemo {

	public static void main(String[] args) {

		Student s = new Student(1, "Suraj", 123344);
//		s.panNum="Eqlpm";
		s.dispaly();
		Student.adhrNum = 61392557;
		System.out.println("AadharNumber: " + Student.adhrNum + " " + s.getPan());
	}

}
