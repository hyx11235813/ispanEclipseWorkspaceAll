package BookPractice20;

import java.util.*;

public class ForScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {

			try {
				System.out.println("輸入2個數字");
				int x = sc.nextInt();
				int y = sc.nextInt();
				sc.nextLine();
				System.out.println("除法結果：" + (x / y));
				System.out.println("輸入y繼續或n退出");
				String z = sc.next();
				if (z.equals("n")) {
					break;
				} else if (z.equals("y"))
					continue;
				else {
					System.out.println("輸入錯誤，程式停止");
					break;
				}

			} catch (InputMismatchException e) {

				System.out.println("輸入類型錯誤的異常" + e);
				
			} catch (ArithmeticException e) {

				System.out.println("除數為0的異常" + e);
			}sc.close();
			sc.nextLine();
		}
		 
	} 
}
