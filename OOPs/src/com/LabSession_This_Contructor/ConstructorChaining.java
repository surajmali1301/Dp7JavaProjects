package com.LabSession_This_Contructor;


class Vehicle1{
	int id;
	String name;
	float price;
	
	
	Vehicle1(){
		this(0,null,0);
		System.out.println("Default Constructor");
	}
	Vehicle1(int id,String name,float price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	void display() {
//		System.out.println("-------Using this keyword for method-------");
		this.showDetails();
	}
	void showDetails() {
		System.out.println("Id of vehicle: "+id);
		System.out.println("Name of vehicle: "+name);
		System.out.println("Price of vehicle: "+price);
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(101,"Ferrari",400000f);
		Vehicle v2 = new Vehicle(102,"Porche",80000f);
		

		System.out.println("------------------------------");
		v1.showDetails();
		v2.showDetails();
		
		System.out.println("---------------------------------");
		v1.display();
		System.out.println("---------------------------------");
		v2.display();
		
		System.out.println("-----------Default Values------------------");
		Vehicle v3 = new Vehicle();
		System.out.println(v3);
		
	}
}


