package Pattern_Assignment;

public class LeftAngled_Combination {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 9; i >= 1; i-=2) {
//			System.out.print(i+" ");
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}


	}
}
