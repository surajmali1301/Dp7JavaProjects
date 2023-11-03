package com.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListConversion {

	public static void createMap(ArrayList<String> list) {
		
		HashMap<String, Integer> h1 = new HashMap<>();
		
		for (String str : list) {
			if(h1.containsKey(str)) {
				h1.put(str, h1.get(str)+1);
			}
			else {
				h1.put(str, 1);
			}
		}
		for (Map.Entry<String, Integer> e : h1.entrySet()) {
			System.out.println(e.getKey()+"------>"+e.getValue());
			
		}
	}
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("A");
		al.add("A");
		
		createMap(al);
		
	}
}
