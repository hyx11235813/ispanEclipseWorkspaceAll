package BookPractice5;

import java.util.Scanner;

public class WageCount {

	public static void main(String[] args) {
		int hours;
		final int hourlyWage = 150;
		int wage = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("請輸入本周工作時數：");
		hours = sc.nextInt();
		if (hours < 40) {
			wage += hours * hourlyWage * 0.8;
			System.out.print("本周薪資：" + wage);
		} else if (hours == 40) {
			wage += hours * hourlyWage;

			System.out.print("本周薪資：" + wage);
		} else if (hours > 40 && hours <= 50) {
			wage += hours * hourlyWage * 1.2;

			System.out.print("本周薪資：" + wage);
		} else {
			wage += hours * hourlyWage * 1.6;

			System.out.print("本周薪資：" + wage);
		}
		sc.close();

	}

}
