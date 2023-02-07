package BookPractice4;

import java.util.Scanner;

public class Mile {

	public static void main(String[] args) {
		float mile;
		double km;
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入英里:");
		mile = sc.nextFloat();
		km = mile / 0.62137;

		System.out.printf("公里是:%1.2f",km);
		  sc.close();
	}
}
