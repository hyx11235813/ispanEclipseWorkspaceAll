package BookPractice6for;

public class PrimeNumber {

	public static void main(String[] args) {
		int j;
		for (int i = 1; i <= 20; i++) {
			for (j = 2; j <= i; j++) {//j不能是1,因爲任何數字除1都是餘0
				if (i % j == 0) {
					break;
				}
			}
			if (j == i) {
				System.out.println(i);

			}
		}
	}

}
