package com.lcpan.m04;

public class popp {

	
	static int factoral(int num) {
		int result=1;
		for(int i=num;i>1;i--) {
			result*=i;
			
		}return result;
	}

	public static void main(String[] args) {
		System.out.println(factoral(5));

	}

}
