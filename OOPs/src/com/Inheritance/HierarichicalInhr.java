package com.Inheritance;

class Student {
	private int sId;
	private String sName;

	Student() {
	
	}

	public Student(int sId, String sName) {
		this.sId = sId;
		this.sName = sName;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}


	public String toString() {
		return "sId=" + sId + ", sName=" + sName;
	}
	
}

	class SchoolStudent extends Student{
		private String scName;
		private float fees;
		
		SchoolStudent(){
			super();
		}

		public SchoolStudent(int sId, String sName, String scName, float fees) {
			super(sId, sName);
			this.scName=scName;
			this.fees=fees;
		}

		public String getScName() {
			return scName;
		}
		public void setScName(String scName) {
			this.scName = scName;
		}

		public float getFees() {
			return fees;
		}
		public void setFees(float fees) {
			this.fees = fees;
		}

		@Override
		public String toString() {
			return super.toString()+"\nSchool Details\nscName=" + scName + ", fees=" + fees;
		}
		
	}

	class ColleageStudent extends Student {

		private String university;
		private int sem;
		private String course;
		private float cFees;

		ColleageStudent(int sId, String sName,String university, int sem, String course,float cFees) {
			super(sId, sName);
			this.university = university;
			this.sem = sem;
			this.course = course;
			this.cFees=cFees;
		}

		public String getUniversity() {
			return university;
		}

		public void setUniversity(String university) {
			this.university = university;
		}

		public int getSem() {
			return sem;
		}

		public void setSem(int sem) {
			this.sem = sem;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}
		

		public float getcFees() {
			return cFees;
		}

		public void setcFees(float cFees) {
			this.cFees = cFees;
		}

		public String toString() {
			return super.toString() + ", University=" + university + ", Semester " + sem + ", Course " + course+", Fees"+cFees;
		}

	}

	public class HierarichicalInhr {

		public static void main(String[] args) {
			SchoolStudent ss = new SchoolStudent(1,"Sanket","ASC",20000f);
			ColleageStudent cs = new ColleageStudent(21,"Suraj","DBATU",3,"Btech(comp)",50000f);
			
			System.out.println(ss);
			System.out.println();
			System.out.println(cs);
		}
	}


