package BookPractice5;

import java.util.Scanner;

public class Monday {

	public static void main(String[] args) {
		int day = 0, days;
		Scanner sc = new Scanner(System.in);
		System.out.print("今天是星期日，請輸入天數：");
		days = sc.nextInt();
		day += (7 + days) % 7;

		System.out.print(days + "天後是星期" + day);
		sc.close();
	}

}
