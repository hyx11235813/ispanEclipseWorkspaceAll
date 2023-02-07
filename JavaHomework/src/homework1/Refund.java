package homework1;

import java.util.Scanner;

public class Refund {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int thousand = 0, fivehundred = 0, hundred = 0, fifty = 0, ten = 0, five = 0;
		System.out.print("輸入實付金額金額： ");
		int paid = sc.nextInt();
		System.out.print("輸入應付金額金額： ");
		int payable = sc.nextInt();

		int change = paid - payable;
		if (paid < payable) {
			System.out.println("金額不足");
		}
		if (paid == payable) {
			System.out.println("不必找錢");
		}
		if (paid > payable) {// 找錢
			while (change != 0) {
				if (change > 1000) {
					thousand = change / 1000;
					change %= 1000;
					System.out.println(thousand + "張千元");

				}
				if (change >= 500) {
					fivehundred++;
					change %= 500;
					System.out.println(fivehundred + "張五百元");
				}
				if (change >= 100) {
					hundred = change / 100;
					change %= 100;

					System.out.println(hundred + "張一百元");
				}
				if (change >= 50) {
					fifty++;
					change %= 50;

					System.out.println(fifty + "個五十元");
				}
				if (change >= 10) {
					ten = change / 10;
					change %= 10;

					System.out.println(ten + "個十元");
				}
				if (change >= 5) {
					five++;
					change %= 5;

					System.out.println(five + "個元");
				}
				if (change > 0) {

					System.out.println(change + "個一元");
					break;
				}

			}
		}
		sc.close();
	}
}
