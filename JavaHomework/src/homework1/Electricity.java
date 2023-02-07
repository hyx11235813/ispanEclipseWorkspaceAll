package homework1;

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("營業用輸入0，非營業輸入1 : ");
		int use = sc.nextInt();

		System.out.print("輸入度數：");
		double kwh = sc.nextDouble();

		if (use == 0) {
			if (kwh <= 120) {
				kwh = kwh * 1.63;
			} else if (kwh > 120 && kwh <= 330) {
				kwh = 120 * 1.63 + (kwh - 120) * 2.10;
			} else if (kwh > 330 && kwh <= 500) {
				kwh = 120 * 1.63 + 110 * 2.10 + (kwh - 330) * 2.89;
			} else if (kwh > 500 && kwh <= 700) {
				kwh = 120 * 1.63 + 110 * 2.10 + 170 * 2.89 + (kwh - 500) * 3.49;
			} else if (kwh > 700 && kwh <= 1000) {
				kwh = 120 * 1.63 + 110 * 2.10 + 170 * 2.89 + 200 * 3.94 + (kwh - 700) * 4.60;
			} else if (kwh > 100) {
				kwh = 120 * 1.63 + 110 * 2.10 + 170 * 2.89 + 200 * 3.94 + 300 * 4.60 + (kwh - 1000) * 5.03;
			}
			System.out.println(kwh + "元");

		} else if (use == 1) {
			if (kwh <= 300) {
				kwh = kwh * 2.12;
			} else if (kwh > 300 && kwh <= 700) {
				kwh = 330 * 2.12 + (kwh - 330) * 2.19;
			} else if (kwh > 700 && kwh <= 1500) {
				kwh = 330 * 2.12 + 370 * 2.19 + (kwh - 700) * 3.44;
			} else if (kwh > 1500) {
				kwh = 330 * 2.12 + 370 * 2.19 + 800 * 3.44 + (kwh - 1500) * 5.05;
			}
			System.out.println(kwh + "元");
		} else
			System.out.println("error");
		sc.close();
	} // use1

}
