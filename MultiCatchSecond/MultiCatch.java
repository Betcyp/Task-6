package com.multi;
public class MultiCatch{
	public void multi() {
		try {
			int array[]=new int[8];
			array[8]=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("normal flow..");
	}
}
