package com.TreeMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer, String> tmap = new TreeMap<>();
		
		tmap.put(9, "Pralay");
		tmap.put(2, "Vishal");
		tmap.put(4, "Pralay");
		tmap.put(3, "Shivam");
		
		System.out.println(tmap);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(70);
		al.add(80);
		al.add(50);
		al.add(1);
		
		System.out.println(al);
		System.out.println("-----------");
//		Collections.sort(al.)
//		System.out.println("-------------");
//		
//		Set<Integer> keys = tmap.keySet();
//		Iterator<Integer> itr = keys.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		
//		System.out.println("-------------");
//		
//		for(Entry<Integer, String> e:tmap.entrySet()) {
//			System.out.println(e.getKey()+"--"+e.getValue());
//		}
//		
//		System.out.println("-------------");
//		
//		Set<Entry<Integer,String>> e = tmap.entrySet();
//		
//		for(Entry<Integer,String> r:e) {
//			System.out.println(r.getKey()+"---"+r.getValue());
//		}
//		
//		System.out.println("-------------");
//		
//		NavigableMap<Integer,String> ns = tmap.descendingMap();
//		
//		for(Map.Entry<Integer, String> e2:ns.entrySet()) {
//			System.out.println();
//		}
	}

}
