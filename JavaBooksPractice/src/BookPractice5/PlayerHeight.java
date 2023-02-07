package BookPractice5;

import java.util.Scanner;

public class PlayerHeight {

	public static void main(String[] args) {
		int height;
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入身高（公分）");
		height = sc.nextInt();
		if (height >= 200) {

			System.out.print("這是中鋒人選");
		} else if (height >= 192 && height <= 199) {
			System.out.print("這是前鋒人選");
		} else if (height <= 192) {
			System.out.print("這是後衛人選");
			sc.close();
		}
	}

}
