package com.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {

		List<Integer> st = new ArrayList<>();

		st.add(13);
		st.add(07);
		st.add(20);

		System.out.println(st);

		for (int i = 0; i < st.size(); i++) {
			int data = (int) st.get(i)+10;
			st.set(i, data);
		}
		System.out.println(st);
	}

}
