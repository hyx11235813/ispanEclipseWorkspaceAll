package com.lcpan.m03;

public class NestedFor {
	public static void main(String[] args) {
 		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.print(i + "*" + j + "=" + i * j + "\t"); //雙引號
			System.out.print("\n");//print代表不換行 ,ln代表印一次占据一行
		}
	}
}
