package com.TQ;

class Student {

	int id;
	String name;
	float fees;
	
	Student(){
		
	}

	Student(int id, String name, float fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
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

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}
	
	

}

class ColleageStudent extends Student {

	int semNo;
	String cName;
	
	ColleageStudent(){
		
	}

	ColleageStudent(int id, String name, float fees, int semNo, String cName) {
		super(id, name, fees);
		this.semNo = semNo;
		this.cName = cName;
	}


	public void setSemNo(int semNo) {
		this.semNo = semNo;
	}

	public int getSemNo() {
		return semNo;
	}

	public void setCName(String cName) {
		this.cName = cName;
	}

	public String getCName() {
		return cName;
	}

	void payFees() {
		System.out.println("Monthly fees: "+fees);
		System.out.println("Colleage HalfYearly Fees: " + (fees*6));
	}
	
	void show() {
		System.out.println("ColleageStudent Id: "+id+"\nStudent Name: "+name+"\nStuentMonthlyFees: "+fees
				+"\nColleageName: "+cName+"\nStudent Sem: "+semNo);
	}
}

class SchoolStudent extends Student {

	int std;
	String schoolName;
	
	SchoolStudent(){
		
	}

	SchoolStudent(int id, String name, float fees, int std, String schoolName) {
		super(id, name, fees);
		this.std = std;
		this.schoolName = schoolName;

	}


	public void setStd(int std) {
		this.std = std;
	}

	public int getStd() {
		return std;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}
	
	void show() {
		System.out.println("SchoolStudent Id: "+id+"\nStudent Name: "+name+"\nStuentMonthlyFees: "+fees
				+"\nSchoolName: "+schoolName+"\nStudent Standard: "+std);
	}

	void payFees() {
		System.out.println("Monthly fees: "+fees);
		System.out.println("School HalfYearly Fees: " + (fees*6));
	}
}

public class StudentMain {
	public static void main(String[] args) {
		SchoolStudent s = new SchoolStudent(10,"Aniket",5000f,8,"ABC");
		s.show();
		s.payFees();
		
		System.out.println("----------------------------------------");
		
		ColleageStudent cs = new ColleageStudent();
		cs.setId(1);
		cs.setName("Hrishi");
		cs.setSemNo(6);
		cs.setCName("XYZ");
		cs.setFees(10000f);
		cs.show();
		cs.payFees();
	}
}
