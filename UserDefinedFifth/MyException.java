package com.userdef;

public class MyException extends Exception{
	String str1;
	public MyException(String str2){
		this.str1=str2;
		}
		public String toString() {
			return("Output Strig is: " +str1);
		}
}
