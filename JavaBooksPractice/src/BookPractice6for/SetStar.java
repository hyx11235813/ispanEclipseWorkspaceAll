package BookPractice6for;

import java.util.Scanner;

public class SetStar {

	public static void main(String[] args) {
		int height, width;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入高度：");
		height = sc.nextInt();
		System.out.println("請輸入寬度：");
		width = sc.nextInt();
		for (int i = 1; i <= height; i++) {// 決定要跑幾次loop，也就是高度

			for (int j = 1; j <= width; j++) { // 決定要印幾次，也就是寬度
				System.out.print("*");
				if (j == width) {
					System.out.println(""); // 達到寬度就換行
				}
			}
		}
		sc.close();
	}

}
