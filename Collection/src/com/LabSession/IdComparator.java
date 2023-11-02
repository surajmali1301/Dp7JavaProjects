package com.LabSession;

import java.util.Comparator;

class IdComparator implements Comparator<Bike2> {

	@Override
	public int compare(Bike2 b1, Bike2 b2) {
		if (b1.id < b2.id)
			return -1;
		if (b1.id > b2.id)
			return 1;
		return 0;
	}
}
