package BookPractice4;

import java.util.Scanner;

public class square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("輸入小於10的整數 ");
		int x = sc.nextInt();
		double square=x*x;
		System.out.println(x+"的平方是："+square);
		double cube=x*x*x;
		System.out.print(x+"的立方是："+cube);
		  sc.close();
	}

}
