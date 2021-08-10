package com.userss;
import com.throwsex.ExampleThrows;
public class MainThrows {
	public static void main(String[] args) {
		try {
			ExampleThrows obj=new ExampleThrows();
			obj.myMethod(1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
}
}
