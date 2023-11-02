package com.LabSession;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class BikeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Bike> bList = new LinkedList<>();

		bList.add(new Bike(1, "Suzuki", 1000000f, 2023));
		bList.add(new Bike(2, "CBZ", 60000f, 2009));
		bList.add(new Bike(3, "Shine", 76000f, 2005));
		bList.add(new Bike(4, "Yamaha", 200000f, 2023));

		bList.addFirst(new Bike(5, "Ninja", 1500000f, 2021));
		bList.addFirst(new Bike(6, "Honda", 500000f, 2005));

		bList.addLast(new Bike(7, "TVS", 50000f, 2015));

		bList.add(5, new Bike(8, "Hero", 50000f, 2015));

		Collections.sort(bList);
		for (Bike bike : bList) {

			System.out.println(bike);
		}

		System.out.println("--------------------------");
		Iterator<Bike> itr = bList.iterator();

		while (itr.hasNext()) {
			if (itr.next().getModelYear() < 2010) {
				itr.remove();
			}

		}
		for (Bike bike : bList) {

			System.out.println(bike);
		}
	}

}
