package homework2;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入一正整數：");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + ",");
			}
		}
		sc.close();
	}
}
