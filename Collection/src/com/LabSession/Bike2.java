package com.LabSession;

import java.util.Comparator;

class Bike2 {
	int id;
	String name;
	double price;

	public Bike2(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

//	    @Override
//	    public int compareTo(Bike2 b) {
//	        if (this.price < b.price) {
//	            return -1;
//	        } else if (this.price > b.price) {
//	            return 1;
//	        } else {
//	            int nameComparison = this.name.compareTo(b.name);
//	            
//	            if (nameComparison == 0) {
//	                return Integer.compare(this.id, b.id);
//	            } else {
//	                return nameComparison;
//	            }
//	        }
//	    }

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
