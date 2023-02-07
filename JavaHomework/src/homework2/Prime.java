package homework2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入一正整數：");
		int num = sc.nextInt();
		int j;
		for (int i = 1; i <= num; i++) {// 1~num
			for (j = 2; j < i; j++) {//
				if (i % j == 0) {// 如果i夠被j整除，就接著判斷是否除數等於被除數
					break;
				}
			}
			if (i == j) {// 如果除數等於被除數,所以是質數
				System.out.println(i);
			}
		}
		sc.close();
	}
}