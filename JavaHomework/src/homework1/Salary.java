package homework1;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salary;
		System.out.print("請輸入時數：");
		int hours = sc.nextInt();
		System.out.print("請輸入時薪：");
		int wage = sc.nextInt();

		if (hours <= 60) {
			salary = hours * wage;
			System.out.println(salary);
		} else if (hours > 60 && hours <= 80) {
			salary = 60 * wage + (hours - 60) * wage * 1.25;// salary必須是double才能乘1.25
			System.out.println(salary);
		} else if (hours > 80) {
			salary = 60 * wage + (20 * wage * 1.25) + (hours - 80) * 150 * 1.5;
			System.out.println(salary);
		}
		sc.close();
	}

}
