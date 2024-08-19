package com.excep;

public class ExceptionExample2 {
	int x=143;
	public void m1() {
		System.out.println("Value of x is: "+ x);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ExceptionExample2 ex= new ExceptionExample2();
		ex.m1();
		Thread.sleep(0);
		
	}

}
