package com.Set;

import java.util.HashSet;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Item> hs = new HashSet<>();
		hs.add(new Item(1,"Sugar",34));
		hs.add(new Item(2,"Choclate",70));
		hs.add(new Item(3,"BisCuit",120));
		hs.add(new Item(4,"Chips",50));
		hs.add(new Item(1,"Sugar",34));
		hs.add(new Item(7,"Ghee",250));
		
		for(Item i:hs) {
			System.out.println(i);
		}
	}

}
