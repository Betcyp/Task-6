package com.exeptions;
public class ArraySize{
	public void arrayNegative(){
	try
	{
	int array[] = new int[3];
	for(int i=0;i<array.length;++i) {
		System.out.println(array[i]);
	}
	}
	catch(NegativeArraySizeException n)
	{
		System.out.println(" generated exception : " +n);
	}
	System.out.println("normal flow..");
	}
}