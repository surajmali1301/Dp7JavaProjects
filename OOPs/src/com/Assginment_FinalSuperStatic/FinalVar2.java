package com.Assginment_FinalSuperStatic;

class FinalStaticVar {

    final static int FINAL_STATIC_VARIABLE;

    static {
        FINAL_STATIC_VARIABLE = 100;
    }

    // Default constructor
    public FinalStaticVar() {
        // This constructor can be used, but it won't affect FINAL_STATIC_VARIABLE
    }

    // Parameterized constructor (just for demonstration)
    public FinalStaticVar(int value) {
        // This constructor can be used, but it won't affect FINAL_STATIC_VARIABLE
    }

    // Instance method
    public void printFinalStaticVariable() {
        System.out.println("Final Static Variable Value: " + FINAL_STATIC_VARIABLE);
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Static Method");
    }

}

public class FinalVar2 {

	public static void main(String[] args) {
		FinalStaticVar obj = new FinalStaticVar();
		obj.printFinalStaticVariable(); // Output: Final Static Variable Value: 100
		
		FinalStaticVar.staticMethod(); // Output: Static Method
	}
}
