package com.Revision_Codes;
import java.util.*;
class Restaurant {
	int id;
	String rName;
	static int count;
	Menu m;

	Restaurant(int id, String rName, Menu m) {
		this.id = id;
		this.rName = rName;
		this.m = m;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public Menu getM() {
		return m;
	}

	public void setM(Menu m) {
		this.m = m;
	}

	void check() {
		if (this.m.cType.equals("Chinese")) {
			count++;
		}
	}

	public String toString() {
		return "RestaurantId: " + id + "\nName: " + rName + "\nMenu: " + m;
	}

}

class Menu {

	String cType;

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public String toString() {
		return cType;
	}
}

public class RestaurantMain {

	public static void main(String[] args) {
		Menu m1 = new Menu();
		m1.setcType("Chinese");
		Menu m2 = new Menu();
		m2.setcType("Mexican");

		Menu m3 = new Menu();
		m3.setcType("Chinese");

		Restaurant r1 = new Restaurant(2, "Taj", m1);
		Restaurant r2 = new Restaurant(12, "Hyatt", m2);
		Restaurant r3 = new Restaurant(11, "Heaven", m3);
		System.out.println(r1);
		System.out.println("---------");
		System.out.println(r2);
		System.out.println("---------");
		System.out.println(r3);

		System.out.println();
		r1.check();
		r2.check();
		r3.check();

		System.out.println("Total Chinese Restaurants: " + Restaurant.count);
	
	}
}
