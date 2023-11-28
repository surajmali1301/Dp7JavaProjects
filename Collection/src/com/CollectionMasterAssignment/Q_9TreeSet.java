package com.CollectionMasterAssignment;
//9. Output of TreeSet program
import java.util.Iterator;
import java.util.TreeSet;

public class Q_9TreeSet {

	public static void main(String[] args) {
		TreeSet map = new TreeSet();
		map.add("Jan");
		map.add("Feb");
		map.add("Mar");
		map.add("Apr");
		map.add("May");
		Iterator itr = map.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
