package homework3;

public class MaxMin {
	public static void main(String[] args) {

		int[] array = { 1, 3, 3, 4, 5, 6, 7, 8, 9, 10 };
		int min = array[0];// 區域變數所以必須放這裏，下面的print才能使用
		for (int i = 0; i < array.length; i++) {

			if (array[i] < min) {
				min = array[i];
			}

		}
		System.out.println(min);

	    int[] array1 = { 1,2, 3, 3, 4, 5, 6, 7, 8, 9, 10 };
		int max = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array[i] > max) {
				max = array1[1];
			}

		}
		System.out.println(max);

	}

}
