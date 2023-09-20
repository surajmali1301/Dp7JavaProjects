package com.Polymorphism;

class Room{
	int len;
	int br;
	
	Room(){
		System.out.println("Default");
		len=5;
		br=5;
	}
	Room(int len,int br){
		System.out.println("Rectangle");
		this.len=len;
		this.br=br;
	}
	Room(int len){
		System.out.println("Square");
		this.len=len;
		this.br=len;
	}
	
	void area() {
		System.out.println("Area of room: "+(len*br));
	}
	
	
}
public class RoomConstOverload {

	public static void main(String[] args) {


		Room r = new Room();
		r.area();
		Room r1 = new Room(12,15);
		r1.area();
		Room r2 = new Room(6);
		r2.area();
		

	}

}
