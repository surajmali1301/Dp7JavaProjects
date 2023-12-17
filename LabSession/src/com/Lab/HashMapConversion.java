package com.Lab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hMap = new HashMap<>();
		
		hMap.put(1, "Aniket");
		hMap.put(2, "Suraj");
		hMap.put(3, "Hrishikesh");
		hMap.put(4, "Kailas");
		hMap.put(5, "Shivam");
		hMap.put(1, "Vishal");
		hMap.put(1, "Anuj");
		
		HashSet<Map.Entry<Integer,String>> eList = new HashSet<>(hMap.entrySet());
		
		System.out.println(eList);
	}

}
