package homework1;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入月份：");
		int month = sc.nextInt();
		switch (month) {
		case 1, 2, 3:
			System.out.println('春');
			break;
		case 4, 5, 6:
			System.out.println('夏');
			break;
		case 7, 8, 9:
			System.out.println('秋');
			break;
		case 10, 11, 12:
			System.out.println('冬');
			break;
		default:
			System.out.println("輸入錯誤");// 這裏要用雙引號代表string

		}
		sc.close();
	}
}