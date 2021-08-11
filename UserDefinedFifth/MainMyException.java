package com.userss;

import com.userdef.MyException;

public class MainMyException {
	public static void main(String[] args) {
		try {
			throw new MyException("This is a message");
		}
		catch(MyException e) {
			System.out.println(e);
		}
	}
}
