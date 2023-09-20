package com.containment_Assignment;

public class Dept {

	public int deptId;
	public String deptName;
	MyDate md;
	
	Dept(){
		
	}
	Dept(int deptId,String deptName,MyDate md){
		this.deptId=deptId;
		this.deptName=deptName;
		this.md=md;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public MyDate getMd() {
		return md;
	}
	public void setMd(MyDate md) {
		this.md = md;
	}
	
}
