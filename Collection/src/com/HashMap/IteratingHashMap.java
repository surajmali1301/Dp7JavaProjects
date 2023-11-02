package com.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Shraddha".compareTo("Sonali"));
		//if first character is same it compares 2nd character 
		HashMap<String, Double> hm = new HashMap<String, Double>();

		hm.put("Neha", 89.0);
		hm.put("DPT", 90.0);
		hm.put("Shivam", 78.0);
		hm.put("Pratiksha", 79.0);
		hm.put("Vishal", 84.0);

		// 1st Way
		System.out.println(hm);

		// 2nd Way
		System.out.println("========================");

		Set<String> keys = hm.keySet();

		for (String s : keys) {
			System.out.println(s);
		}

		System.out.println("----------------------------");
//3rd Way
		Iterator<String> itr = keys.iterator();

		while (itr.hasNext()) {
			String s = itr.next();

			System.out.println(s + "-------->" + hm.get(s));

		}
		System.out.println("------------------------------");
		// 4th Way

		Collection<Double> marks = hm.values();

		for (Double double1 : marks) {
			System.out.println(double1);
		}
		System.out.println("--------------------------");
////		5th Way
		System.out.println("--------------------------");
		// 6th Way

		for (Map.Entry<String, Double> e : hm.entrySet()) {
			System.out.println(e.getKey() + "---->" + e.getValue());
		}
	}

}

//
//		Set<Entry<String, Double>> enteries = hm.entrySet();
//
//		for (Entry<String, Double> e : enteries) {
//			System.out.println(e.getKey() + "==" + e.getValue());
//		}