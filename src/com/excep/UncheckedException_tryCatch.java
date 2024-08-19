package com.excep;

public class UncheckedException_tryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program started");
		
	try {
		int x=10/0;
		System.out.println("Division Result is: "+x);
	}
	catch(ArithmeticException ex) {
		System.out.println("Something went wrong"+ ex.getMessage());
	}
	System.out.println("This is outside");
}
}
