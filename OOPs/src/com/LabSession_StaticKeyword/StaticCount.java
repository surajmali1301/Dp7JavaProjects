package com.LabSession_StaticKeyword;

class StaticDemo {

	int i = 10;
	static int j = 20;

	static {
		j++;
	}
	{
		i++;
	}

	static void show() {
		j++;
		System.out.println(j);
	}
}

public class StaticCount {

	public static void main(String[] args) {

		StaticDemo s1 = new StaticDemo();
		System.out.println(s1.i);

		StaticDemo.show();

	}

}
