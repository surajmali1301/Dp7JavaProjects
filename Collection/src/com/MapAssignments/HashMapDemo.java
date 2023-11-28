package com.MapAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		/*
		 * 1. WAP to add elements to a HashMap without using generics (ie do not use <>)
		 * and print content of it. Use Integer as Key and String as Value. In second
		 * HashMap add elements of String type as Key and Integer as Value.
		 */
//		HashMap hmap = new HashMap();
//		hmap.put(1, null);
//		hmap.put(2, "Java");
//		hmap.put(3, ".net");
//		hmap.put(4, "python");
//		HashMap hmap2 = new HashMap();
//		hmap2.put(".net",1);
//		hmap2.put("java",2);
//		hmap2.put("c++",3);
//		hmap2.put("Python",4);

		HashMap<Integer, String> hMap = new HashMap<>();

		hMap.put(1, "Kailas");
		hMap.put(2, "Pralay");
		hMap.put(4, "Anuj");
		hMap.put(54, "Vishal");
		hMap.put(11, "Hrishikesh");

		/*
		 * 3. WAP to add elements to a HashMap using generics with Integer as Key and
		 * String as value. And 4 key-value Map. Entry
		 * 
		 * for(Map.Entry<Integer, String> ent : hMap.entrySet()) {
		 * System.out.println(ent.getKey()+"--"+ent.getValue()); }
		 */

//5.WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value values
//		Set<Entry<Integer, String>> e = hMap.entrySet();
//		
//		for (Entry<Integer, String> e1 : e) {
//			System.out.println(e1.getKey()+" ---"+e1.getValue());
//		}

		// 6. WAP to get only the Keys from a HashMap

		Set<Entry<Integer, String>> enteries = hMap.entrySet();

		for (Entry<Integer, String> e : enteries) {
			System.out.println(e.getKey());
		}

		// 7. WAP to get only the Values from a HashMap
		Set<Entry<Integer, String>> e = hMap.entrySet();

		for (Entry<Integer, String> e1 : e) {
			System.out.println(e1.getValue());
		}

	}

}
