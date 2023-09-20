package com.LabSession_StaticKeyword;

class Building{
	int flatNo;
	int floorNo;
	int noOfMembers;
	static String buildName;
	
	Building(int flat,int floor,int members){
		this.flatNo=flat;
		this.floorNo=floor;
		this.noOfMembers=members; 
	}
	static {
		buildName="Sweet Home";
	}
	static {
		buildName="Pinacle";
	}
	
	static void playArea() {
		System.out.println("Playarea pool belongs to "+buildName);
	}
	static void swimmingPool() {
		System.out.println("Swiminng pool belongs to "+buildName);
	}
	 void display() {
		System.out.println("Flat no: "+flatNo);
		System.out.println("Floor no: "+floorNo);
		System.out.println("No of members: "+noOfMembers);
		System.out.println("Building name: "+buildName);
		
	}
}
public class Society {

	public static void main(String[] args) {

		Building.playArea();
		Building.swimmingPool();	
		Building b = new Building(707,7,6);
		b.display();
		
		
	}

}
