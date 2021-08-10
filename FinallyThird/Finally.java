package com.finallycl;

public class Finally {
	public void finallyClause() {
		try {
			System.out.println("try block:");
			int data=15/0;
			System.out.println(data);
		}
		catch(ArithmeticException e) {
			System.out.println("catch block:");
			System.out.println(e);
		}
		finally {
			System.out.println("finally block is executed:");
		}
		System.out.println("rest of the code continues.");
	}
}
