package BookPractice7array;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		int[] arr = { 23, 99, 38, 9, 10, 22, 87, 25, 77 };
		int max = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("最大值 = " + max);
		int min = arr[0];
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.print("最小值 = " + min);

		Arrays.sort(arr);
//		if (arr.length % 2 == 0) {
//			int mid1 = arr.length / 2;
//			int mid2 = arr.length / 2 - 1;
//			double mid = (mid1 + mid2) / 2.0;
//			System.out.println("中間值為: " + mid);
//		}
		int mid1 = (arr.length - 1) / 2;
		int mid = (arr[mid1]);
		System.out.print("中間值 = " + mid);
	}

}
