package com.HashMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {


		HashMap<String,Double> hm = new HashMap<>();
		
		System.out.println(hm.isEmpty());
		
		hm.put("Pralay", 79.0);
		hm.put(null, 0.0);

		System.out.println(hm.put(null, 79.0));
		
		hm.put("Neha", 89.0);
		hm.put("DiPTi", 90.0);
		hm.put("Shivam", 78.0);
		hm.put("Pratiksha", 79.0);
		hm.put("Vishal", 84.0);

		System.out.println(hm);
		
		System.out.println("Size: "+hm.size());
		
		//get
		
		System.out.println("Mark of Pralay: "+hm.get("Pralay"));
		
		System.out.println("Suraj: "+hm.containsKey("Suraj"));
		System.out.println("Pratiksha: "+hm.containsKey("Pratiksha"));
		
		System.out.println("89.6: "+hm.containsValue(89.6));
		
		//putIfAbsent
		
		System.out.println(hm.putIfAbsent("Neha", 65.3));
		
		System.out.println(hm);

		System.out.println(hm.putIfAbsent("Suraj", 78.3));
		
		System.out.println(hm);
	}

}
