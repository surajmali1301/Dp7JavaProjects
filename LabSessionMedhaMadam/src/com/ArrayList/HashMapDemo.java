package com.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//give count of month that contains same number of days
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();
		map.put("Jan", 31);
		map.put("feb", 28);
		map.put("mar", 31);
		map.put("apr", 30);
		map.put("jun", 31);
		map.put("jul", 31);

		HashMap<Integer, Integer> map2 = new HashMap<>();
		
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			if(map2.containsKey(e.getValue())) {//checks value
				map2.put(e.getValue(), map2.get(e.getValue())+1);//value is present count increases
			}
			else {
				map2.put(e.getValue(),1);//value is occuring 1st time give count 1 to value
			}
		}
		System.out.println(map2);
	}

}
