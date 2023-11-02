package com.ArrayList;

//
import java.util.ArrayList;

public class SortL {

	static void sort(ArrayList<Integer>list) {
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j< list.size(); j++) {
				if (list.get(i)>list.get(j)) {
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(10);
		list1.add(13);
		list1.add(19);
		list1.add(12);
		list1.add(11);
		
		sort(list1);
		System.out.println(list1);
	}

}
