package com.Revision_Codes;


class ShapeMain{
	
	void shape(int i,int b,int h) {
		System.out.println("Volume of rectangle: "+(i*b*h));
	}
	
	void shape(int cube) {
		System.out.println("Volume of Square: "+(cube*cube*cube));
	}
	void shape(int h,int r) {
		float pi =3.14f;
		System.out.println("Volume of Cylinder: "+(pi*r*r*h));
	}

	public static void main(String[] args) {
		
		ShapeMain s1= new ShapeMain();
		s1.shape(5,5,5);
		
		ShapeMain s2= new ShapeMain();
		s2.shape(10);
		
		ShapeMain s3 = new ShapeMain();
		s3.shape(10, 5);

//		s3.shape("Square");
	}

}
