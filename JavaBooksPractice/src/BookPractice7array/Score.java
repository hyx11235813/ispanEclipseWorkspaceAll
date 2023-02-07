package BookPractice7array;

import java.util.Scanner;
import java.util.ArrayList; //如果不確定輸入的資料有多少可以用arrayList

public class Score {

	public static void main(String[] args) {
		ArrayList<Integer> score = new ArrayList<>(); // 建立arrayList
		Scanner sc = new Scanner(System.in);

		System.out.println("如果輸入負分數則輸入結束");

		int input = 0;
		while (input != -1) { // input 不是-1時會持續執行
			System.out.println("請輸入分數");
			input = sc.nextInt();
			if (input != -1) {
				score.add(input); // 如果輸入不是-1的資料，就加入list
			}
		}
		double num = 0;
		double average = 0;
		System.out.println("筆數 = " + score.size()); // 讀取list裏面總共有幾筆資料
		for (int scores : score) { // for each
			num += scores;
			average = num / score.size();

		}
		System.out.printf("平均分數=%.2f", average);

		int higher = 0;
		int lower = 0;
		for (int scores : score) {
			if (scores > average) {
				higher++; // for each每筆資料，如果有高於平均就加一
			} else if (scores < average) {
				lower++;
			}
		}
		System.out.println("高於平均分數人數" + higher);
		System.out.println("低於平均分數人數" + lower);
		sc.close();
	}

}
