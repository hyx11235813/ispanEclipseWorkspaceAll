package homework2;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = "123";
		int count = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.print("請輸入密碼：");
			String input = sc.next();
			if (input.equals(password)) {
				System.out.print("密碼輸入正確，歡迎使用本系統！");
				break;
			} else {
				count += 1;
			}
		}
		if (count == 3) {
			System.out.print("密碼輸入超過三次！");
			sc.close();
		}

	}

}
