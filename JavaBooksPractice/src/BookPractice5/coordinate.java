package BookPractice5;

import java.util.Scanner;

public class coordinate {

	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入兩點坐標：");
		x = sc.nextInt();
		y = sc.nextInt();
		if (x <= 20 && y <= 20) {

			System.out.print("坐標在圓内");
		} else {

			System.out.print("坐標在圓外");
			sc.close();
		}

	}
	
}
