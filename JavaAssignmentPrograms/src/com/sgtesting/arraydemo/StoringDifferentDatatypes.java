package com.sgtesting.arraydemo;

import java.util.Arrays;
class Human
{
	static int b;
	 Human()
	 {
		 int a=10;
		 b=20;
	 }
}

public class StoringDifferentDatatypes {

	public static void main(String[] args) {
	//	Human Hu=new Human();
	//	System.out.println());
		
		Object a[]= {"Lion",1,2.5,'Z',true,false};
		System.out.println(Arrays.toString(a));
		System.out.println(Human.b);
	}
}
