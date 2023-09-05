package Pattern_Assignment;

public class abPattern {

	public static void main(String[] args) {

		for (char i = 1; i <= 3; i+=1) {
			for (int j = 1; j <= (3 - i); j++) {
				System.out.print(" ");
			}

			for (char j = 1; j <=(2*i)-1; j++) {
				System.out.print("ab ");

			}
			System.out.println();
		}

	}

}
