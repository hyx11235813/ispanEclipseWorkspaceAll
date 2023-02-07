package com.lcpan.m05;

public class Account {//類別
	String accountNo;//成員變數
	double balance;

	public Account(String accountNo, double balance) {//建構子
		this.accountNo = accountNo;//this指定到class的實例
		this.balance = balance;
	}

	public void printAccData() { //方法
		System.out.print(accountNo+",");
		System.out.print(balance);
	}

	public static void main(String[] args) { 
		Account a = new Account("123123", 50000.0);//產生實例
		a.printAccData();
	}

}
