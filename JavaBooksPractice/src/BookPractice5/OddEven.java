package BookPractice5;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入整數：");
		num = sc.nextInt();

		if (num == 0) {
			System.out.println("輸入是0");
		} else if (num % 2 == 0) {

			System.out.println("輸入是偶數");
		}else {

			System.out.println("輸入是奇數");
		}  sc.close();
	}
}
