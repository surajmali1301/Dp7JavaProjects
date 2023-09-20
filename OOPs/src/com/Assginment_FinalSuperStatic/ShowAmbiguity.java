package com.Assginment_FinalSuperStatic;

class Ambiguity {

    // Method with one int parameter
    public void print(int num) {
        System.out.println("Method with one int parameter: " + num);
    }

    // Method with one double parameter
    public void print(double num) {
        System.out.println("Method with one double parameter: " + num);
    }

}

public class ShowAmbiguity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Ambiguity obj = new Ambiguity();
			
			// This will cause ambiguity error
			// obj.print(10);
			
			// This will also cause ambiguity error
			// obj.print(10.0);
		}

	}


