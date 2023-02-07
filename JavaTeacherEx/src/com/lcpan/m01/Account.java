package com.lcpan.m01;

public class Account {
	String accountNo;
	double balance;
	public void printAccData() {
		System.out.println("賬戶:"+accountNo);
		System.out.println("餘額:"+balance);
	}
	
	public static void main(String[] args) {
		Account a=new Account();
		a.accountNo="124654";
		a.balance=50000.0;
		a.printAccData();
		
				

	}

}
