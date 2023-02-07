package BookPractice6for;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double principal, years;
		double interest, sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入存款本金:");
		principal = sc.nextInt();
		System.out.println("請輸入存款年數:");
		years = sc.nextInt();
		System.out.println("請輸入存款年利率:");
		interest = sc.nextDouble();
		for (int i = 1; i <= years; i++) {
			sum = principal * (0.015 + 1);// 第一年的本金和

			System.out.printf("第%d年本金和%.1f\n", i, sum);
			principal = sum; // 把第一年的本金和變成本金，產生複利，sum一樣是0
		}
		sc.close();
	}

}
