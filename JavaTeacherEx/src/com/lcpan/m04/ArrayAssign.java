package com.lcpan.m04;

public class ArrayAssign {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6 };
		int[] data1 = data; //等於是跟data共用同一份資料
		for (int i = 0; i < data.length; i++)
			data[i] *= 10;
		for (int i = 0; i < data1.length; i++)
			System.out.println(data1[i]);//意思是data1的i等於data

	}

}
