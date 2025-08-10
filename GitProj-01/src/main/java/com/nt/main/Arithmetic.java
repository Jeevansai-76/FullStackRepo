package com.nt.main;

public class Arithmetic {

	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		System.out.println("Arithmetic.main()");
		Arithmetic ath = new Arithmetic();
		ath.sum(10, 20);
	}

}
