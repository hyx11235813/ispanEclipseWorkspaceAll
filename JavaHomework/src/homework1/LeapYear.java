package homework1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入年份: ");
		int year = sc.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) { // 2
				if (year % 400 == 0) { // 3
					System.out.println("是潤年");
				} else
					System.out.println("是潤年");
			} else
				System.out.println("是潤年");
		} else
			System.out.println("不是潤年");
		sc.close();
	}

}
