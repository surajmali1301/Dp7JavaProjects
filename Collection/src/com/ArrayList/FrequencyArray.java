package com.ArrayList;

import java.util.ArrayList;

public class FrequencyArray {

	static void calFreq(ArrayList<String> list) {

		int count;

		for (int i = 0; i < list.size(); i++) {
			count = 1;

			if (list.get(i).equals("V")) {
				continue;
			}
			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).equals(list.get(j))) {

					count++;
					list.set(j, "V");
				}

			}//i
			System.out.println(list.get(i) + "----------" + count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> str = new ArrayList<String>();
		
		str.add("C");
		str.add("B");
		str.add("D");
		str.add("A");
		calFreq(str);
	}

}
