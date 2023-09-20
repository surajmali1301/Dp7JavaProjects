package com.constructorChaining;



class Acc{
	
	int id;
	String name;
	float balance;
	
	Acc(){
		this(1,"Mali",20000f);
		System.out.println("Default constructor");
	}
	
	Acc(int id,String name,float balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
		System.out.println("Param constructor");
		
	}
	
	void show() {
		
		String name="Suraj";
//		System.out.println(name);
		System.out.println("show(): "+name+" "+this.balance);
	}
	
	
	public String toString() {
		return " "+id+" "+name+" "+balance;
	}
}
public class Account {

	public static void main(String[] args) {
		Acc a1 = new Acc();
		System.out.println(a1);
		Acc a2 = new Acc(100,"Suraj",50000f);
		System.out.println(a2);
		
		Acc a3 = new Acc(12,"S",33333);
		System.out.println(a3);

		a1.show();
	}

}
