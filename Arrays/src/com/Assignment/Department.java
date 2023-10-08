package com.Assignment;

public class Department {

	private int dId;
	private String dName;
	
	Department(){
		
	}
	
	Department(int dId,String dName){
		this.dId=dId;
		this.dName=dName;
	}

	
	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getDName() {
		return dName;
	}

	public void setDName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + "]";
	}
	
	
}
