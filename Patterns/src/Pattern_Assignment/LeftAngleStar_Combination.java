package Pattern_Assignment;

public class LeftAngleStar_Combination {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			} 
			System.out.println();
		}
		for (int i = 4; i >= 1; i--) {
//			System.out.print(i+" ");
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}

	}

