package com.Final_Keyword;

 class Devloper {

	String eName;
	final float salary;
	final static int noOfHours;
	final String cName;

	static {
		noOfHours = 8;
	}
	{
		cName = "Nintendo";
	}

	public Devloper() {
		salary = 20000f;
	}
	public Devloper(String eName,float salary) {
		this.eName=eName;
		this.salary=salary;
	}
	public float getSalary() {
		return salary;
	}
	public String getEName() {
		return eName;
	}
	

}

class JavaDevloper extends Devloper {
	
	final int expYear;
	public JavaDevloper(String eName,float salary,int expYear) {
		super(eName,salary);
		this.expYear=expYear;
	}
	public int getExpYear() {
		return expYear;
	}
	
	

}

public class FinalDemo {

	public static void main(String[] args) {

		JavaDevloper d = new JavaDevloper("Suraj",30000f,1);
		System.out.println(d.getEName()+" "+d.getSalary()+" "+d.getExpYear());
	}
}
