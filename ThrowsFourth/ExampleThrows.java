package com.throwsex;

import java.io.*;

public class ExampleThrows {
	public void myMethod(int num) throws IOException,ClassNotFoundException{
		if(num==1) {
			throw new IOException("IOException Occured");
		}
		else {
			throw new ClassNotFoundException("ClassNotFoundException");
		}
	}
}
