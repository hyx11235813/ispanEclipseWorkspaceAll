package BookPractice6for;

import java.util.Scanner;

public class GuessNum {

	public static void main(String[] args) {
		int num = 35;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("請猜1~99的數字,輸入0放棄：");
			int guess = sc.nextInt();
			if (guess == 0 || guess == 0) {

				System.out.println("放棄");
				break;
			}
			count++;
			if (num != guess) {
				if (num < guess) {
					System.out.println("猜小一點");

				} else {
					System.out.println("猜大一點");

				}

			} else {
				System.out.println("恭喜答對");
				System.out.println("總共猜了" + count + "次");
				break;

			}
		}sc.close();

	}

}
