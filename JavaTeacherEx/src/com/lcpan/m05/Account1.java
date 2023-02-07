package com.lcpan.m05;

public class Account1 {
	String accountNo;
	double balance;

	public void printAccData() {
		System.out.print(accountNo+",");
		System.out.print(balance);
	}

	public static void main(String[] args) {
		Account1 a1 = new Account1();
		a1.accountNo="123123";
		a1.balance=50000.0;
		a1.printAccData();
	}

}
