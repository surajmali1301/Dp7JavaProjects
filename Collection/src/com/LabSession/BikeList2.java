package com.LabSession;

import java.util.ArrayList;
import java.util.Collections;


public class BikeList2 {

	public static void main(String[] args) {

		ArrayList<Bike2> bl = new ArrayList<>();

		bl.add(new Bike2(1, "TVS", 150000f));
		bl.add(new Bike2(2, "YamaHa", 90000f));
		bl.add(new Bike2(3, "Suzuki", 70000f));
		bl.add(new Bike2(4, "Ninja", 1500000f));

		Collections.sort(bl, new PriceComparator());
		 System.out.println("Sort By Price: ");
        for (Bike2 bike : bl) {
            System.out.println(bike);
        }
        
        System.out.println("-----------------");
        Collections.sort(bl, new NameComparator());
        System.out.println("Sort By Name:: ");
        for (Bike2 bike : bl) {
            System.out.println(bike);
        }
       
        System.out.println("-----------------");
        Collections.sort(bl, new IdComparator());

        System.out.println("Sort By Id: ");
        for (Bike2 bike : bl) {
            System.out.println(bike);
        }
	}
}
