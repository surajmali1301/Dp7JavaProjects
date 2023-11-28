package com.Collect;

public class DepartMent {

	private int id;
	private String deptName;
	
	public DepartMent() {
		
	}
	public DepartMent(int id, String deptName) {
		this.id = id;
		this.deptName = deptName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "DepartMent [id=" + id + ", deptName=" + deptName + "]";
	}
	
}
