package com.Revision_Codes;

 class A{
	private int i=10;
	int j = 20;
	protected int k= 30;
	public int m= 40;
	protected A(){
		
	}
	A(int i,int j,int k,int m){
		this.i=i;
		this.j=j;
		this.k=k;
		this.m=m;
	}
	void display() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}
	
}
 class B {
A a = new A();
	 void display() {
//		 System.out.println(a.i);
		 System.out.println(a.j);
		 System.out.println(a.k);
		 System.out.println(a.m);
	 }
}
 
 class C {
	 A a = new A();
	 void display() {
//		 System.out.println(i);//private
		 System.out.println(a.j);
		 System.out.println(a.k);
		 System.out.println(a.m);
	 }
 }
 
  public class AccessDemo {
	 
	  public static void main(String[] args) {
		
		  A a ;
		  a = new A();
		  a.display();
		  
	}
	 
 }
