package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Access Order
		LinkedHashMap<String ,Double> lhm = new LinkedHashMap<>(16,0.75f,true);
		
		lhm.put("Suraj",89.0);
		lhm.put("Harshda", 76.0);
		lhm.put("Pralay",87.0);
		lhm.put("Pratiksha", 76.0);
		lhm.put("Shivam",89.0);
		lhm.put("Vishal", 76.0);
		
		for (Map.Entry<String, Double> e : lhm.entrySet()) {
			System.out.println(e.getKey()+":"+e.getValue());	
		}
		
		System.out.println(lhm.get("Pralay"));
	}

}
