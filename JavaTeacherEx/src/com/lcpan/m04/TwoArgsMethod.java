package com.lcpan.m04;

public class TwoArgsMethod {
	
	static int sum(int x, int y) {
        int z;
        z = x + y;
        return z; 
    } // end of sum()
	
    public static void main(String[] args) {
        int a = 5, d = 6, c;
        c = sum(a, d);    
        System.out.println(a + "+" + d + "=" + c);
    }

}
