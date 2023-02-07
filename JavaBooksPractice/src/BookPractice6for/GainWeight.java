package BookPractice6for;

public class GainWeight {

	public static void main(String[] args) {

		double weight = 50;
		double gain = 1.2;
		for (int i = 1; i <= 10; i++) {
			weight += gain;
			System.out.printf("第 %d 年本體重%.1f\n", i, weight);
		}
	}

}
