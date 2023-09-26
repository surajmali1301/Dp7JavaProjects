package com.Polymorphism;

class Room{
	int len;
	int br;
	
	 Room (){
		this(10,20);
		System.out.println("Default");
		br=5;
		len=5;
//		return this;
		this.display2();
	}
	Room(int len,int br){
		this(5);
		System.out.println("Rectangle");
		this.len=len;
		this.br=br;
	}
	Room(int len){
		System.out.println("Square");
		this.len=len;
		this.br=len;
		this.area();
	}
	
	void display(Room room) {
		System.out.println("Hii");
	}
	void display2() {
		System.out.println("Bye");
	}
	void area() {
		display(this);
		System.out.println("Area of room: "+(len*br));
	}
	{
		
	}
	
}
public class RoomConstOverload {

	final public static void main(String[] args) {


		Room r = new Room();
		r.area();
		Room r1 = new Room(12,15);
		r1.area();
		Room r2 = new Room(6);
		r2.area();
		

	}

}
