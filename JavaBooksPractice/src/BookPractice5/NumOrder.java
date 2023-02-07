package BookPractice5;

import java.util.Scanner;

public class NumOrder {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入三個整數（數字間用空白分開）:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		if (num1 >= num2 && num1 >= num3) {
			if (num2 >= num3) {
				System.out.print("大到小排列是:" + num1 + " " + num2 + " " + num3);
			} else {

				System.out.print("大到小排列是:" + num1 + " " + num3 + " " + num2);
			}

		} else if (num2 >= num1 && num2 >= num3) {
			if (num1 >= num3) {

				System.out.print("大到小排列是:" + num2 + " " + num1 + " " + num3);
			} else {

				System.out.print("大到小排列是:" + num2 + " " + num3 + " " + num1);
			}
		} else if (num3 >= num1 && num3 >= num2) {
			if (num2 >= num1) {

				System.out.print("大到小排列是:" + num3 + " " + num2 + " " + num1);
			} else {

				System.out.print("大到小排列是:" + num3 + " " + num1 + " " + num2);
			}
		}  sc.close();
	}
}
