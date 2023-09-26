package com.LabSession;

class Covariant{
	
	Object show() {
		
		return new Object();
	}
	
	
Character show2() {
		
		return 'A';
	}

	
}

class SubCovriant extends Covariant{
	
	Integer show() {
		
		return  13;
	}
	
	String show1() {
		
		return "Hello";
	}
	
}

class SubCharacter extends Covariant{
	
	Character show2() {
		
		return 'A';
	}

}

public class CovariantDemo {

	public static void main(String[] args) {
	
		
		Covariant s ;
		s= new SubCovriant();
		System.out.println(s.show());
		s= new SubCharacter();
		System.out.println(s.show2());
	}

}
