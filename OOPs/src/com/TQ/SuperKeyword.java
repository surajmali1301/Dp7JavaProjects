package com.TQ;

class SuperDemo{
	int id;
	String name;
	
	SuperDemo(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void show() {
		System.out.println("From Parent Class show()");
	}
}



class SuperUse extends SuperDemo{
	int rollNo;
	SuperUse(int id,String name,int rollNo){
		super(id,name);
		this.rollNo=rollNo;
		super.show();
	}
	
	void show() {
		System.out.println("ID: "+id+" Name: "+name+" RollNo: "+rollNo);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {


		SuperUse su = new SuperUse(1,"Abc",28);
		su.show();

	}

}
