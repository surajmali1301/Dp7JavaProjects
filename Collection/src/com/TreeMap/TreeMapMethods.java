package com.TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TreeMap<Integer, String> tmap = new TreeMap<>();
		
		tmap.put(1, "Pralay");
		tmap.put(1, "Vishal");
		tmap.put(1, "Vishal");
		tmap.put(1, "Shivam");
		
		System.out.println(tmap);
		
		System.out.println(tmap.firstKey());
		System.out.println(tmap.lastKey());
		
		SortedMap<Integer,String> s1 = tmap.subMap(3,6);
		System.out.println(s1);
		
		SortedMap<Integer,String> s2 = tmap.headMap(3);
		System.out.println(s2);
		
		SortedMap<Integer,String> s3 = tmap.tailMap(1);
		System.out.println(s3);
}

}
