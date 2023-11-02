package com.LabSession;

import java.util.Comparator;

public class PriceComparator implements Comparator<Bike2>{

	@Override
	public int compare(Bike2 b1, Bike2 b2) {
		if (b1.price < b2.price)
			return -1;
		if (b1.price > b2.price)
			return 1;
		return 0;
	}
}
