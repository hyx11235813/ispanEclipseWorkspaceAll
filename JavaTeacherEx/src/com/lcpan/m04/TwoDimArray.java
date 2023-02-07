package com.lcpan.m04;

public class TwoDimArray {
	public static void main(String[] args) {
		int sum = 0;
		int[][] arr = { { 2, 6, 1 }, { 4, 3, 5 } };
		
		for (int i = 0; i < arr.length; i++)//length =2
			for (int j = 0; j < arr[i].length; j++)//i = column ,length=3
				sum += arr[i][j];
		System.out.println("sum = " + sum);
	}
}
