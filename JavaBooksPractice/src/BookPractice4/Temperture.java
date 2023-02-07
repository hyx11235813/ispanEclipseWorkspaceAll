package BookPractice4;

import java.util.Scanner;

public class Temperture {

	public static void main(String[] args) {
		double c, f;
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入華氏溫度：");
		f = sc.nextDouble();
		c = (f - 32) * 5 / 9;

		System.out.printf("攝氏溫度溫度是：%1.2f",c);
		  sc.close();
	}

}
