package BookPractice7array;

public class Weather {

	public static void main(String[] args) {
		int[][] temp = { { 30, 28, 29, 31, 33, 35, 32 }, // 最高溫
				{ 20, 21, 19, 22, 23, 24, 20 } };// 最低低
		// String[] s={"最高溫","最低溫"};

		double max = 0;
		double min = Double.MAX_VALUE;

		for (int i = 0; i < temp.length; i++) { // 2列
			for (int j = 0; j < temp[i].length; j++) {// 7行
				if (temp[0][j] > max) {
					max = temp[i][j];
				}
				if (temp[1][j] < min) {
					min = temp[1][j];
				}

			}

		}
		System.out.println("最高溫=" + max);
		System.out.println("最低溫=" + min);
		System.out.print("每天平均溫度 ： ");
		for (int i = 0; i < temp[0].length; i++) {//爲了要知道行的長度
			double high = temp[0][i];//00,01...
			double low = temp[1][i];//10,11...
			double average = (high + low) / 2.0;
			System.out.printf("%.2f" + " ", average);
		}

	}

}
