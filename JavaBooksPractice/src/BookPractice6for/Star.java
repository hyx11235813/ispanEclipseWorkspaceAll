package BookPractice6for;

public class Star {

	public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (j == i) {

					System.out.println(" ");
				}
			}
		}

	}

}
