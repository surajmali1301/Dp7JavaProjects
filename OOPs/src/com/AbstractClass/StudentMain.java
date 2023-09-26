package com.AbstractClass;

abstract class Student{
	
	int id;
	String name;
	float fees;
	static float discount;
	
	static {
		discount=10f;
	}
	Student(){
		
	}
	Student(int id,String name,float fees){
		this.id=id;
		this.name=name;
		this.fees=fees;
	}
	
	static float giveDiscount() {
		return discount;
	}
	abstract void description();
	
	
	static float giveDiscount(int dis)
	{
		discount= dis;
		return discount;
	}
	
	public final void display()
	{
		System.out.println("Discount on Course: "+discount+"%");
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Student Id: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("CourseFees : "+fees);
		System.out.println("Discounted cost: "+ (fees- ((discount/100)*fees)));
	}
}

class DanceStudent extends Student{
	
	String time;
	String danceStyle;
	
	DanceStudent(){
		
	}
	
	DanceStudent(int id,String name,float fees,String time,String danceStyle){
		super(id,name,fees);
		this.time=time;
		this.danceStyle=danceStyle;
	}
	@Override
	void description() {

		System.out.println("Class Time: "+time);
		System.out.println("Dance Style: "+danceStyle);
	}
}

class MusicStudent extends Student{
	
	String time;
	String musicStyle;
	
	
	MusicStudent(){
		
	}
	MusicStudent(int id,String name,float fees,String time,String musicStyle){
		super(id,name,fees);
		this.time=time;
		this.musicStyle=musicStyle;
	}
		@Override
		void description() {

			System.out.println("Class Time: "+time);
			System.out.println("Music Style: "+musicStyle);
		}
	
}
public class StudentMain {

	public static void main(String[] args) {

		Student.giveDiscount(10);

		DanceStudent d = new DanceStudent(1,"Suraj",20000f,"7am To 12pm","HipHop");
		d.display();
		d.description();
		
		MusicStudent m = new MusicStudent(7,"Suraj",30000f,"1pm To 4pm","Rock");
		m.display();
		m.description();
	}

}
