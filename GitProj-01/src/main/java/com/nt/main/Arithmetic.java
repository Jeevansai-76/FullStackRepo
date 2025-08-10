package com.nt.main;

public class Arithmetic {

	public void sum(double a,double b) {
		//Performing Addition
		System.out.println(a+b);
	}
	
	public void sub(double a,double b) {
		System.out.println(a-b);
	}
	
	public static void main(String[] args) {
		System.out.println("Arithmetic.main()");
		Arithmetic ath = new Arithmetic();
		ath.sum(10, 20);
		ath.sub(20, 10);
	}

}
