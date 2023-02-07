package com.lcpan.m05;

public  class Employee {//類別
	int empno; //成員變數
	String name; 

	public void printData() {//方法。區域變數
		System.out.print("Empno = " + empno);
		System.out.println(", Name = " + name);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empno = 111;
		emp.name = "Tom";
		emp.printData();
	
	}
}
