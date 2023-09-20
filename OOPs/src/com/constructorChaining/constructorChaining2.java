package com.constructorChaining;

class Test{
	
	int a;
	int b;
	String name;
	Test(){
		System.out.println("Default Contructor");
		this.a=10;
		this.b=20;
		this.name="Unknown";
		System.out.println("Task has to be done evrything");
	}
	
	Test(int a,int b){
		this();
		System.out.println("param const 1");
		this.a=a;
		this.b=b;
	}
	
	Test(int a,int b,String name){
		this();
		System.out.println("param const 2");
		this.a=a;
		this.b=b;
		this.name=name;
	}
	
	public String toString() {
		return " a: "+a+" b: "+b+" name: "+name;
	}
}
public class constructorChaining2 {

	public static void main(String[] args) {


		Test t1 = new Test();
		System.out.println(t1);
		System.out.println("--------------");
		Test t2 = new Test(30,40);
		System.out.println(t2);
		System.out.println("----------------");
		Test t3 = new Test(50,60,"Suraj");
		System.out.println(t3);

	}

}
