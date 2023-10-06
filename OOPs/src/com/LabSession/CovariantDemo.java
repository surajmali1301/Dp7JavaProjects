package com.LabSession;

class Covariant{
	
	Object show() {
		
		return new Object();
	}
	
	String show1() {
			
			return "Hello";
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
		
		return "World";
	}
	
}

class SubCharacter extends Covariant{
	
	Character show2() {
		
		return 'A';
	}
	
	String show1() {
		return "Hi";
	}

}

public class CovariantDemo {

	public static void main(String[] args) {
	
		
		Covariant s ;
		s = new Covariant();
		System.out.println(s.show()+"\n"+s.show1());
		s= new SubCovriant();
		System.out.println(s.show()+" "+s.show1());
		s= new SubCharacter();
		System.out.println((int)s.show2());
		s = new SubCovriant();
		
	}

}
