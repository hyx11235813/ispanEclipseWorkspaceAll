package BookPractice5;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身高（公分）：");
		double height = sc.nextInt();

		System.out.print("請輸入體重（公斤）：");
		double weight = sc.nextInt();

		double bmi = weight / ((height / 100) * (height / 100));

		System.out.printf("BMI:%1.2f\n", bmi);
		if (bmi < 18.5) {
			System.out.print("體重過輕");
		} else if (bmi >= 18.5 && bmi < 24) {

			System.out.print("體重正常");
		} else if (bmi >= 24 && bmi < 28) {

			System.out.print("體重超重");
		} else if (bmi >= 28) {

			System.out.print("體重肥胖");
			sc.close();
		}
	}

}
