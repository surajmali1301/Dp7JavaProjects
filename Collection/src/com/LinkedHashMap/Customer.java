package com.LinkedHashMap;

public class Customer {

	private int id;
	private String name;
	private long mNo;

	public Customer(int id, String name, long mNo) {
		super();
		this.id = id;
		this.name = name;
		this.mNo = mNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getmNo() {
		return mNo;
	}

	public void setmNo(long mNo) {
		this.mNo = mNo;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mNo=" + mNo + "]";
	}

	
}
