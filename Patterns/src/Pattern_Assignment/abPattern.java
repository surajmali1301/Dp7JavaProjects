package Pattern_Assignment;

public class abPattern {

	public static void main(String[] args) {

		for (char i = 1; i <= 5; i++) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print(" ");
			}

			char ch = 'A';
			for (char j = 1; j <= i; j++) {
				System.out.print("ab");
				ch++;
			}
			System.out.println();
		}

	}

}