package BookPractice7array;

public class Sigma {

	public static void main(String[] args) {
		int[] arr = { 1100, 652, 946, 821, 955, 1024, 1155 };

		double average;
		double sum = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			sum += arr[i];

		}
		average = sum / arr.length;

		System.out.printf("平均值 = %.2f",average);
	}

}
