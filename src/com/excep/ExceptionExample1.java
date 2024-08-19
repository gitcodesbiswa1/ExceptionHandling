package com.excep;

public class ExceptionExample1 {
	int x;

	public void m1() {
		System.out.println("Value of x is: "+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample1 obj= new ExceptionExample1();
		
		try {
			for(int i=0;i<5;i++) {
				Thread.sleep(1000);
				obj.m1();
			}	
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}
