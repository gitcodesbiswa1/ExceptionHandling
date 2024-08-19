package com.excep;

public class UncheckedException_TrycatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=10/2;
			System.out.println("Division result is :"+x);
		}
		catch(ArithmeticException e) {
			System.out.println("Something went wrong. Please check the exception"+ e.getMessage());
		}
		finally {
			System.out.println("This is finally block");
		}
	}

}
